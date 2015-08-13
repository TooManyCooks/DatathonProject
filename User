package Utility;
import java.util.ArrayList;

public class User {
	private String ID = "undefined";
	private String age = "undefined";
	private String job = "undefined";
	private String gender = "undefined";
	static ArrayList<int[]> ratingsArray = new ArrayList<int[]>();
	static int[] tempArray = new int[2];
	
	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID=ID;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age=age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job=job;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public static void setRatings(String ratings, String movieID) {
		int intRatings = Integer.parseInt(ratings);
		int intMovieID = Integer.parseInt(movieID);
		tempArray[0]=intMovieID;
		tempArray[1]=intRatings;
		ratingsArray.add(tempArray);
	}
	public static ArrayList<int[]> getRatings(){
		return ratingsArray;
	}
	public String toString() {
		return "ID="+ID+", Age="+age+", Gender="+gender+", Job="+job+"\n"; 
	}
}
