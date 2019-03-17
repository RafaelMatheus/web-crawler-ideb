package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cofiguracoesRec")
public class ConfigModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int qntLinhasPercorridas;

	public ConfigModel(int qntLinhasPercorridas) {
		super();
		this.qntLinhasPercorridas = qntLinhasPercorridas;
	}

	public ConfigModel() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQntLinhasPercorridas() {
		return qntLinhasPercorridas;
	}

	public void setQntLinhasPercorridas(int qntLinhasPercorridas) {
		this.qntLinhasPercorridas = qntLinhasPercorridas;
	}

}
