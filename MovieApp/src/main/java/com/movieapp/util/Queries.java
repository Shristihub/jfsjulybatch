package com.movieapp.util;

public class Queries {

	public static final String INSERTQUERY=
		"insert into movie(movie_name,language,format,genre,duration) values(?,?,?,?,?)";
	
	public static final String UPDATEQUERY="Update movie set format= ? where movie_Id=?";
	public static final String DELETEQUERY="delete from movie where movie_id=?";
	public static final String SELECTQUERY= "select * from movie";
	public static final String SELECTONEQUERY= "select * from movie where movie_id=?";
	
	public static final String SELECTNAMESQUERY= "select movie_name from movie where language=?";
}
