package com.gk.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flateNo;
	private String area;
	private String city;
	private String state;
	private String country;

	public int getFlateNo() {
		return flateNo;
	}

	public void setFlateNo(int flateNo) {
		this.flateNo = flateNo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "Address [flateNo=" + flateNo + ", area=" + area + ", city=" + city + ", state=" + state + ", country="
				+ country + "]";
	}

}
