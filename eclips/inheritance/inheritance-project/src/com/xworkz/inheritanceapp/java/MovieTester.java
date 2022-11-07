package com.xworkz.inheritanceapp.java;

import com.xworkz.inheritanceapp.java.JavaFiles.Movie;

public class MovieTester {
	
public static void main(String args[]) {
		
        Movie mv = new Movie();
		mv.toWatch("KGF");
		System.out.println(" One of the Fan india movie is "  + mv.movieName);
	}

}
