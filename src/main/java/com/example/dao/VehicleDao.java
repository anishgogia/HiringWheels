package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Vehicle;

public interface VehicleDao extends JpaRepository<Vehicle, Integer>{

}
