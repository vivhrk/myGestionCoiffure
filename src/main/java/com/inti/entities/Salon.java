package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.inti.model.Adresse;


@Entity
@Table(name = "SALONS", schema = "gestion_salon_coiffure_db")
public class Salon implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSalon;
	private String nom;
	private Adresse adresse;
	
	@ManyToOne
	private Reservation reservations;
	
	public Salon() {
		
	}
	public Salon(String nom, Adresse adresse, Reservation reservations) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.reservations = reservations;
	}
	public Long getIdSalon() {
		return idSalon;
	}
	public void setIdSalon(Long idSalon) {
		this.idSalon = idSalon;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public Reservation getReservation() {
		return reservations;
	}
	public void setReservation(Reservation reservations) {
		this.reservations = reservations;
	}
	@Override
	public String toString() {
		return "Salon [idSalon=" + idSalon + ", nom=" + nom + ", adresse=" + adresse + ", reservation=" + reservations
				+ "]";
	}

	
}
