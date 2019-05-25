package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "infraBasica")
public class InfraEstruturaBasicaModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String codEscola;
	private String aguaConsumidaPorAlunos;
	private String abastecimentoDeAgua;
	private String abastecimentoEnergia;
	private String esgotoSanitario;
	private String banheiroPredio;
	private String banheiroFora;
	private String localFuncEscola;

	public InfraEstruturaBasicaModel(String codEscola, String aguaConsumidaPorAlunos, String abastecimentoDeAgua,
			String abastecimentoEnergia, String esgotoSanitario, String banheiroPredio, String banheiroFora,
			String localFuncEscola) {
		super();
		this.codEscola = codEscola;
		this.aguaConsumidaPorAlunos = aguaConsumidaPorAlunos;
		this.abastecimentoDeAgua = abastecimentoDeAgua;
		this.abastecimentoEnergia = abastecimentoEnergia;
		this.esgotoSanitario = esgotoSanitario;
		this.banheiroPredio = banheiroPredio;
		this.banheiroFora = banheiroFora;
		this.localFuncEscola = localFuncEscola;
	}

	public InfraEstruturaBasicaModel() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getcodEscola() {
		return codEscola;
	}

	public void setcodEscola(String codEscola) {
		this.codEscola = codEscola;
	}

	public String getAguaConsumidaPorAlunos() {
		return aguaConsumidaPorAlunos;
	}

	public void setAguaConsumidaPorAlunos(String aguaConsumidaPorAlunos) {
		this.aguaConsumidaPorAlunos = aguaConsumidaPorAlunos;
	}

	public String getAbastecimentoDeAgua() {
		return abastecimentoDeAgua;
	}

	public void setAbastecimentoDeAgua(String abastecimentoDeAgua) {
		this.abastecimentoDeAgua = abastecimentoDeAgua;
	}

	public String getAbastecimentoEnergia() {
		return abastecimentoEnergia;
	}

	public void setAbastecimentoEnergia(String abastecimentoEnergia) {
		this.abastecimentoEnergia = abastecimentoEnergia;
	}

	public String getEsgotoSanitario() {
		return esgotoSanitario;
	}

	public void setEsgotoSanitario(String esgotoSanitario) {
		this.esgotoSanitario = esgotoSanitario;
	}

	public String getBanheiroPredio() {
		return banheiroPredio;
	}

	public void setBanheiroPredio(String banheiroPredio) {
		this.banheiroPredio = banheiroPredio;
	}

	public String getBanheiroFora() {
		return banheiroFora;
	}

	public void setBanheiroFora(String banheiroFora) {
		this.banheiroFora = banheiroFora;
	}

	public String getLocalFuncEscola() {
		return localFuncEscola;
	}

	public void setLocalFuncEscola(String localFuncEscola) {
		this.localFuncEscola = localFuncEscola;
	}

}
