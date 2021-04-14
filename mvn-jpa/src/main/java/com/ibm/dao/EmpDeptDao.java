package com.ibm.dao; 

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ibm.entity.Department;
import com.ibm.entity.Employee;

public class EmpDeptDao {
	private EntityManagerFactory factory;
	
	public EmpDeptDao() {
		factory = Persistence.createEntityManagerFactory("MyJPA");
	}
	
	public int addDept(Department d) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		em.persist(d);
		txn.commit();
		em.close();
		return d.getDeptId();
	}
	
	public int addEmp(Employee e, int depId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		Department d = em.find(Department.class, depId);
		e.setDept(d);
		em.persist(e);
		txn.commit();
		em.close();
		return e.getEmpId();
	}
	
	public Department findDept(int deptId) {
		EntityManager em = null;
		try {
			em = factory.createEntityManager();
			Department d = em.find(Department.class, deptId);
			return d;
		}
		finally {
			em.close();
		}
	}
	
	public boolean removeDept(int deptId) {
		EntityManager em = null;
		EntityTransaction txn = null;
		try {
			em = factory.createEntityManager();
			txn= em.getTransaction();
			txn.begin();
			Department d = em.find(Department.class, deptId);
			em.remove(d);
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
	
	public boolean removeEmp(int empId) {
		EntityManager em = null;
		EntityTransaction txn = null;
		try {
			em = factory.createEntityManager();
			txn= em.getTransaction();
			txn.begin();
			Employee e = em.find(Employee.class, empId);
			em.remove(e);
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
