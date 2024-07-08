import java.util.*;
public class MovieList{
    private ArrayList <Movies> MovieList = new ArrayList<>();
    public void addMovie(Movies movie){
        MovieList.add(movie);
    }
    public void removeMovie(Movies movie){
        MovieList.remove(movie);
    }
    public Movies searchMoviebyId(String id){
        for(Movies m: MovieList){
            if(id.equals(m.getMovieId())){
                return m;
            }
        }
        return null;
    }
    public void selectMovie(int index){
        System.out.println("\nYou have chosen "+MovieList.get(index-1).getMovieName()+", Directed by "+MovieList.get(index-1).getDirector()+"\n\n");

    }
    public void showMovies(){
        int cnt=1;
        for(Movies i: MovieList){
            System.out.println("\n"+ cnt + ") Movie Name: "+i.getMovieName()+"\n  Movie Cast: "+i.getCast()+"\n  "+i.getGenre()+"\n  Directed by: "+i.getDirector()+"\n  Movie Description: "+i.getDescription());
            System.out.print("Rating: ");
            i.showRating();
            System.out.println(" ");
            cnt++;
        }
    }
}