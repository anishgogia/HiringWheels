package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Location;

public interface LocationDao extends JpaRepository<Location, Integer> {

}
