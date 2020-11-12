package fr.istic.taa.jaxrs.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class KanbanBoard implements Serializable{
	
	
	private long idBoard;
	private String name;
	private List<Section> sections;
	

	public KanbanBoard() {}
	
	public KanbanBoard(String name, List<Section> sections) {
		
		this.name = name;
		this.sections = sections;
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getIdBoard() {
		return idBoard;
	}

	public void setIdBoard(long idBoard) {
		this.idBoard = idBoard;
	}
	
	//@Column(name = "NOM")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@OneToMany(mappedBy = "board", cascade = CascadeType.PERSIST)
	public List<Section> getSections() {
		return sections;
	}
	
	public void setSections(List<Section> sections) {
		this.sections = sections;
	}

}