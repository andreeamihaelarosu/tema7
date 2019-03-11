package com.andreearosu.springBoot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cars2")
public class Car {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	
	@Column(name="make")
	private String make;
	
	@Column(name="model")
	private String model;
	
	@Column(name="gear")
	private String gear;
	
	@Column(name="fuel")
	private String fuel;
		
	public int getID() {
		return this.ID;
	}
	
	public void setID(int ID) {
		this.ID=ID;
	}
	
	public String getMake() {
		return this.make;
	}
	
	public void setMake(String make) {
		this.make=make;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setModel(String model) {
		this.model=model;
	}
	
	public String getGear() {
		return this.gear;
	}
	
	public void setGear(String gear) {
		this.gear=gear;
	}
	
	public String getFuel() {
		return this.gear;
	}
	
	public void setFuel(String fuel) {
		this.fuel=fuel;
	}
}

