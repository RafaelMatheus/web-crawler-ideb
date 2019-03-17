package dao;

import javax.persistence.EntityManager;

import common.Conexao;
import model.ConfigModel;

public class ConfigDao {
	private static EntityManager em = Conexao.getEntityManager();

	public static void save(ConfigModel config) {
		em.getTransaction().begin();
		em.persist(config);
		em.getTransaction().commit();
		em.close();
	}
}
