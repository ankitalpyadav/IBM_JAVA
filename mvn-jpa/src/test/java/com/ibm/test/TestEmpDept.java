package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.dao.AlbumDao;
import com.ibm.dao.EmpDeptDao;
import com.ibm.entity.Album;
import com.ibm.entity.Department;
import com.ibm.entity.Employee;

public class TestEmpDept {
	private static EmpDeptDao edao;
	
	@BeforeAll
	public static void setup() {
		edao =  new EmpDeptDao();
	} 
	
	@Test
	public void testAddDept() {
		Department d = new Department();
		d.setDeptId(2);
		d.setDeptName("CS");
		
		assertNotEquals(0, edao.addDept(d));
		
	}
	
	@Test
	public void testAddEmp() {
		Employee e = new Employee();

		e.setEmpName("Kelly");
		e.setSalary(40000);
		
		assertNotEquals(0, edao.addEmp(e, 2));
//		System.out.println(e);
	
	}
	
	@Test
	public void testFindDep() {
		Department d = edao.findDept(1);
		assertNotNull(d);
		System.out.println(d);
		d.getEmps().forEach(System.out::println);
//		System.out.println(d.getDeptId() + " " + d.getDeptName());
	}
	
	@Test
	public void testRemoveDep() {
		assertTrue(edao.removeDept(2));
//		assertTrue(edao.removeEmp(9));
	}
	
}
