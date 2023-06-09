
package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "UTILISATEURS", schema = "gestion_salon_coiffure_db")
public class Utilisateur implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUtilisateur;
	@Column(name = "nom")
	private String nom;
	private String prenom;
	private String login;
	private Date dateNaissance;
	// Les attributs pour la sécurité :
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "PROFILS", joinColumns = @JoinColumn(name = "id_user", referencedColumnName = "idUtilisateur"), inverseJoinColumns = @JoinColumn(name = "id_role", referencedColumnName = "idRole"))
	private Set<Role> roles = new HashSet<>();
	
	@OneToMany(mappedBy = "utilisateurs")
	@Transient
	private List<Reservation> reservations;
	
	@OneToMany(mappedBy = "utilisateurs")
	@Transient
	private List<Avis> avis = new ArrayList<>();
	
	
	@Column(unique = true)
	private String username;
	private String password;
	private boolean enabled = true;
	
	public Utilisateur() {
	}



	public Utilisateur(String nom, String prenom, String login, Date dateNaissance, Set<Role> roles,
			List<Reservation> reservations, List<Avis> avis, String username, String password, boolean enabled) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.dateNaissance = dateNaissance;
		this.roles = roles;
		this.reservations = reservations;
		this.avis = avis;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
	}



	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	

	public List<Reservation> getReservations() {
		return reservations;
	}



	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}



	public List<Avis> getAvis() {
		return avis;
	}



	public void setAvis(List<Avis> avis) {
		this.avis = avis;
	}



	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", nom=" + nom + ", prenom=" + prenom + ", login="
				+ login + ", dateNaissance=" + dateNaissance + ", username=" + username + ", password=" + password
				+ ", enabled=" + enabled + "]";
	}







	
	
	

}
