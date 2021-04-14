package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.dao.CitizenDao;
import com.ibm.entity.Citizen;
import com.ibm.entity.Passport;

public class TestCitizen {
	private static CitizenDao cdao;
	
	@BeforeAll
	public static void setup() {
		cdao = new CitizenDao();
	}
	
	@Test
	public void testAddCitizen() {
		Citizen c = new Citizen();
		c.setName("Darby");
		Citizen cp = cdao.addCitizen(c);
		assertNotNull(cp);
		System.out.println(cp);
//		assertNotEquals(0, cdao.addCitizen(c));
	}
}
