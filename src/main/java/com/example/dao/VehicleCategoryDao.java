package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.VehicleCategory;

public interface VehicleCategoryDao extends JpaRepository<VehicleCategory, Integer>{

}
