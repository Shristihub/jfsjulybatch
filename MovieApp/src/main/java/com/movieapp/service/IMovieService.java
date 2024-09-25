package com.movieapp.service;

import java.util.List;

import com.movieapp.model.Movie;

public interface IMovieService {

	// CRUD operation
	void addMovie(Movie movie);
	void updateMovie(int movieId, String format);
	void deleteMovie(int movieId);
	
	Movie getById(int movieId);
	List<Movie> getAll();
	List<Movie> getByLanguage(String language);
	List<Movie> getByGenre(String genre);
	List<Movie> getByLanguageFormat(String language,String format);
	List<Movie> getByLanguageGenre(String language,String genre);
	List<Movie> getByGenreFormat(String genre,String format);
	List<Movie> getByAnyProperty(String choice); // search for any
	List<String> getMovieNames(String language); // only movie names 
	
	
	
	
	
	
}
