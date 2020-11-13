package fr.istic.taa.jaxrs.DTO;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import fr.istic.taa.jaxrs.domain.Section;


@XmlRootElement(name = "kanban")
public class KanbanBoardDTO{
	
	
	private long idBoard;
	private String name;
	private List<Section> sections;
	
	
	@XmlElement(name = "idBoard")
	public long getIdBoard() {
		return idBoard;
	}
	
	public void setIdBoard(long idBoard) {
		this.idBoard = idBoard;
	}
	
	@XmlElement(name = "name")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement(name = "sections")
	public List<Section> getSections() {
		return sections;
	}
	public void setSectionDTOs(List<Section> sections) {
		this.sections = sections;
	}
	
}