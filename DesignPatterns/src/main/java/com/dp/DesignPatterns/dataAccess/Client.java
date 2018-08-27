package com.dp.DesignPatterns.dataAccess;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class Client {
	@Inject
	MovieDAO	movieDAO;
	
	public	List<Movie>	allMovies(){
		return	movieDAO.getAllMovies();
	}
}
