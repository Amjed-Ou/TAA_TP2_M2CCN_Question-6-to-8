package fr.istic.taa.jaxrs.rest;

import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import fr.istic.taa.jaxrs.dao.generic.SectionDAO;
import fr.istic.taa.jaxrs.domain.Section;



@Path("/section")
@Produces({"application/json", "application/xml"})
public class SectionResource {
	
	
	 @GET
	 public List<Section> getAllUsers(){
		 
	       SectionDAO section = new SectionDAO();
	        return section.findAll();
	 }
	
	  @GET
	  @Path("/{sectionId}")
	  public Section getSectionById(@PathParam("sectionId") Long sectionId)  {
		  
	      SectionDAO section = new SectionDAO();
	      return section.findOne(sectionId);
	  }
	  
	    @POST
	    @Consumes("application/json")
	    public Response addSection(Section section){
	    	
	        Section newSection = new Section();
	        newSection.setName(section.getName());
	        newSection.setBoard(section.getBoard());

	        SectionDAO sectionDao = new SectionDAO();
	        sectionDao.save(newSection);

	        return Response.ok().entity("SUCCESS").build();
	    }
		
}
