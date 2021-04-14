package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.dao.ProductDao;
import com.ibm.entity.Product;

public class TestProduct {
	
	private static ProductDao pdao;
	
	@BeforeAll
	public static void setup() {
		pdao = new ProductDao();
	}
	
	@Test
	public void testAddProduct() {
		Product p = new Product();
		p.setPname("iPhone");
		p.setPrice(50000);
		
		assertNotEquals(0, pdao.addProduct(p));
	}
	
	@Test
	public void testFindProduct() {
		Product p = pdao.findProduct(12);
		assertNotNull(p);
		System.out.println(p);
	}
	
	@Test
	public void testUpdateProduct() {
		Product p = new Product();
		p.setPid(12);
		p.setPname("Samsung");
		p.setPrice(50000);
		assertNotNull(pdao.updateProduct(p));
		System.out.println(p);
	}
	
	@Test
	public void testRemoveProduct() {
		assertTrue(pdao.removeProduct(15));
	}
}
