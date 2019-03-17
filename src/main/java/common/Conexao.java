package common;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	private static EntityManagerFactory factory;

	private static EntityManagerFactory getEntityManagerFactory() {
			   
		return factory = Persistence.createEntityManagerFactory("webcrawler"); 

	}
	
	public static EntityManager getEntityManager(){
		EntityManager manager = getEntityManagerFactory().createEntityManager();
		return manager;
	}
}
