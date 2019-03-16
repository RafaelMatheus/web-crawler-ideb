package common;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("webcrawler");

	private static EntityManagerFactory getEntityManagerFactory() {
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory("webcrawler");
		}
		return factory;
	}
	
	public static EntityManager getEntityManager(){
		EntityManager manager = getEntityManagerFactory().createEntityManager();
		return manager;
	}
}
