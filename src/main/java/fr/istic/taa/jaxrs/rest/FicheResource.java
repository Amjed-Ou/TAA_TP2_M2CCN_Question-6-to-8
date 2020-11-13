package fr.istic.taa.jaxrs.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import fr.istic.taa.jaxrs.dao.generic.FicheDAO;
import fr.istic.taa.jaxrs.domain.Fiche;


@Path("/fiche")
@Produces({"application/json", "application/xml"})
public class FicheResource {
	
	
	
	@GET
    public List<Fiche> getAllFiches(){
		
        FicheDAO fiche = new FicheDAO();
        return fiche.findAll();
    }

    @GET
    @Path("/{ficheId}")
    public Fiche getFicheById(@PathParam("ficheId") Long ficheId){

        FicheDAO ficheD = new FicheDAO();
        return ficheD.findOne(ficheId);
    }

    @POST
    @Consumes("application/json")
    public Response addFiche(Fiche fiche){
    	
        Fiche newFiche = new Fiche();
        newFiche.setLibelle(fiche.getLibelle());
        newFiche.setDureeMinute(fiche.getDureeMinute());

        FicheDAO ficheDao = new FicheDAO();
        ficheDao.save(newFiche);

        return Response.ok().entity("SUCCESS").build();
    }

}