package com.ibm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ibm.entity.Product;


public class ProductDao {
private EntityManagerFactory factory;
	
	public ProductDao() {
		factory = Persistence.createEntityManagerFactory("MyJPAPro");
	}
	
	public int addProduct(Product p) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		em.persist(p);
		txn.commit();
		em.close();
		
		return  p.getPid();
	}
	
	public Product findProduct(int pid) {
		EntityManager em = factory.createEntityManager();
		Product p = em.find(Product.class, pid);
		return p;
	}
	
	public Product updateProduct(Product p) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		
		em.merge(p);
		txn.commit();
		em.close();
		return p;
	}
	
	public boolean removeProduct(int pid) {
		EntityManager em = null;
		EntityTransaction txn = null;
		try {
			em = factory.createEntityManager();
			txn= em.getTransaction();
			txn.begin();
			
			Product p = em.find(Product.class, pid);
			em.remove(p);
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
}
