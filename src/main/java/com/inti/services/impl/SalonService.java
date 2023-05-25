package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.inti.entities.Salon;
import com.inti.repositories.SalonRepository;
import com.inti.services.interfaces.ISalonService;

public class SalonService implements ISalonService{

	@Autowired
	SalonRepository salonRepository;
	
	@Override
	public List<Salon> findAll() {
		// TODO Auto-generated method stub
		return salonRepository.findAll();
	}

	@Override
	public Salon findOne(Long id) {
		// TODO Auto-generated method stub
		return salonRepository.findById(id).get();
	}

	@Override
	public Salon save(Salon salon) {
		// TODO Auto-generated method stub
		return salonRepository.save(salon);
	}

	@Override
	public void delete(Long id) {
		salonRepository.deleteById(id);		
	}

}
