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
@Table(name = "Vehicle")
public class Vehicle {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@OneToMany(mappedBy="vehicleid")
	int vehicleid;
	String model;
	String vehicleno;
//	@ManyToOne(fetch=FetchType.LAZY)
	int vehiclesubcatid;
	String color;
//	@ManyToOne(fetch=FetchType.LAZY)
	int location_id;
//	@ManyToOne(fetch=FetchType.LAZY)
	int fuelid;
	boolean availabilityStatus;
	String imageurl;
	
	
	@Override
	public String toString() {
		return "Vehicle [vehicleid=" + vehicleid + ", model=" + model + ", vehicleno=" + vehicleno
				+ ", vehiclesubcatid=" + vehiclesubcatid + ", color=" + color + ", locationid=" + location_id
				+ ", fuelid=" + fuelid + ", availabilityStatus=" + availabilityStatus + ", imageurl=" + imageurl + "]";
	}
	public int getVehicleid() {
		return vehicleid;
	}
	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getVehicleno() {
		return vehicleno;
	}
	public void setVehicleno(String vehicleno) {
		this.vehicleno = vehicleno;
	}
	public int getVehiclesubcatid() {
		return vehiclesubcatid;
	}
	public void setVehiclesubcatid(int vehiclesubcatid) {
		this.vehiclesubcatid = vehiclesubcatid;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getLocationid() {
		return location_id;
	}
	public void setLocationid(int locationid) {
		this.location_id = locationid;
	}
	public int getFuelid() {
		return fuelid;
	}
	public void setFuelid(int fuelid) {
		this.fuelid = fuelid;
	}
	public boolean isAvailabilityStatus() {
		return availabilityStatus;
	}
	public void setAvailabilityStatus(boolean availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	public Object getSubcategory() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
