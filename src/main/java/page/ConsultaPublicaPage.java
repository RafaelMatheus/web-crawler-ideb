package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BasePage;

public class ConsultaPublicaPage extends BasePage {
	private WebElement inputCodEscola;

	private WebElement btnBuscar;

	private WebElement campoInfraEstruturaBasica;

	private WebElement aguaConsumidaPorAlunos;
	
	private WebElement abastecimentoDeAgua;
	
	private WebElement abastecimentoEletrica;
	
	private WebElement banheiroPredio;
	
	private WebElement banheiroFora;
	
	private WebElement localFunc;

	public void realizarConsultar(String codigo) {
		setup();
		get();
		inputCodEscola = getPage().findElement(By.id("pkCodEntidade"));
		btnBuscar = getPage().findElement(By.id("btnSearch"));
		sendKey(inputCodEscola, codigo);
		subimit(btnBuscar);
	}

	public String [] getTabelaInfraEstruturaBasica(String codigoEscola) throws InterruptedException {
	   
		campoInfraEstruturaBasica = getPage().findElement(By.xpath("//*[@id='target-collapseTree']/span"));
		clickJs(campoInfraEstruturaBasica);
		Thread.sleep(7000);
		aguaConsumidaPorAlunos = getPage().findElement(By.xpath("//*[@id='collapseTree']/div[1]/table/tbody/tr[1]/td[2]"));
		abastecimentoDeAgua = getPage().findElement(By.xpath("//*[@id='collapseTree']/div[1]/table/tbody/tr[2]/td[2]"));
		abastecimentoEletrica = getPage().findElement(By.xpath("//*[@id='collapseTree']/div[1]/table/tbody/tr[2]/td[2]"));
		banheiroPredio = getPage().findElement(By.xpath("//*[@id='collapseTree']/div[1]/table/tbody/tr[4]/td[2]"));
		banheiroFora = getPage().findElement(By.xpath("//*[@id='collapseTree']/div[1]/table/tbody/tr[5]/td[2]"));
		localFunc = getPage().findElement(By.xpath("//*[@id='collapseTree']/div[1]/table/tbody/tr[7]/td[2]"));
		
		
		String[] valores =  {
				codigoEscola, 
				aguaConsumidaPorAlunos.getText(), 
				abastecimentoDeAgua.getText(), 
				abastecimentoEletrica.getText(), 
				banheiroPredio.getText(), 
				banheiroFora.getText(), 
				banheiroFora.getText(), 
				localFunc.getText()};
		
		getPage().close();
		return valores;
	}
}
