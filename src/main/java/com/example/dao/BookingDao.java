package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Booking;

public interface BookingDao extends JpaRepository<Booking, Integer>{

}
