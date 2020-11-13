package fr.istic.taa.jaxrs.DTO;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import fr.istic.taa.jaxrs.domain.Fiche;


@XmlRootElement(name = "user")
public class UtilisateurDTO{
	
	
	private long idUser; 
	private String name;
	private String email;
	private List<Fiche> fiches;
	
	
	
	@XmlElement(name = "idUser")
	public long getIdUser() {
		return idUser;
	}
	
	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	
	@XmlElement(name = "name")
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement(name = "email")
	public String getEmail() {
		return email;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@XmlElement(name = "fiches")
	public List<Fiche> getFiches() {
		return fiches;
	}
	
	
	public void setFiches(List<Fiche> fiches) {
		this.fiches = fiches;
	}
    
}