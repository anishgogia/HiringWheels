package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.VehicleDao;
import com.example.entity.Booking;
import com.example.entity.Vehicle;
import com.example.entity.VehicleSubCategory;

@Service
public class VehicleService {
	
	@Autowired
	private VehicleDao vehicleDAO;
	
	public List<Vehicle> getAllVehicles() {
		return vehicleDAO.findAll();
	}

	public List<Vehicle> getAvailableVehicles(VehicleSubCategory vehicleSubCategory, Booking bookingDetails) {
		List<Vehicle> availableVehicles = new ArrayList<>();
		vehicleDAO.findAll().forEach(vehicle -> {
			Vehicle v = vehicle;
			if(v.isAvailabilityStatus() == true && v.getSubcategory().getId() == vehicleSubCategory.getId()
					&& v.getLocation().getCity() == bookingDetails.getLocation().getCity() && 
						isBooked(v.getBookings(),bookingDetails)
					) {
				availableVehicles.add(vehicle);
			}
		}
		);
		return availableVehicles;	
	}
	
	public boolean isBooked(Set<Booking> bookings,Booking userQuery) {
		for(Booking booking : bookings) {
			if(userQuery.getPickup_date().after(booking.getPickup_date()) && userQuery.getDropoff_date().before(booking.getDropoff_date())) {
				return false;
			}
		}
		return true;
	}

}
