package br.com.caelum.test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.caelum.model.Categoria;
import br.com.caelum.model.Conta;
import br.com.caelum.model.Movimentacao;
import br.com.caelum.model.TipoMovimentacao;
import br.com.caelum.util.JpaUtil;

public class TestJPARelacionamento {
	public static void main(String[] args) {
		EntityManager em = JpaUtil.getEntityManager().createEntityManager();
		em.getTransaction().begin();
		
		Conta conta = new Conta("fernando", "123", "Bradesco", "123321");
		Movimentacao movimentacao = new Movimentacao(new BigDecimal("200.00"), TipoMovimentacao.ENTRADA, Calendar.getInstance(), "xpto", conta);
		Categoria categoria = new Categoria("Viagem");
		movimentacao.setCategorias(Arrays.asList(categoria));
		
		
		em.persist(categoria);
		em.persist(conta);
//		Categoria categoria2 = em.find(Categoria.class, 3);
		em.persist(movimentacao);
		
		em.getTransaction().commit();
		em.close();
		
	}
}
