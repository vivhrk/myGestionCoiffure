package com.inti.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PRESTATIONS", schema = "gestion_salon_coiffure_db")
public class Reservation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReservation;
	@Temporal(TemporalType.DATE)
	private Date date; 
	
	@OneToMany(mappedBy = "reservation")
	private List<Salon> salons = new ArrayList<>();
	
	@OneToMany(mappedBy = "reservation")
	private List<Prestation> prestations = new ArrayList<>();
	
	@ManyToOne // societe_idSociete <=> id_societe
	@JoinColumn(name="id_utilisateur")
	private Utilisateur utilisateur;

	public Reservation() {
		
	}


	public Reservation(Date date, Utilisateur utilisateur) {
		super();
		this.date = date;
		this.utilisateur = utilisateur;
	}



	public Long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Salon> getSalons() {
		return salons;
	}

	public void setSalons(List<Salon> salons) {
		this.salons = salons;
	}

	public List<Prestation> getPrestations() {
		return prestations;
	}

	public void setPrestations(List<Prestation> prestations) {
		this.prestations = prestations;
	}


	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", date=" + date + ", utilisateur=" + utilisateur + "]";
	}

	
	
	
}
