package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.BookingDao;
import com.example.dao.UserDao;
import com.example.entity.Booking;
import com.example.entity.User;

@Service
public class BookingService {
	
	

		@Autowired
		private BookingDao bookingDAO;
		
		@Autowired
		private UserDao userDAO;

		public Booking addBooking(Booking bookingDetails) {
			User user = userDAO.getReferenceById(bookingDetails.getUser_id());
			if(bookingDetails.getAmount() > user.getWallet_money()) {
				return null;
			}
			else {
				int balanceInWallet = user.getWallet_money() - bookingDetails.getAmount();
				user.setWallet_money(balanceInWallet);
				userDAO.save(user);
				return bookingDAO.save(bookingDetails);
			}
		}

}
