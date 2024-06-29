package io.pushpakjaiswal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PokedexInitiatorDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Pushpak");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		pokemon p = entityManager.find(pokemon.class,"Pikachu");
//		pokemon p1 = entityManager.find(pokemon.class,"Bulbasur");
//		pokemon p2 = entityManager.find(pokemon.class, "Charizard");
		
		entityTransaction.begin();
		entityManager.remove(p);
		entityTransaction.commit();
	}

}
