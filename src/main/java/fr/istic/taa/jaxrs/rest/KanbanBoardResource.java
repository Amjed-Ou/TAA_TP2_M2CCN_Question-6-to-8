package fr.istic.taa.jaxrs.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.istic.taa.jaxrs.dao.generic.KanbanBoardDAO;
import fr.istic.taa.jaxrs.domain.KanbanBoard;


@Path("/kanban")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class KanbanBoardResource {
	
	
	
	@GET
	public List<KanbanBoard> getAllKanbans(){
	    KanbanBoardDAO kanban = new KanbanBoardDAO();
	    return kanban.findAll();

	}
	
}