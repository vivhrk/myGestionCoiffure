package com.inti.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AVIS", schema = "gestion_salon_coiffure_db")
public class Avis {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titre;
	private String description;
	
	@ManyToOne
	private Utilisateur utilisateur;
	
	public Avis() {
		// TODO Auto-generated constructor stub
	}

	

	public Avis(String titre, String description, Utilisateur utilisateur) {
		super();
		this.titre = titre;
		this.description = description;
		this.utilisateur = utilisateur;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}



	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}



	@Override
	public String toString() {
		return "Avis [id=" + id + ", titre=" + titre + ", description=" + description + ", utilisateur=" + utilisateur
				+ "]";
	}



	
	
}
