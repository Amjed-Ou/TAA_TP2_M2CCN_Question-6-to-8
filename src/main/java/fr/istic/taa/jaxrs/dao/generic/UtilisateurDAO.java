package fr.istic.taa.jaxrs.dao.generic;

import fr.istic.taa.jaxrs.domain.Utilisateur;

public class UtilisateurDAO extends AbstractJpaDao<Long, Utilisateur> {
	
	
	public UtilisateurDAO() {
		super(Utilisateur.class);
	}
	
}