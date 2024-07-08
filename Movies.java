public class Movies {
    private static int cnt=0;
    private String MovieId;
    private String MovieName;
    private String Director;
    private String Description;
    private String Cast1, Cast2, Cast3;
    private String Genre;
    private int rating;
    private int MoviePrice;
    public void setMoviePrice() {
        if(rating<4){
            MoviePrice=350;
        }
        else{
            MoviePrice = 400;
        }
    }
    public int getMoviePrice() {
        return MoviePrice;
    }
    public void setMovieId() {
        MovieId = MovieName.substring(0,2) + cnt++;
    }
    public String getMovieId () {
        return MovieId;
    }
    public Movies(String movieName, String director, String description, Category genre, String Cast1, String Cast2, String Cast3) {
        MovieName = movieName;
        Director = director;
        Description = description;
        Genre = genre.toString();
        this.Cast1=Cast1;
        this.Cast2=Cast2;
        this.Cast3=Cast3;
    }
    public void setRating(int rating) {
        if(rating>0 && rating<=5) {
            this.rating = rating;
        }
        else{
            System.out.println("Ratings should range from 1-5");
        }
    }

    public int getRating() {
        return rating;
    }

    public void showRating(){
        int stars = getRating();
        for(int i=1; i<=stars; i++){
            System.out.print("★");
        }
    }
    public enum Category{
        Thriller, Action, Drama, Horror, Comedy, Romance;
    }
    public void setGenre(Category genre){
        Genre = genre.toString();
    }
    public String getGenre() {
        return Genre;
    }
    public String getCast() {
        return Cast1+", "+Cast2+", "+Cast3;
    }
    public void setCast(String Cast1, String Cast2, String Cast3){
        this.Cast1=Cast1;
        this.Cast2=Cast2;
        this.Cast3=Cast3;
    }
    public String getMovieName() {
        return MovieName;
    }
    public void setMovieName(String movieName) {
        MovieName = movieName;
    }
    public String getDirector() {
        return Director;
    }
    public void setDirector(String director) {
        Director = director;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        Description = description;
    }
}