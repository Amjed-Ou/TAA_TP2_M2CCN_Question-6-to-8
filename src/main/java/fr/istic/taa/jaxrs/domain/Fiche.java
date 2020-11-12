package fr.istic.taa.jaxrs.domain;

import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;


@Entity
public class Fiche implements Serializable{
	
	
	private long idFiche;
	private String libelle;
	private String dateButoire;
	private Utilisateur user;
	private int dureeMinute;
	//private List<Tag> tags = new ArrayList<>();
	private String tags;
	private String lieu;
	private String url;
	private String noteExplicative;
	
	
	public Fiche() {}
	
	public Fiche(String libelle, String dateButoire, Utilisateur user, int dureeMinute, String tags ,String lieu, String url, String noteExplicative) {
	    
		this.libelle = libelle;
		this.dateButoire = dateButoire;
		this.user = user;
		this.dureeMinute = dureeMinute;
		this.tags = tags;
		this.lieu = lieu;
		this.url = url;	
		this.noteExplicative = noteExplicative;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getIdFiche() {
		return idFiche;
	}

	public void setIdFiche(long idFiche) {
		this.idFiche = idFiche;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDateButoire() {
		return dateButoire;
	}

	public void setDateButoire(String dateButoire) {
		this.dateButoire = dateButoire;
	}

	@ManyToOne(cascade = CascadeType.PERSIST)
	public Utilisateur getUser() {
		return user;
	}

	public void setUser(Utilisateur user) {
		this.user = user;
	}

	public int getDureeMinute() {
		return dureeMinute;
	}

	public void setDureeMinute(int dureeMinute) {
		this.dureeMinute = dureeMinute;
	}

	
	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getNoteExplicative() {
		return noteExplicative;
	}

	public void setNoteExplicative(String noteExplicative) {
		this.noteExplicative = noteExplicative;
	}

}