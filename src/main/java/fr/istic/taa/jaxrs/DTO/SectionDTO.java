package fr.istic.taa.jaxrs.DTO;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "section")
public class SectionDTO{
	
	long idSection; 
	String name;
	//List<Carte> cartes = new ArrayList<>();
	KanbanBoardDTO board;
	
	
	
	@XmlElement(name = "idSection")
	public long getIdSection() {
		return idSection;
	}
	
	
	public void setIdSection(long idSection) {
		this.idSection = idSection;
	}
	
	@XmlElement(name = "name")
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement(name = "board")
	public KanbanBoardDTO getBoard() {
		return board;
	}
	
	public void setBoard(KanbanBoardDTO board) {
		this.board = board;
	}
	

}
