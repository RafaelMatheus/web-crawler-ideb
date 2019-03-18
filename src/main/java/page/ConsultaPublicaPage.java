package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BasePage;
import model.InfraEstruturaBasicaModel;

public class ConsultaPublicaPage extends BasePage {
	private WebElement inputCodEscola;

	private WebElement btnBuscar;

	private WebElement campoInfraEstruturaBasica;

	private WebElement aguaConsumidaPorAlunos;

	private WebElement abastecimentoDeAgua;

	private WebElement abastecimentoEletrica;
	
	private WebElement esgotoSanitario;
	
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

	public InfraEstruturaBasicaModel getTabelaInfraEstrutura(String codigoEscola) throws InterruptedException {
		if (isVisible()) {
			InfraEstruturaBasicaModel infra = new InfraEstruturaBasicaModel();
			infra.setcodEscola(codigoEscola);
			getPage().close();
			return infra;
		}
		campoInfraEstruturaBasica = getPage().findElement(By.xpath("//*[@id='target-collapseTree']/span"));
		clickJs(campoInfraEstruturaBasica);
		aguardarElemento(By.xpath("//*[@id='collapseTree']/div[1]/table/tbody/tr[1]/td[2]"));
		
		aguaConsumidaPorAlunos = getPage()
				.findElement(By.xpath("//*[@id='collapseTree']/div[1]/table/tbody/tr[1]/td[2]"));

		abastecimentoDeAgua = getPage().findElement(By.xpath("//*[@id='collapseTree']/div[1]/table/tbody/tr[2]/td[2]"));

		abastecimentoEletrica = getPage()
				.findElement(By.xpath("//*[@id='collapseTree']/div[1]/table/tbody/tr[3]/td[2]"));

		esgotoSanitario = getPage().findElement(By.xpath("//*[@id='collapseTree']/div[1]/table/tbody/tr[4]/td[2]"));

		banheiroPredio = getPage().findElement(By.xpath("//*[@id='collapseTree']/div[1]/table/tbody/tr[5]/td[2]"));
		
		banheiroFora = getPage().findElement(By.xpath("//*[@id='collapseTree']/div[1]/table/tbody/tr[6]/td[2]"));
		
		localFunc = getPage().findElement(By.xpath("//*[@id='collapseTree']/div[1]/table/tbody/tr[7]/td[2]"));

		InfraEstruturaBasicaModel infra = new InfraEstruturaBasicaModel(codigoEscola, aguaConsumidaPorAlunos.getText(),
				abastecimentoDeAgua.getText(), abastecimentoEletrica.getText(), esgotoSanitario.getText(), banheiroPredio.getText(),
				banheiroFora.getText(), localFunc.getText());
	
		getPage().close();

		return infra;

	}
	
	
}
