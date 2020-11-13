package fr.istic.taa.jaxrs.rest;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import fr.istic.taa.jaxrs.dao.generic.UtilisateurDAO;
import fr.istic.taa.jaxrs.domain.Utilisateur;


@Path("/")
@Produces({"application/json", "application/xml"})
public class UtilisateurResource {
	
	
	
	@GET
    public List<Utilisateur> getAllUsers(){
		
        UtilisateurDAO user= new UtilisateurDAO();
        return user.findAll();
    }

    @GET
    @Path("/{userId}")
    public Utilisateur getUserById(@PathParam("userId") Long userId){

        UtilisateurDAO userD = new UtilisateurDAO();
        return userD.findOne(userId);
    }

    @POST
    @Consumes("application/json")
    public Response addUtilisateur(Utilisateur utilisateur){
    	
        Utilisateur newUtilisateur = new Utilisateur();
        newUtilisateur.setName(utilisateur.getName());
        newUtilisateur.setEmail(utilisateur.getEmail());

        UtilisateurDAO usrDao = new UtilisateurDAO();
        usrDao.save(newUtilisateur);  

        return Response.ok().entity("SUCCESS").build();
    }

}