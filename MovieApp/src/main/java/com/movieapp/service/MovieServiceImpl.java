package com.movieapp.service;

import java.util.Comparator;
import java.util.List;

import com.movieapp.dao.IMovieDao;
import com.movieapp.dao.MovieDaoImpl;
import com.movieapp.exceptions.MovieNotFoundException;
import com.movieapp.model.Movie;

public class MovieServiceImpl implements IMovieService{

	private IMovieDao movieDao = new MovieDaoImpl();
	@Override
	public void addMovie(Movie movie) {
		movieDao.addMovie(movie);
		
	}

	@Override
	public void updateMovie(int movieId, String format) {
		movieDao.updateMovie(movieId, format);
	}

	@Override
	public void deleteMovie(int movieId) {
		movieDao.deleteMovie(movieId);
	}

	@Override
	public Movie getById(int movieId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getAll() {
		List<Movie> movies = movieDao.findAll();
		return movies.stream().sorted(Comparator.comparing(Movie::getMovieName)).toList();
	}

	@Override
	public List<Movie> getByLanguage(String language) {
		List<Movie> movies = movieDao.findAll();
		if(movies.isEmpty())
			throw new MovieNotFoundException("no movie found for this launguage");
	 return movies;
	}

	@Override
	public List<Movie> getByGenre(String genre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getByLanguageFormat(String language, String format) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getByLanguageGenre(String language, String genre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getByGenreFormat(String genre, String format) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getByAnyProperty(String choice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getMovieNames(String language) {
		// TODO Auto-generated method stub
		return null;
	}

}
