package Utility;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import com.opencsv.*;

public class Prediction extends mainClass {
	static int userID;
	static int movieID;
	static double movieAverage;
	static int[] genreArray;
	static ArrayList<int[]> ratingsArray;
	static int prediction;
	static ArrayList<Integer> moviePreference;
	
	public void setValues(int user, int movie) {
		userID = user;
		movieID = movie;
		movie mov = movies.get(movie-1);
		movieAverage = mov.getAverage();
		genreArray = mov.getGenre();
		user userRef = new user();
		ratingsArray = userRef.getRatings();
	}
	public double getPrediction() {
		return movieAverage;
	}
}
