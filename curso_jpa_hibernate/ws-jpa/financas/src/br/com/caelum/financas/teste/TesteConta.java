package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setId(7);
		conta.setTitular("Fabio Jr.");
		conta.setBanco("660 - BANCO DE SP");
		conta.setAgencia("9845");
		conta.setNumero("87465-3");
		
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
		
		conta = em.find(Conta.class, 7);
		
		em.remove(conta);
		
		em.getTransaction().commit();
		em.close();
	}
}
