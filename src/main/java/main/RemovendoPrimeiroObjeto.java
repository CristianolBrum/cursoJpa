package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Cliente;

public class RemovendoPrimeiroObjeto {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Cliente cliente = em.find(Cliente.class, 2L);
		em.remove(cliente);
		em.getTransaction().commit();
		em.close();
		System.out.println("Objeto removido com sucesso");
	}

}
