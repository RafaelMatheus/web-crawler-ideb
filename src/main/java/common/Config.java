package common;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import model.InfraEstruturaBasicaModel;

public class Config {
	public static String pathFile = new File("").getAbsolutePath()+"\\src\\resource\\pernambuco.csv";
	public static String chromeDrive = new File("").getAbsolutePath()+"\\src\\resource\\chromedriver.exe";
	public static String enderecoSite = "http://idebescola.inep.gov.br/ideb/consulta-publica";
	public static String pathFileAfter = new File("").getAbsolutePath()+"\\src\\resource\\webcrawler.csv";
	public static int qntRegistros = 2;
	
	public static List<InfraEstruturaBasicaModel> infras = new ArrayList<InfraEstruturaBasicaModel>();
}
