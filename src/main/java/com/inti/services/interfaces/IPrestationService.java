package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Prestation;

public interface IPrestationService {

	List<Prestation> findAll();

	Prestation findOne(Long id);

	Prestation save(Prestation prestation);

	void delete(Long id);
}
