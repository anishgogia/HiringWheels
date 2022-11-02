package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.City;

public interface CityDao extends JpaRepository<City, Integer> {

}
