package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Cliente;

public class AtualizandoPrimeiroObjeto {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Cliente cliente = em.find(Cliente.class, 1L);
		cliente.setNome("Pau no cu do caralho");
		em.merge(cliente);
		em.getTransaction().commit();
		em.close();
		System.out.println("Objeto alterado com sucesso");
	}
}
