package fr.istic.taa.jaxrs.rest;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import fr.istic.taa.jaxrs.dao.generic.UtilisateurDAO;
import fr.istic.taa.jaxrs.domain.Utilisateur;


@Path("/utilisateur")
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
    public Response addUtilisateur(@QueryParam("name") String name, @QueryParam("email") String email){
    	
        Utilisateur user = new Utilisateur();
        user.setName(name);
        user.setEmail(email);

        UtilisateurDAO usrD = new UtilisateurDAO();
        usrD.save(user);

        return Response.ok().entity("SUCCESS").build();
    }

}