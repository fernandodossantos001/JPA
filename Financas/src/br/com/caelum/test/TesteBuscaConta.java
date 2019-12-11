package br.com.caelum.test;

import javax.persistence.EntityManager;

import br.com.caelum.model.Conta;
import br.com.caelum.util.JpaUtil;

public class TesteBuscaConta {

	public static void main(String[] args) {
		EntityManager em = JpaUtil.getEntityManager().createEntityManager();
		
		em.getTransaction().begin();
		Conta find = em.find(Conta.class, 1);
		find.setNumero("12345");
		System.out.println(find.getTitular());
		em.getTransaction().commit();
		
		em.close();
	}

}
