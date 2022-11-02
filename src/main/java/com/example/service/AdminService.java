package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.VehicleDao;
import com.example.entity.Vehicle;

@Service
public class AdminService {
	
	
	@Autowired
	private VehicleDao vehicleDAO;

	public Vehicle addVehicle(Vehicle vehicle) {
		Vehicle savedVehicle = vehicleDAO.save(vehicle);
		return savedVehicle;
	}
	

	public Vehicle changeAvailability(int vehicleID,boolean status) {
		Vehicle vehicle = vehicleDAO.findById(vehicleID).get();
		vehicle.setAvailabilityStatus(status);
		vehicleDAO.save(vehicle);
		return vehicle;
	}

}
