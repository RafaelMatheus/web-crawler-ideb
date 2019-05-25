package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import common.Conexao;
import model.ConfigModel;

public class ConfigDao {
	private static EntityManager em = Conexao.getEntityManager();

	public static void save(ConfigModel config) {
		config.setId(1);
		em.getTransaction().begin();
		em.merge(config);
		em.getTransaction().commit();
		em.close();
	}
	
	public static int get() {
		em.getTransaction().begin();
		ConfigModel con = em.find(ConfigModel.class, 1);
		em.getTransaction().commit();
		
		return con.getQntLinhasPercorridas();
	}
}
