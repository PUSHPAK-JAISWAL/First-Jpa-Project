package io.pushpakjaiswal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PokedexInitiatorCreate {

	public static void main(String[] args) {
		
		pokemon p1 = new pokemon();

		p1.setName("Pikachu");
		p1.setPower(100);
		p1.setType("Electric");
		
		pokemon p2 = new pokemon();
		
		p2.setName("Bulbasur");
		p2.setPower(100);
		p2.setType("Grass");
		
		pokemon p3 = new pokemon();
		
		p3.setName("Charizard");
		p3.setPower(200);
		p3.setType("Fire");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Pushpak");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(p1);
		entityManager.persist(p2);
		entityManager.persist(p3);
		entityTransaction.commit();
		
		
	}

}
