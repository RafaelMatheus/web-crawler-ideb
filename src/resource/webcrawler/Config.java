package webcrawler;

import java.io.File;

public class Config {
	public static String pathFile = new File("").getAbsolutePath()+"\\src\\resource\\pernambuco.csv";
	public static String chromeDrive = new File("").getAbsolutePath()+"\\src\\resource\\chromedriver.exe";
	public static String enderecoSite = "http://idebescola.inep.gov.br/ideb/consulta-publica";
	public static String pathFileAfter = new File("").getAbsolutePath()+"\\src\\resource\\webcrawler.csv";
}
