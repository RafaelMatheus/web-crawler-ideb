package br.com.webcrawler.webcrawler;

import java.util.ArrayList;
import java.util.List;

import common.Config;
import dao.InfraEstruturaBasicaDao;
import model.InfraEstruturaBasicaModel;
import page.ConsultaPublicaPage;
import utils.CsvUtils;

/**
 * 
 * @author Rafael Castro
 *
 */
public class App 
{
  
    	public static void main(String[] args) throws InterruptedException {
    		List<String> codigos =  CsvUtils.getCodFromCsv();
    		List<String []> linhas = new ArrayList<String[]>();
    		List<InfraEstruturaBasicaModel> infraBasica = new ArrayList<InfraEstruturaBasicaModel>();
    		
    		ConsultaPublicaPage page = new ConsultaPublicaPage();
    		for (int i = 1; i < Config.qntRegistros+1; i++) {
    			page.realizarConsultar(codigos.get(20));
    			infraBasica.add(page.getTabelaInfraEstrutura(codigos.get(i)));
    			System.out.println("Quantidade de linhas percorridas = "+ i);
    		}
//    		 CsvUtils.writeCs(linhas);
    		 CsvUtils.writeCsvByInfra(infraBasica);
    		 InfraEstruturaBasicaDao.save(infraBasica);
    		
    	
		}
}
