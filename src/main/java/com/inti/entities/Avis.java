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
@Table(name = "AVISS", schema = "gestion_salon_coiffure_db")
public class Avis implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAvis;
	private String titre;
	private String description;
	
	@ManyToOne
	@JoinColumn(name="id_utilisateur")
	private Utilisateur utilisateurs;
	
	public Avis() {
		// TODO Auto-generated constructor stub
	}

	

	public Avis(String titre, String description, Utilisateur utilisateurs) {
		super();
		this.titre = titre;
		this.description = description;
		this.utilisateurs = utilisateurs;
	}


	public Long getIdAvis() {
		return idAvis;
	}



	public void setIdAvis(Long idAvis) {
		this.idAvis = idAvis;
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



	public Utilisateur getUtilisateurs() {
		return utilisateurs;
	}



	public void setUtilisateurs(Utilisateur utilisateurs) {
		this.utilisateurs = utilisateurs;
	}



	@Override
	public String toString() {
		return "Avis [id=" + idAvis + ", titre=" + titre + ", description=" + description + ", utilisateur=" + utilisateurs
				+ "]";
	}



	
	
}
