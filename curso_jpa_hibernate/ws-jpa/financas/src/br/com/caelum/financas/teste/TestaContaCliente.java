package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Cliente;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TestaContaCliente {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Marcos");
		cliente.setEndereco("Rua dos Santos, 123");
		cliente.setProfissao("Arquiteto");
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Felicio");
		cliente2.setEndereco("Rua dos Santos, 321");
		cliente2.setProfissao("Eletricista");
		
		Conta conta = new Conta();
		conta.setId(2);
		
		cliente.setConta(conta);
		cliente2.setConta(conta);
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		em.persist(cliente);
//		em.persist(cliente2);
		
		em.getTransaction().commit();
		em.close();
		
	}
}
