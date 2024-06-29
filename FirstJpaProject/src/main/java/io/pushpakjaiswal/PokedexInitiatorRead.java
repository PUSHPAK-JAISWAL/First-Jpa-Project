package io.pushpakjaiswal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PokedexInitiatorRead {
	
	public static void main(String args[]) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Pushpak");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		pokemon p = entityManager.find(pokemon.class, "Pikachu");
		pokemon p1 = entityManager.find(pokemon.class,"Bulbasur");
		pokemon p2 = entityManager.find(pokemon.class, "Charizard");
		
		
		System.out.println(p);
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
