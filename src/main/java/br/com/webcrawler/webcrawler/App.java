package br.com.webcrawler.webcrawler;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import common.Conexao;
import dao.InfraEstruturaBasicaDao;
import model.TestModel;
import page.ConsultaPublicaPage;
import utils.CsvUtils;
import webcrawler.Config;

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
    		ConsultaPublicaPage page = new ConsultaPublicaPage();
    		for (int i = 1; i < 100; i++) {
    			page.realizarConsultar(codigos.get(20));
    			linhas.add(page.getTabelaInfraEstruturaBasica(codigos.get(i)));
    		}
    		 CsvUtils.writeCsv(linhas);
    		 InfraEstruturaBasicaDao.save(Config.infras);
    		
    	
		}
}
