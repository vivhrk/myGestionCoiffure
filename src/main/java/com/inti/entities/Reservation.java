package com.inti.entities;

import java.io.Serializable;
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
import javax.persistence.Transient;

@Entity
@Table(name = "RESERVATIONS", schema = "gestion_salon_coiffure_db")
public class Reservation implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReservation;
	@Temporal(TemporalType.DATE)
	private Date date; 
	
	@OneToMany(mappedBy = "reservations")
	@JoinColumn(name="id_salon")
	@Transient
	private List<Salon> salons = new ArrayList<>() ;
	
	@OneToMany(mappedBy = "reservations")
	@Transient
	private List<Prestation> prestations = new ArrayList<>() ;
	
	@ManyToOne // societe_idSociete <=> id_societe
	@JoinColumn(name="id_utilisateur")
	private Utilisateur utilisateurs;

	public Reservation() {
		
	}




	public Reservation(Date date, List<Salon> salons, List<Prestation> prestations, Utilisateur utilisateurs) {
		super();
		this.date = date;
		this.salons = salons;
		this.prestations = prestations;
		this.utilisateurs = utilisateurs;
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




	public Utilisateur getUtilisateur() {
		return utilisateurs;
	}




	public void setUtilisateur(Utilisateur utilisateurs) {
		this.utilisateurs = utilisateurs;
	}




	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", date=" + date + ", salons=" + salons
				+ ", prestations=" + prestations + ", utilisateur=" + utilisateurs + "]";
	}




	

	
	
	
}
