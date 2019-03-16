package br.com.webcrawler.webcrawler;

import java.util.ArrayList;
import java.util.List;

import page.ConsultaPublica;
import utils.CsvUtils;

/**
 * Hello world!
 *
 */
public class App 
{
  
    	public static void main(String[] args) throws InterruptedException {
    		List<String> codigos =  CsvUtils.getCodFromCsv();
    		List<String []> linhas = new ArrayList<String[]>();
    		ConsultaPublica page = new ConsultaPublica();
    		for (int i = 0; i < 100; i++) {
    			page.realizarConsultar(codigos.get(20));
    			linhas.add(page.getTabelaInfraEstruturaBasica(codigos.get(i)));
    		}
    		 CsvUtils.writeCsv(linhas);
    		
		}
    	 
}
