package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "VehicleCategory")
public class VehicleCategory {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@OneToMany(mappedBy="vehiclecatid")
	int vehiclecatid;
	String category;
	
	
	@Override
	public String toString() {
		return "VehicleCategory [vehiclecatid=" + vehiclecatid + ", category=" + category + "]";
	}
	public int getVehiclecatid() {
		return vehiclecatid;
	}
	public void setVehiclecatid(int vehiclecatid) {
		this.vehiclecatid = vehiclecatid;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

}
