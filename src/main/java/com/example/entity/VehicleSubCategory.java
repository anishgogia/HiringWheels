package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "VehicleSubCategory")
public class VehicleSubCategory {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@OneToMany(mappedBy="vehiclesubcatid")
	int vehiclesubcatid;
	String catname;
	int pricePerDay;
//	@ManyToOne(fetch=FetchType.LAZY)
	int vehiclecatid;
	public int getVehiclsubcatid() {
		return vehiclesubcatid;
	}
	public void setVehiclsubcatid(int vehiclsubcatid) {
		this.vehiclesubcatid = vehiclsubcatid;
	}
	public String getCatname() {
		return catname;
	}
	public void setCatname(String catname) {
		this.catname = catname;
	}
	public int getPricePerDay() {
		return pricePerDay;
	}
	public void setPricePerDay(int pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	public int getVehiclecatid() {
		return vehiclecatid;
	}
	public void setVehiclecatid(int vehiclecatid) {
		this.vehiclecatid = vehiclecatid;
	}
	@Override
	public String toString() {
		return "VehicleSubCategory [vehiclsubcatid=" + vehiclesubcatid + ", catname=" + catname + ", pricePerDay="
				+ pricePerDay + ", vehiclecatid=" + vehiclecatid + "]";
	}
	
	

}
