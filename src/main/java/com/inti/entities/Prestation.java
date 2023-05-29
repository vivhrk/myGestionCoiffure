package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRESTATIONS", schema = "gestion_salon_coiffure_db")
public class Prestation implements Serializable {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPrestation;
	private String nom;
	
	@ManyToOne 
	private Reservation reservations;
	
	public Prestation() {
		// TODO Auto-generated constructor stub
	}

	public Prestation(Long id, String nom) {
		super();
		this.idPrestation = id;
		this.nom = nom;
	}

	public Long getId() {
		return idPrestation;
	}

	public void setId(Long idPrestation) {
		this.idPrestation = idPrestation;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	

	public Reservation getReservation() {
		return reservations;
	}

	public void setReservation(Reservation reservations) {
		this.reservations = reservations;
	}

	@Override
	public String toString() {
		return "Prestation [id=" + idPrestation + ", nom=" + nom + ", reservation=" + reservations + "]";
	}

	
	
}
