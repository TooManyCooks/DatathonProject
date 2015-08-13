package Utility;
import java.util.ArrayList;

public class Movie {
	String movieID;
	String movieName;
	String movieDate;
	static int[] genreArray = new int[19];
	ArrayList<Integer> ratings = new ArrayList<Integer>();
	double average;
	double averageTotalCounter;
	int median;
	
	public String getmovieID() {
		return movieID;
	}
	public void setmovieID(String ID) {
		this.movieID=ID;
	}
	public String getmovieName() {
		return movieName;
	}
	public void setmovieName(String name) {
		this.movieName=name;
	}
	public String getmovieDate() {
		return movieDate;
	}
	public void setmovieDate(String date) {
		this.movieDate=date;
	}
	public void addRating(int rating) {
		ratings.add(rating);
	}
	public ArrayList<Integer> getRatings(){
		return ratings;
	}
	
	public double getAverage() {
		averageTotalCounter = 0;
		for(int i = 0; i <= ratings.size()-1; i++){
			averageTotalCounter = averageTotalCounter + (double)ratings.get(i);
		}
		return average = averageTotalCounter/ratings.size();
	}
	
	public static void setGenre(int genreID, String truefalse){
		genreArray[genreID] = Integer.parseInt(truefalse);
	}
	public static int[] getGenre() {
		return genreArray;
	}
	public String toString() {
		return "Movie ID = "+movieID +", Movie Name = "+movieName+", Movie Date = "+movieDate+"\n";
	}

}
