package br.com.webcrawler.webcrawler;

import java.util.ArrayList;
import java.util.List;

import common.Config;
import dao.ConfigDao;
import dao.InfraEstruturaBasicaDao;
import model.ConfigModel;
import model.InfraEstruturaBasicaModel;
import page.ConsultaPublicaPage;
import utils.CsvUtils;

/**
 * 
 * @author Rafael Castro
 *
 */
public class App {

	public static void main(String[] args) throws InterruptedException {
		int i = 0;
		List<String> codigos = CsvUtils.getCodFromCsv();
		List<InfraEstruturaBasicaModel> infraBasica = new ArrayList<InfraEstruturaBasicaModel>();

		ConsultaPublicaPage page = new ConsultaPublicaPage();
		try {

			for (i = 1; i < Config.qntRegistros + 1; ++i) {
				System.out.println("Realizando consulta com o código: " + codigos.get(i));
				System.out.println("Quantidade de linhas percorridas = " + i);
				page.realizarConsultar(codigos.get(i));
				InfraEstruturaBasicaDao.save(page.getTabelaInfraEstrutura(codigos.get(i)));
			}

		} catch (Exception e) {
			e.printStackTrace();
			ConfigDao.save(new ConfigModel(i));
		} finally {
			CsvUtils.writeCsvByInfra(infraBasica);
		}
	}
}
