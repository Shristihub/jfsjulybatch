package com.movieapp.user;

import java.time.LocalTime;

import com.movieapp.model.Format;
import com.movieapp.model.Genre;
import com.movieapp.model.Language;
import com.movieapp.model.Movie;
import com.movieapp.service.IMovieService;
import com.movieapp.service.MovieServiceImpl;
import com.movieapp.util.ConnectionUtil;

public class Client {

	public static void main(String[] args) {
		
//		ConnectionUtil.openConnection();
//		 create a movie object using scanner
		Movie movie = 
		new Movie("Ponniyin", Language.TAMIL.name(),Format.THREEDS.getFormat(), 
				                        Genre.DRAMA.name(), 
				                        LocalTime.of(2,30,2));
		
		IMovieService movieService = new MovieServiceImpl();
//		movieService.addMovie(movie);
//		movieService.updateMovie(1, Format.THREEDMAX.getFormat());
		movieService.getAll().forEach(System.out::println);
		movieService.deleteMovie(4);
		movieService.deleteMovie(5);
		
		
		
		
	}
}
