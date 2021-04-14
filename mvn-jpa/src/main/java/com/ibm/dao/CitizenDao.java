package com.ibm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ibm.entity.Citizen;
import com.ibm.entity.Passport;

public class CitizenDao {
	
	private EntityManagerFactory factory;
	
	public CitizenDao() {
		factory = Persistence.createEntityManagerFactory("MyJPA");
	}
	
	public Citizen addCitizen(Citizen c) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		Passport p = new Passport("India", 123456);
		c.setId(p);
		em.persist(c);
		
		txn.commit();
		em.close();
		
		return c;
		
	}
}
