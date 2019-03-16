package br.com.webcrawler.webcrawler;

import java.util.ArrayList;
import java.util.List;

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
    		ConsultaPublicaPage page = new ConsultaPublicaPage();
    		for (int i = 0; i < 10; i++) {
    			page.realizarConsultar(codigos.get(20));
    			linhas.add(page.getTabelaInfraEstruturaBasica(codigos.get(i)));
    		}
    		 CsvUtils.writeCsv(linhas);
    		
		}
    	 
}
