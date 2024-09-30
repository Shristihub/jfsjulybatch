package com.movieapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import com.movieapp.model.Movie;
import com.movieapp.util.ConnectionUtil;
import com.movieapp.util.Queries;

public class MovieDaoImpl implements IMovieDao {
	static Connection connection;
	static {
		connection = ConnectionUtil.openConnection();
	}

	@Override
	public void addMovie(Movie movie) {
		try (
				// create a prepared statement
				PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY)) {
			// set values for it
			statement.setString(1, movie.getMovieName());
			statement.setString(2, movie.getLanguage());
			statement.setString(3, movie.getFormat());
			statement.setString(4, movie.getGenre());
			Time time = Time.valueOf(movie.getDuration());
			statement.setTime(5, time);
			// call save method
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateMovie(int movieId, String format) {
		try (// create a prepared statement
				PreparedStatement statement = connection.prepareStatement(Queries.UPDATEQUERY)) {
			// set values for it
			statement.setString(1, format);
			statement.setInt(2, movieId);
			// call save method
			statement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteMovie(int movieId) {

		try (// create a prepared statement
				PreparedStatement statement = connection.prepareStatement(Queries.DELETEQUERY)) {
			// set values for it
			statement.setInt(1, movieId);
			// call save method
			statement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Movie findById(int movieId) {
		try (PreparedStatement statement = connection.prepareStatement(Queries.SELECTONEQUERY)) {
			statement.setInt(1, movieId);
			try (ResultSet resultSet = statement.executeQuery();) {
				while (resultSet.next()) {
					Movie movie = new Movie();
					String movieName = resultSet.getString("movie_name");
					movie.setMovieName(movieName);
					movie.setLanguage(resultSet.getString("language"));
					movie.setFormat(resultSet.getString("format"));
					movie.setMovieId(resultSet.getInt("movie_Id"));
					movie.setDuration(resultSet.getTime("duration").toLocalTime());
					movie.setGenre(resultSet.getString("genre"));
					return movie;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Movie> findAll() {
		List<Movie> movies = new ArrayList<Movie>();
		try (PreparedStatement statement = connection.prepareStatement(Queries.SELECTQUERY);
				ResultSet resultSet = statement.executeQuery();) {
			while (resultSet.next()) {
				Movie movie = new Movie();
				String movieName = resultSet.getString("movie_name");
				movie.setMovieName(movieName);
				movie.setLanguage(resultSet.getString("language"));
				movie.setFormat(resultSet.getString("format"));
				movie.setMovieId(resultSet.getInt("movie_Id"));
				movie.setDuration(resultSet.getTime("duration").toLocalTime());
				// add the movie object to the list
				movies.add(movie);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movies;
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
//		use the wild card like
		return null;
	}

	@Override
	public List<String> findMovieNames(String language) {
		// TODO Auto-generated method stub
		return null;
	}

}
