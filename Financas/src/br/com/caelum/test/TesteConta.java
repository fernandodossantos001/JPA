package br.com.caelum.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.model.Conta;
import br.com.caelum.util.JpaUtil;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta = new Conta("Fernando Ribeiro", "123", "Itau","321",null);
		
		
		EntityManager em = JpaUtil.getEntityManager().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(conta);
		
		conta.setBanco("Safra");
		
		em.getTransaction().commit();
	    em.close();
	}

}
