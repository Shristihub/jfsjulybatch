package com.shristi.basic;

public class Movie {

	private String movieName;
	private Integer movieId;
	private String language;
	private String showTime;
	
	public Movie() {
		super();
	}

	public Movie(String movieName, Integer movieId, String language, String showTime) {
		super();
		this.movieName = movieName;
		this.movieId = movieId;
		this.language = language;
		this.showTime = showTime;
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

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", movieId=" + movieId + ", language=" + language + ", showTime="
				+ showTime + "]";
	}
	
	
}
