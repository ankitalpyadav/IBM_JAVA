package com.ibm.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ibm.entity.Movie;
import com.ibm.entity.Multiplex;

public class MovieDao {
	private EntityManagerFactory factory;
	
	public MovieDao() {
		factory = Persistence.createEntityManagerFactory("MyJPA");
	}
	
	public int addMultiplex(Multiplex m) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		em.persist(m);
		txn.commit();
		em.close();
		return m.getMpex_id();
	}
	
	public int addMovie(Movie m) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		em.persist(m);
		txn.commit();
		em.close();
		return m.getMovid();
	}
	
	public boolean addMovietoMultiplex(int movId, int mpexId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
		txn.begin();
		
		Multiplex mp = em.find(Multiplex.class, mpexId);
		Movie m = em.find(Movie.class, movId);
		
		m.getMultiplexes().add(mp);
		
		txn.commit();
		return true;
		}
		catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
		finally {
			em.close();
		}
		
	}
	
	public Multiplex findMultiplex(int mpexId) {
		EntityManager em = null;
		try {
			em = factory.createEntityManager();
			Multiplex mp = em.find(Multiplex.class, mpexId);
			return mp;
		}
		finally {
			em.close();
		}
	}
	
	public Movie findMovie(int movId) {
		EntityManager em = null;
		try {
			em = factory.createEntityManager();
			Movie m = em.find(Movie.class, movId);
			return m;
		}
		finally {
			em.close();
		}
	}
	
}
