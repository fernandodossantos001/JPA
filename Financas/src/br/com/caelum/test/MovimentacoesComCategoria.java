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

public class MovimentacoesComCategoria {
	
	public static void main(String[] Args) {
		
		EntityManager	em = JpaUtil.getEntityManager().createEntityManager();
		em.getTransaction().begin();
			
		Categoria categoria = new Categoria("Viagem");
		Categoria categoria2 = new Categoria("Negocios");
		Conta conta =  new Conta();
		conta.setId(2);
		
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setDataMovimentacao(Calendar.getInstance());
		movimentacao.setDescricao("Viagem a sao paulo");
		movimentacao.setTipo(TipoMovimentacao.SAIDA);
		movimentacao.setValor(new BigDecimal(100));
		movimentacao.setCategorias(Arrays.asList(categoria,categoria2));
		movimentacao.setConta(conta);
		
		Movimentacao movimentacao2 = new Movimentacao();
		movimentacao2.setDataMovimentacao(Calendar.getInstance());
		movimentacao2.setDescricao("Viagem ao Rio de Janeiro");
		movimentacao2.setTipo(TipoMovimentacao.SAIDA);
		movimentacao2.setValor(new BigDecimal(300));
		movimentacao2.setCategorias(Arrays.asList(categoria,categoria2));
		movimentacao2.setConta(conta);
		
		em.persist(categoria);
		em.persist(categoria2);
		em.persist(movimentacao);
		em.persist(movimentacao2);
	
		em.getTransaction().commit();
		
		em.close();
	
	}

}
