package com.movieapp.dao;

import java.util.List;

import com.movieapp.model.Movie;

public interface IMovieDao {

	// CRUD operation
		void addMovie(Movie movie);
		void updateMovie(int movieId, String format);
		void deleteMovie(int movieId);
		
		Movie findById(int movieId);
		List<Movie> findAll();
		List<Movie> findByLanguage(String language);
		List<Movie> findByGenre(String genre);
		List<Movie> findByLanguageFormat(String language,String format);
		List<Movie> findByLanguageGenre(String language,String genre);
		List<Movie> findByGenreFormat(String genre,String format);
		List<Movie> findByAnyProperty(String choice); // search for any
		List<String> findMovieNames(String language); // only movie names 
		
}
