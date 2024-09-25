package com.movieapp.dao;

import java.util.List;

import com.movieapp.model.Movie;

public class MovieDaoImpl implements IMovieDao{

	@Override
	public void addMovie(Movie movie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMovie(int movieId, String format) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMovie(int movieId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Movie findById(int movieId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> findByLanguage(String language) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> findByGenre(String genre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> findByLanguageFormat(String language, String format) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> findByLanguageGenre(String language, String genre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> findByGenreFormat(String genre, String format) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> findByAnyProperty(String choice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> findMovieNames(String language) {
		// TODO Auto-generated method stub
		return null;
	}

}
