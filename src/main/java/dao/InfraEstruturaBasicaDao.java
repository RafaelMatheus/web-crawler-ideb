package dao;

import java.util.List;

import javax.persistence.EntityManager;

import common.Conexao;
import model.InfraEstruturaBasicaModel;

public class InfraEstruturaBasicaDao {
	private static EntityManager em = Conexao.getEntityManager();

	public static void save(List<InfraEstruturaBasicaModel> infras) {
		for (InfraEstruturaBasicaModel infraEstruturaBasicaModel : infras) {
			em.getTransaction().begin();
			em.persist(infraEstruturaBasicaModel);
			em.getTransaction().commit();
		}
		em.close();
	}

	public static void save(InfraEstruturaBasicaModel infras) {

		em.getTransaction().begin();
		em.persist(infras);
		em.getTransaction().commit();

		em.close();
	}
}
