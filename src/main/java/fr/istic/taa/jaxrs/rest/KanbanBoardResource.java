package fr.istic.taa.jaxrs.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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
	
	@GET
    @Path("/{kanabnId}")
    public KanbanBoard getFicheById(@PathParam("kanbanId") Long kanbanId){

        KanbanBoardDAO newKanban = new KanbanBoardDAO();
        return newKanban.findOne(kanbanId);
    }

    @POST
    @Consumes("application/json")
    public Response addKanban(KanbanBoard kanban){
    	
        KanbanBoard newKanban = new KanbanBoard();
        newKanban.setName(kanban.getName());
        newKanban.setSections(kanban.getSections());

        KanbanBoardDAO kanbanDao = new KanbanBoardDAO();
        kanbanDao.save(newKanban);

        return Response.ok().entity("SUCCESS").build();
    }
	
}