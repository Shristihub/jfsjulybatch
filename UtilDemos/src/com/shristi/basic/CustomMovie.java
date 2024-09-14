package com.shristi.basic;

import java.util.ArrayList;

public class CustomMovie {

	public static void main(String[] args) {
		// create 5 movie objects
		// add  to ArrayList
		//iterate and print it
		// get the list of movies by a particular language
		Movie movie1= new Movie("24",1,"Tamil","Morning");
		Movie movie2= new Movie("Kala",2,"Tamil","Evening");
		Movie movie3= new Movie("KGF",3,"Kannada","Morning");
		Movie movie4= new Movie("Chandu",4,"Hindi","Evening");
		
		ArrayList<Movie> list = new ArrayList<>();
		list.add(movie1);
		list.add(new Movie("Tangled",5,"English","Morning"));
		list.add(movie4);
		list.add(movie3);
		list.add(movie2);
		
		for (Movie movie : list) {
			System.out.println(movie);
		}
		System.out.println();
		System.out.println("Get by Language - get only movie names");
		
		
		
		
	}
}
