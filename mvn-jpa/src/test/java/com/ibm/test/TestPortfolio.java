package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.dao.PortfolioDao;
import com.ibm.entity.Department;
import com.ibm.entity.Portfolio;

public class TestPortfolio {
	
	private static PortfolioDao pdao;
	
	@BeforeAll
	public static void setup() {
		pdao = new PortfolioDao();
	}
	
	@Test
	public void testAddPortfilio() {
		Portfolio p = new Portfolio();
		assertNotEquals(0, pdao.addPortfolio(101));
	}
	
	@Test
	public void testFindPortfolio() {
		Portfolio p = pdao.getPortfolio(101);
		assertNotNull(p);
		p.getShares().forEach(System.out::println);
		System.out.println(p);
	}
	
}
