package br.com.caelum.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.model.Movimentacao;
import br.com.caelum.util.JpaUtil;

public class TestJPAQL {
	public static void main(String[] args) {
		
		EntityManager em = JpaUtil.getEntityManager().createEntityManager();
		em.getTransaction().begin();
		
		String jpql = "select m from Movimentacao m where m.conta.id > 23";
		
		Query query = em.createQuery(jpql)	;
		
		List<Movimentacao> resultList = query.getResultList();
		
		for(Movimentacao m: resultList) {
			System.out.println(m.getDescricao());
			System.out.println(m.getConta().getId());
		}
			
		em.getTransaction().commit();
		em.close();
	}

}
