package com.ibm.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "mulseq", sequenceName = "seq_mpex", initialValue = 1001)
public class Multiplex {
	
	@Id
	@GeneratedValue(generator = "mulseq", strategy = GenerationType.SEQUENCE)
	private int mpex_id;
	@Column(length = 20)
	private String name;
	@Column(length = 15)
	private String city;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name = "show_time",
	joinColumns = {@JoinColumn(name = "mpex_id")},
	inverseJoinColumns = {@JoinColumn(name = "mov_id")})
	private Set<Movie> movies = new HashSet<Movie>();

	public int getMpex_id() {
		return mpex_id;
	}

	public void setMpex_id(int mpex_id) {
		this.mpex_id = mpex_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Set<Movie> getMovies() {
		return movies;
	}

	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}
	

	
}
