package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Reservation;

import com.inti.repositories.ReservationRepository;

import com.inti.services.interfaces.IReservationService;

@Service
public class ReservationService implements IReservationService{
	@Autowired
	ReservationRepository reservationRepository;
	
	@Override
	public List<Reservation> findAll() {
		
		return reservationRepository.findAll();
	}

	@Override
	public Reservation findOne(Long id) {
		return reservationRepository.findById(id).get();
	}

	@Override
	public Reservation save(Reservation reservations) {
		return reservationRepository.save(reservations);
	}

	@Override
	public void delete(Long id) {
		reservationRepository.deleteById(id);
	}

	

}
