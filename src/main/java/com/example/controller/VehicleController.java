package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Vehicle;
import com.example.service.VehicleService;

@RestController
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleService;

	@RequestMapping(value="/hirewheels/v1/vehicles")
	public ResponseEntity<List<Vehicle>> getVehicles(){
		return ResponseEntity.ok(vehicleService.getAllVehicles());
	}

}
