package com.movieapp.model;

import java.time.LocalTime;

public class Movie {

	private String movieName;
	private Integer movieId;
	private String language; // get values from enum
	private String format; // get values from enum
	private String genre;// get values from enum
	private LocalTime duration;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(String movieName, String language, String format, String genre, LocalTime duration) {
		super();
		this.movieName = movieName;
		this.language = language;
		this.format = format;
		this.genre = genre;
		this.duration = duration;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public LocalTime getDuration() {
		return duration;
	}
	public void setDuration(LocalTime duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", movieId=" + movieId + ", language=" + language + ", format="
				+ format + ", genre=" + genre + ", duration=" + duration + "]";
	}
	
	
}
