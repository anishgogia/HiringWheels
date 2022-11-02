package com.example.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int bookingid;
	Date pickup_date;
	Date dropoff_date;
	Date booking_date;
	int amount;
//	@ManyToOne(fetch=FetchType.LAZY)
	int location_id;
//	@ManyToOne(fetch=FetchType.LAZY)
	int user_id;
//	@ManyToOne(fetch=FetchType.LAZY)
	int vehicleid;
	
	@Override
	public String toString() {
		return "Booking [bookingid=" + bookingid + ", pickup_date=" + pickup_date + ", dropoff_date=" + dropoff_date
				+ ", booking_date=" + booking_date + ", amount=" + amount + ", location_id=" + location_id
				+ ", user_id=" + user_id + ", vehicleid=" + vehicleid + "]";
	}
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public Date getPickup_date() {
		return pickup_date;
	}
	public void setPickup_date(Date pickup_date) {
		this.pickup_date = pickup_date;
	}
	public Date getDropoff_date() {
		return dropoff_date;
	}
	public void setDropoff_date(Date dropoff_date) {
		this.dropoff_date = dropoff_date;
	}
	public Date getBooking_date() {
		return booking_date;
	}
	public void setBooking_date(Date booking_date) {
		this.booking_date = booking_date;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getVehicleid() {
		return vehicleid;
	}
	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}
	
	
	

}
