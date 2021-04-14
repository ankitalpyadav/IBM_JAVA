package com.ibm.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Passport implements Serializable {

		@Column(length = 15)
		private String country;

		@Column(name = "passport_no")
		private int number;

		public Passport() {

		}

		public Passport(String country, int number) {
			super();
			this.country = country;
			this.number = number;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}
		
		

		@Override
		public String toString() {
			return "Passport [country=" + country + ", number=" + number + "]";
		}

		@Override
		public boolean equals(Object obj) {
			return super.equals(obj);
		}

		@Override
		public int hashCode() {
			return super.hashCode();
		}

}
