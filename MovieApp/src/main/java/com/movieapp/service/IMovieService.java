package com.movieapp.service;

import java.util.List;

import com.movieapp.exceptions.MovieNotFoundException;
import com.movieapp.model.Movie;

public interface IMovieService {

	// CRUD operation
	void addMovie(Movie movie);
	void updateMovie(int movieId, String format);
	void deleteMovie(int movieId);
	
	Movie getById(int movieId) throws MovieNotFoundException;
	List<Movie> getAll();
	List<Movie> getByLanguage(String language) throws MovieNotFoundException;
	List<Movie> getByGenre(String genre) throws MovieNotFoundException;
	List<Movie> getByLanguageFormat(String language,String format) throws MovieNotFoundException;
	List<Movie> getByLanguageGenre(String language,String genre) throws MovieNotFoundException;
	List<Movie> getByGenreFormat(String genre,String format) throws MovieNotFoundException;
	List<Movie> getByAnyProperty(String choice) throws MovieNotFoundException; // search for any
	List<String> getMovieNames(String language) throws MovieNotFoundException; // only movie names 
	
	
	
	
	
	
}
