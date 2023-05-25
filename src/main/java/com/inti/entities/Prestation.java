package com.inti.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRESTATIONS", schema = "gestion_salon_coiffure_db")
public class Prestation {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	
	public Prestation() {
		// TODO Auto-generated constructor stub
	}

	public Prestation(Long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Prestation [id=" + id + ", nom=" + nom + "]";
	}
	
	
}
