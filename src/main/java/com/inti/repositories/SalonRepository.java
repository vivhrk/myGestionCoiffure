package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Salon;

@Repository
public interface SalonRepository extends JpaRepository<Salon, Long>{

}
