package com.dp.DesignPatterns.dataAccess;

import java.util.List;

import javax.persistence.EntityManager;

public class MovieDAOImpl implements	MovieDAO{

	EntityManager	em;
	
	MovieDAOImpl(EntityManager	em){
		this.em=em;
	}
	
	@Override
	public void create(Movie movie) {
		// TODO Auto-generated method stub
		em.persist(movie);
	}

	@Override
	public void update(Movie movie) {
		// TODO Auto-generated method stub
		em.merge(movie);
	}

	

	@Override
	public List<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT m FROM Movie m",Movie.class).getResultList();
		
	}

	@Override
	public Movie retrieve(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
