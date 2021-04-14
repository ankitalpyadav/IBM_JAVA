package com.ibm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ibm.entity.Portfolio;
import com.ibm.entity.Share;

public class PortfolioDao {
	
	private EntityManagerFactory factory;
	 
	public PortfolioDao() {
		factory = Persistence.createEntityManagerFactory("MyJPA");
	}
	
	public int addPortfolio(int pid) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		Portfolio p = new Portfolio();
		p.setPid(pid);
		p.setHolder("Polo");
		
		Share s1 = new Share();
		s1.setStock("IBM");
		s1.setQunatity(100);
		s1.setQuote(250);
		
		Share s2 = new Share();
		s2.setStock("Amazon");
		s2.setQunatity(100);
		s2.setQuote(750);
		
		p.getShares().add(s1);
		p.getShares().add(s2);
		em.persist(p);
		
		txn.commit();
		
		em.close();
		return pid;
		
	}
	
	public Portfolio getPortfolio(int pid) {
		EntityManager em = factory.createEntityManager();
		Portfolio p = em.find(Portfolio.class, pid);
		return p;
	}
}
