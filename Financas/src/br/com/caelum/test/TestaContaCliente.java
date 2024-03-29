package br.com.caelum.test;

import javax.persistence.EntityManager;

import br.com.caelum.model.Cliente;
import br.com.caelum.model.Conta;
import br.com.caelum.util.JpaUtil;

public class TestaContaCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Cliente cliente2 = new Cliente();
		Conta conta = new Conta();
		
		cliente.setEndereco("Rua 321");
		cliente.setNome("Dougla");
		cliente.setProfissao("Arquiteto");
		
		cliente2.setEndereco("Rua 321");
		cliente2.setNome("Dougla");
		cliente2.setProfissao("Arquiteto");
		
		conta.setId(1);
		
		
		EntityManager em = JpaUtil.getEntityManager().createEntityManager();
		em.getTransaction().begin();
		
		cliente.setConta(conta);
//		cliente2.setConta(conta);
		
		em.persist(cliente);
//		em.persist(cliente2);
		
		
		em.getTransaction().commit();
		
		em.close();
	}

}
