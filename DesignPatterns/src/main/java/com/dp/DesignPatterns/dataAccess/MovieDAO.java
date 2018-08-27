package com.dp.DesignPatterns.dataAccess;

import java.util.List;

public interface MovieDAO extends	BaseDAO<Movie, Integer>{

	public List<Movie> getAllMovies();
}
