package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Salon;

public interface ISalonService {
	List<Salon> findAll();

	Salon findOne(Long id);

	Salon save(Salon salon);

	void delete(Long id);
}


