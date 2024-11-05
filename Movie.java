public class Movie {

  // Instance variables
  private String title;
  private String overview;
  private double voteCount;
  private double rating;

  // Allows both values to be the same
  public Movie(String title, String overview, double voteCount, double rating){
    this.title = title;
    this.overview = overview;
    this.voteCount = voteCount;
    this.rating = rating;
  }

  // Get methods that return each value
  public String getTitle() {
    return title;
  }

    public String getOverview() {
    return overview;
  }

    public double getVoteCount() {
    return voteCount;
  }

      public double getRaiting() {
    return rating;
  }

  // Returns the title, overview, vote count, and rating of each movie 
public String toString() {
  return "\nTitle: " + title + "\nOverview: " + overview + "\nCount: " + voteCount + "\nRating: " + rating;
}
  
}