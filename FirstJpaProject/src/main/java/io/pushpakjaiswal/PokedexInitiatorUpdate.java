package io.pushpakjaiswal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PokedexInitiatorUpdate {
	
	public static void main(String args[]) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Pushpak");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		pokemon p = entityManager.find(pokemon.class,"Pikachu");
		pokemon p1 = entityManager.find(pokemon.class,"Bulbasur");
		pokemon p2 = entityManager.find(pokemon.class, "Charizard");
		
		if(p!=null) {
			p.setPower(200);
		}
		if(p1!=null) {
			p1.setPower(300);
		}
		if(p2!=null) {
			p2.setPower(400);
		}
		
		entityTransaction.begin();
		entityManager.persist(p);
		entityManager.persist(p1);
		entityManager.persist(p2);
		entityTransaction.commit();
		
	}

}
