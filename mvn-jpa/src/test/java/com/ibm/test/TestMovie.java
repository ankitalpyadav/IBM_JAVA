package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.dao.MovieDao;
import com.ibm.entity.Department;
import com.ibm.entity.Employee;
import com.ibm.entity.Movie;
import com.ibm.entity.Multiplex;

public class TestMovie {
	private static MovieDao mdao;
	
	@BeforeAll
	public static void set() {
		mdao = new MovieDao();
	}
	
	@Test
	public void testAddMultiplex() {
		Multiplex mp = new Multiplex();
		mp.setName("Inox");
		mp.setCity("Thane");
		
		assertNotEquals(0, mdao.addMultiplex(mp));
		
	}
	
	@Test
	public void testAddMovie() {
		Movie m = new Movie();
		m.setTitle("Tenet");
		m.setRating(4.5);
		
		assertNotEquals(0, mdao.addMovie(m));
	}
	
	@Test
	public void testMovietoMultiplex() {
		assertTrue(mdao.addMovietoMultiplex(16, 1001));
	}
	
	@Test
	public void testFindMultiplex() {
		Multiplex d = mdao.findMultiplex(1001);
		assertNotNull(d);
//		System.out.println(d);
		d.getMovies().forEach(System.out::println);
	}
	
	@Test
	public void testFindMovie() {
		Movie d = mdao.findMovie(16);
		assertNotNull(d);
		System.out.println(d);
		d.getMultiplexes().forEach(System.out::println);
	}
	
	
}