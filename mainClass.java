package Utility;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import com.opencsv.*;

public class mainClass {
	static int nullInt = 0;
	static List<user> users 				= new ArrayList<user>();
	public static List<movie> movies 		= new ArrayList<movie>();
	static ArrayList<Integer> predictions 	= new ArrayList<Integer>();
	static String usersReference 			= "C:\\Users\\Jake\\Desktop\\Course Work\\Algorithms\\Datathon Challenge\\Users.tsv";
	static String movieReference 			= "C:\\Users\\Jake\\Desktop\\Course Work\\Algorithms\\Datathon Challenge\\Movies.tsv";
	static String ratingReference 			= "C:\\Users\\Jake\\Desktop\\Course Work\\Algorithms\\Datathon Challenge\\Ratings.tsv";
	private static CSVReader csvReader;
	
	public static void main(String args[]) throws IOException {    
		parseUsers();
		parseMovies();
		parseRatings();
		prediction();
	}

	public static void parseUsers() throws IOException {
		CSVReader csvReader 		= new CSVReader(new FileReader(usersReference), '\t');
		List<String[]> records 		= csvReader.readAll();
		Iterator<String[]> iterator = records.iterator();
		 while(iterator.hasNext()){
			 String[] record = iterator.next();
			 user userReference = new user();
			 userReference.setID(record[0]);
			 userReference.setAge(record[1]);
			 userReference.setGender(record[2]);
			 userReference.setJob(record[3]);
			 users.add(userReference);
		 }
		 csvReader.close();
	}

	public static void parseMovies() throws IOException {
		CSVReader csvReader			= new CSVReader(new FileReader(movieReference), '\t');
		List<String[]> records		= csvReader.readAll();
		Iterator<String[]> iterator = records.iterator();
		while(iterator.hasNext()){
			 String[] record = iterator.next();
			 movie movieReference 		= new movie();
			 movieReference.setmovieID(record[0]);
			 movieReference.setmovieName(record[1]);
			 movieReference.setmovieDate(record[2]);
			 movies.add(movieReference);
		}
		csvReader.close();
	}

	public static void parseRatings() throws IOException {
		CSVReader csvReader 		= new CSVReader(new FileReader(ratingReference), '\t');
		List<String[]> records 		= csvReader.readAll();
		Iterator<String[]> iterator = records.iterator();
		while(iterator.hasNext()) {
			String[] record = iterator.next();
			movie movieReference = movies.get(Integer.parseInt(record[1])-1);
			movieReference.addRating(Integer.parseInt(record[2]));
			user userReference = users.get(Integer.parseInt(record[0])-1);
			user.setRatings(record[2], record[1]);
		}
		csvReader.close();
	}
	
	public static void prediction() throws IOException {
		String inData 	= "C:\\Users\\Jake\\Desktop\\Course Work\\Algorithms\\Datathon Challenge\\testData.tsv";
		CSVReader csvReader = new CSVReader(new FileReader(inData), '\t');
		List<String[]> records 		= csvReader.readAll();
		Iterator<String[]> iterator = records.iterator();
		while(iterator.hasNext()) {
			String[] record = iterator.next();
			Prediction prediction = new Prediction();
			prediction.setValues(Integer.parseInt(record[0]), Integer.parseInt(record[1]));
			predictions.add((int)prediction.getPrediction());
		}
		csvReader.close();
		System.out.println(predictions);
	}
}
