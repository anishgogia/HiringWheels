package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "FuelType")
public class FuelType {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@OneToMany(mappedBy="fuelid")
	int fuel_id;
	String fueltype;
	public int getFuel_id() {
		return fuel_id;
	}
	public void setFuel_id(int fuel_id) {
		this.fuel_id = fuel_id;
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	@Override
	public String toString() {
		return "FuelType [fuel_id=" + fuel_id + ", fueltype=" + fueltype + "]";
	}
	
	

}
