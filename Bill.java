import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class Bill{
    private Seats s;
    private SignUp users;
    private Movies m;
    private Theater t;

    public Bill(Seats s, Movies m, Theater t, SignUp users) {
        this.s = s;
        this.m = m;
        this.t = t;
        this.users = users;
    }
    public void printBill() {
        System.out.println("========== Movie Ticket Bill ==========");
        System.out.println("Movie Name: " + m.getMovieName());
        System.out.println(t.getType().toString()+" Theater");
        System.out.println("---------------------------------------");
        s.printSelectedSeats();
        System.out.println("Number of Tickets: " + s.numOfSelectedSeats());
        System.out.println("Ticket Price: "+t.getTheaterPrice()+" PKR");
        System.out.println("Total Price: "+t.getTheaterPrice()*s.numOfSelectedSeats()+" PKR");
        System.out.println("Customer Name: "+ users.getName());
        System.out.println("=======================================");
    }
}