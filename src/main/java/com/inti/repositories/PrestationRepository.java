package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Prestation;


@Repository
public interface PrestationRepository extends JpaRepository<Prestation, Long> 
{

}
