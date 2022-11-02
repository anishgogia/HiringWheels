package com.example.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Vehicle;
import com.example.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@PostMapping(value="/hiringwheels/addvehicle",consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Vehicle> addVehicle(@RequestBody Vehicle vehicle){
		return new ResponseEntity<>(adminService.addVehicle(vehicle),HttpStatus.CREATED);
	}
	
	@PostMapping(value="hiringwheels/updatevehicle/{id}",consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE
	)
	public ResponseEntity<Vehicle> updateVehicle(@PathVariable("id") int id,@RequestBody HashMap<String,Integer> request){
		return new ResponseEntity<>(adminService.changeAvailability(id,request.get("availabilityStatus")),HttpStatus.ACCEPTED);
	}

}
