package io.pushpakjaiswal.entityrelationships;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Pushpak2");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Student s1 =entityManager.find(Student.class, 1);
		
		System.out.println(s1.getName()+" "+s1.getCard().getSoftwareVersion()+" "+s1.getCard().getCardNumber());
	}

}
