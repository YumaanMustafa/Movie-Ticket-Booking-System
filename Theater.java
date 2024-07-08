import java.util.*;
public class Theater {
    public enum TheaterTypes {
        Premium, VIP, Standard;
    }
    private MovieList ml;

    Theater(MovieList ml, TheaterTypes type){
        this.ml = ml;
        this.type = type;
    }
    private TheaterTypes type;
    public void setType(TheaterTypes type) {
        this.type = type;
    }
    public TheaterTypes getType() {
        return type;
    }
    private int TheaterPrice;
    public void setTheaterPrice(String id) {
        switch (getType()){
            case Premium -> {
                TheaterPrice = ml.searchMoviebyId(id).getMoviePrice() + 250;
            }
            case VIP -> {
                TheaterPrice = ml.searchMoviebyId(id).getMoviePrice() + 450;
                break;
            }
            case Standard -> {
                TheaterPrice = ml.searchMoviebyId(id).getMoviePrice();
                break;
            }
            default -> TheaterPrice = 0;
        }
    }
    public int getTheaterPrice() {
        return TheaterPrice;
    }
}