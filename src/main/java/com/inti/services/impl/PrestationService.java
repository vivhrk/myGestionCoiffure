package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Prestation;
import com.inti.repositories.PrestationRepository;
import com.inti.services.interfaces.IPrestationService;

@Service
public class PrestationService implements IPrestationService {

	
	@Autowired
	PrestationRepository prestationRepository;

	@Override
	public List<Prestation> findAll() {
		return prestationRepository.findAll();
	}

	@Override
	public Prestation findOne(Long id) {
		return prestationRepository.findById(id).get();
	}

	@Override
	public Prestation save(Prestation prestation) {
		return prestationRepository.save(prestation);
	}

	@Override
	public void delete(Long id) {
		prestationRepository.deleteById(id);
	}
}
