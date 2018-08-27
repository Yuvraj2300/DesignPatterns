package com.dp.DesignPatterns.dataAccess;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;

@ApplicationScoped
public class MovieDAOFactory {

	@PersistenceUnit(unitName="moviePU")
	private	EntityManager	em;
	
	@Produces
	public	MovieDAO	createMovieDAO(EntityManager	em) {
		return	new	MovieDAOImpl(em);
	}
	
}
