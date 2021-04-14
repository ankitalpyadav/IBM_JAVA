package com.ibm.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
@SequenceGenerator(name = "movseq", sequenceName = "seq_movie", initialValue = 101)
public class Movie {
	
	@Id
	@GeneratedValue()
	@Column(name = "mov_id")
	private int movid;
	
	@Column(length = 20)
	private String title;
	private double rating;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name = "show_time", joinColumns = {@JoinColumn(name = "mov_id")},
	inverseJoinColumns = {@JoinColumn(name = "mpex_id")})
	private Set<Multiplex> multiplexes = new HashSet<Multiplex>();

	public int getMovid() {
		return movid;
	}

	public void setMovid(int movid) {
		this.movid = movid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Set<Multiplex> getMultiplexes() {
		return multiplexes;
	}

	public void setMultiplexes(Set<Multiplex> multiplexes) {
		this.multiplexes = multiplexes;
	}
	
	
	
}
