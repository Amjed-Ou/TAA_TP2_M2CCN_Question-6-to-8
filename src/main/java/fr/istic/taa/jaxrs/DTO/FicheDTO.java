package fr.istic.taa.jaxrs.DTO;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import fr.istic.taa.jaxrs.domain.Utilisateur;


@XmlRootElement(name = "Fiche")
public class FicheDTO{
	
	
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
	
	
	
	
	@XmlElement(name = "idFiche")
	public long getIdFiche() {
		return idFiche;
	}
	
	public void setIdFiche(long idFiche) {
		this.idFiche = idFiche;
	}
	
	@XmlElement(name = "libelle")
	public String getLibelle() {
		return libelle;
	}
	
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	@XmlElement(name = "date")
	public String getDateButoire() {
		return dateButoire;
	}
	
	public void setDateButoire(String dateButoire) {
		this.dateButoire = dateButoire;
	}
	
	@XmlElement(name = "user")
	public Utilisateur getUser() {
		return user;
	}
	
	public void setUser(Utilisateur user) {
		this.user = user;
	}
	
	@XmlElement(name = "duree")
	public int getDureeMinute() {
		return dureeMinute;
	}
	
	public void setDureeMinute(int dureeMinute) {
		this.dureeMinute = dureeMinute;
	}
	
	@XmlElement(name = "tags")
	public String getTags() {
		return tags;
	}
	
	public void setTags(String tags) {
		this.tags = tags;
	}
	
	@XmlElement(name = "lieu")
	public String getLieu() {
		return lieu;
	}
	
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	
	@XmlElement(name = "url")
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	@XmlElement(name = "noteExplicative")
	public String getNoteExplicative() {
		return noteExplicative;
	}
	
	public void setNoteExplicative(String noteExplicative) {
		this.noteExplicative = noteExplicative;
	}
	
}