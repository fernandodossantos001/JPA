package br.com.caelum.util;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.model.Movimentacao;

public class PopulaMovimentacao {
	public static void main(String[] args) {
		EntityManager em =  JpaUtil.getEntityManager().createEntityManager();
		
		List<Movimentacao> objetos = new ArrayList<Movimentacao>();
		em.persist(objetos);
	}

}
