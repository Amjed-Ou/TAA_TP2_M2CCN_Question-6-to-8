package fr.istic.taa.jaxrs.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
public class Utilisateur implements Serializable{
	
	
	private long idUser; 
	private String name;
	private String email;
	private List<Fiche> fiches;

	
	public Utilisateur() {}
	
	public Utilisateur(String name, List<Fiche> fiches) {
		
		this.name = name;
		this.fiches = fiches;
	}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getIdUser() {
		return idUser;
	}
    
	public void setIdUser(long id) {
		this.idUser = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)
	public List<Fiche> getFiches() {
		return fiches;
	}

	public void setFiches(List<Fiche> fiches) {
		this.fiches = fiches;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}