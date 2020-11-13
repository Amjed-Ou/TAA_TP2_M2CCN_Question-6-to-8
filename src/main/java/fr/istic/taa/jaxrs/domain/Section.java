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
public class Section implements Serializable{
	
	long idSection; 
	String name;
	//List<Carte> cartes = new ArrayList<>();
	KanbanBoard board;
	
	
	public Section() {}
	
	public Section(String name, KanbanBoard board) {
		
		this.name = name;
		this.board = board;
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getIdSection() {
		return idSection;
	}
	
	public void setIdSection(long id) {
		this.idSection = id;
	}
	
//	@OneToMany(mappedBy = "section")
//	public List<Carte> getFiches() {
//		return cartes;
//	}
//	
//	public void setCartes(List<Carte> cartes) {
//		this.cartes = cartes;
//	}
	
	@ManyToOne
	public KanbanBoard getBoard() {
		return board;
	}
	public void setBoard(KanbanBoard tableau) {
		this.board = tableau;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
