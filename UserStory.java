import java.util.Scanner;

public class UserStory {
  
private Movie[] movies;

  public UserStory(String titleFile, String overviewFile, String voteCountFile, String ratingFile) {
    movies = createMovie(titleFile, overviewFile, voteCountFile, ratingFile);
  }

//Creates the arrays for each file
public Movie[] createMovie(String titleFile, String overviewFile, String voteCountFile, String ratingFile) {
  String[] title = FileReader.toStringArray(titleFile);
  String[] overview = FileReader.toStringArray(overviewFile);
  double[] voteCount = FileReader.toDoubleArray(voteCountFile);
  double[] ratings = FileReader.toDoubleArray(ratingFile);
Movie[] tempMovies = new Movie[title.length];

// Creates a new movie and its information to print to the console.
  for( int i = 0; i < tempMovies.length; i++){
tempMovies[i] = new Movie(title[i], overview[i], voteCount[i], ratings[i]);
  }
return tempMovies;
}

// Returns the information about the data to the console
public String toString() {
  String result = "";

  for (Movie m : movies) {
    result += m + "\n";
  }
  
  return result;
}

  

   }

