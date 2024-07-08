import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int row = 1, col = 1;
        int resume = 1, user = 1, select =1 ;
        BillList bills = new BillList();
        SignUp su = new SignUp();
        Scanner sc = new Scanner(System.in);
        Movies m = new Movies("The Godfather", "Francis Ford Coppola", "The aging patriarch of an organized crime dynasty in postwar New York City transfers control of his clandestine empire to his reluctant youngest son.", Movies.Category.Drama, "Al Pacino", "Marlon Brando", "James Caan");
        Movies m2 = new Movies("The Matrix", "The Wachowski Brothers", "A computer hacker joins forces with rebel warriors to battle a malevolent cyber intelligence", Movies.Category.Action, "Keanu Reaeves", "Lawrence Fishburn", "Carrie-Anne Moss");
        Movies m3 = new Movies("Jab we Met","Imtiaz Ali" , "Geet, who plans to elope with her lover, helps Aditya in his lowest phase of life.", Movies.Category.Romance, "Shahid Kapoor", "Kareena Kapoor", "Dara Singh");
        Movies m4 = new Movies("Gone Girl", "David Fincher", "In Carthage, Mo., former New York-based writer Nick Dunne (Ben Affleck) and his glamorous wife Amy (Rosamund Pike) present a portrait of a blissful marriage to the public. However, when Amy goes missing on the couple's fifth wedding anniversary, Nick becomes the prime suspect in her disappearance. The resulting police pressure and media frenzy cause the Dunnes' image of a happy union to crumble, leading to tantalizing questions about who Nick and Amy truly are.", Movies.Category.Thriller, "Rosamund Pike", "Ben Affleck", "Neil Patrick Harris");
        Movies m5 = new Movies("The Menu", "Mark Mylod", "A young couple travels to a remote island to eat at an exclusive restaurant where the chef has prepared a lavish menu, with some shocking surprises.", Movies.Category.Horror,"Ralph Fiennes", "Anya Taylor-Joy", "Nicholas Hoult");
        Movies m6 = new Movies("Phir Hera Pheri", "Nerraj Vora", "Three friends must find a way to repay a gangster.", Movies.Category.Comedy, "Akshay Kumar", "Suniel Shetty", "Paresh Rawal");
        m.setMovieId();
        m2.setMovieId();
        m3.setMovieId();
        m4.setMovieId();
        m5.setMovieId();
        m6.setMovieId();
        m.setRating(5);
        m2.setRating(3);
        m3.setRating(4);
        m4.setRating(2);
        m5.setRating(1);
        m6.setRating(5);
        m.setMoviePrice();
        m2.setMoviePrice();
        m3.setMoviePrice();
        m4.setMoviePrice();
        m5.setMoviePrice();
        m6.setMoviePrice();
        MovieList ml = new MovieList();
        ml.addMovie(m);
        ml.addMovie(m2);
        ml.addMovie(m3);
        ml.addMovie(m4);
        ml.addMovie(m5);
        ml.addMovie(m6);
        System.out.println("\n------------ WELCOME TO REEL THEATRES --------------");
        System.out.println("-----Sign up now!-----");
        su.signUp();
        System.out.println("-----Log in-----");
        LogIn login = new LogIn(su);
        login.logIn();
        System.out.println("\nWATCH THE BEST MOVIES AT REELS IN THE BEST CINEMAS IN TOWN\n");
        System.out.println("\n----- OUR PRICES-----");
        System.out.println("Standard Theater Tickets:" + "\n350 PKR" + "\n(Movies with a rating of 4 and above will have a ticket price of 450 PKR)\n");
        System.out.println("\nPremium Theater Tickets will charge an additional 250 PKR to the Standard prices");
        System.out.println("\nVIP Theater Tickets will charge an additional 450 PKR to the Standard prices");
        while(resume==1){
            System.out.println("\n\n -------------- OUR SHOWS -------------");
            ml.showMovies();
            System.out.println("\n-----MOVIE SELECTION-----");
            System.out.println("Enter Movie number to select: ");
            int choose = sc.nextInt();
            int selection = choose;
            ml.selectMovie(choose);
            System.out.println("-----THEATER SELECTION-----\n\n1)---Standard Theater---\nOur standard theater offers a comfortable and enjoyable movie experience at an affordable price. The seating arrangements are basic, with simple, cushioned seats that offer a good view of the screen. Standard audio and video equipment deliver clear and immersive movie sound and picture quality.\n2)---Premium Theater---\nOur Premium theater offers a more luxurious movie experience with enhanced audio and video quality. The seating arrangements are more comfortable and spacious, with larger seats that recline, and footrests that allow for maximum relaxation. It features a larger screen and better sound systems with advanced technologies like Dolby Atmos and THX-certified audio.\n3---VIP Theater---\nOur VIP theater offers the ultimate movie experience, with the highest level of comfort, luxury, and exclusivity. The seating arrangements are designed for maximum relaxation, with plush, oversized reclining chairs, individual tables, and personal service from a waitstaff. VIP theaters feature the latest audio and video technologies, including laser projection and 4K Ultra HD resolution.\n");
            System.out.println("Choose Theater by number: ");
            int TheaterChoice = sc.nextInt();
            switch (TheaterChoice) {
                case 1:
                    Theater Standard = new Theater(ml, Theater.TheaterTypes.Standard);
                    System.out.println("You have chosen the Standard Theater");
                    Seats StandardSeats = new Seats(Standard);
                    StandardSeats.setSeats(m2.getRating());
                    System.out.println("-----SEAT SELECTION-----");
                    System.out.println("\nSeats marked with X are already occupied");
                    while (col != 0) {
                        StandardSeats.printSeats();
                        System.out.println("\nEnter seat row: ");
                        row = sc.nextInt();
                        System.out.println("Enter seat column (0 to stop): ");
                        col = sc.nextInt();
                        StandardSeats.selectSeats(row, col);
                    }
                    switch (selection) {
                        case 1:
                            Standard.setTheaterPrice(m.getMovieId());
                            Bill b = new Bill(StandardSeats, m, Standard, su);
                            bills.addMovieBill(b);
                            break;
                        case 2:
                            Standard.setTheaterPrice(m2.getMovieId());
                            Bill bill = new Bill(StandardSeats, m2, Standard, su);
                            bills.addMovieBill(bill);
                            break;
                        case 3:
                            Standard.setTheaterPrice(m3.getMovieId());
                            Bill BILL = new Bill(StandardSeats, m3, Standard, su);
                            bills.addMovieBill(BILL);
                            break;
                        case 4:
                            Standard.setTheaterPrice(m4.getMovieId());
                            Bill bill1 = new Bill(StandardSeats, m4, Standard, su);
                            bills.addMovieBill(bill1);
                            break;
                        case 5:
                            Standard.setTheaterPrice(m5.getMovieId());
                            Bill bill2 = new Bill(StandardSeats, m5, Standard, su);
                            bills.addMovieBill(bill2);
                            break;
                        case 6:
                            Standard.setTheaterPrice(m6.getMovieId());
                            Bill bill3 = new Bill(StandardSeats, m6, Standard, su);
                            bills.addMovieBill(bill3);
                            break;
                    }
                    System.out.println("Press 1 to browse movies or 0 to confirm purchases");
                    resume = sc.nextInt();
                    if(resume==0) {
                        System.out.println("----THANK YOU FOR YOUR PURCHASES----");
                        bills.showBills();
                        System.exit(1);
                    }
                    else{
                        col=1;
                    }
                    break;
                case 2:
                    Theater Premium = new Theater(ml, Theater.TheaterTypes.Premium);
                    System.out.println("You have chosen the Premium Theater");
                    Seats PremiumSeats = new Seats(Premium);
                    PremiumSeats.setSeats(m2.getRating());
                    System.out.println("-----SEAT SELECTION-----");
                    System.out.println("\nSeats marked with X are already occupied");
                    while (col != 0) {
                        PremiumSeats.printSeats();
                        System.out.println("\nEnter seat row: ");
                        row = sc.nextInt();
                        System.out.println("Enter seat column (0 to stop): ");
                        col = sc.nextInt();
                        PremiumSeats.selectSeats(row, col);
                    }
                    switch (selection) {
                        case 1:
                            Premium.setTheaterPrice(m.getMovieId());
                            Bill b = new Bill(PremiumSeats, m, Premium, su);
                            bills.addMovieBill(b);
                            break;
                        case 2:
                            Premium.setTheaterPrice(m2.getMovieId());
                            Bill bill = new Bill(PremiumSeats, m2, Premium, su);
                            bills.addMovieBill(bill);
                            break;
                        case 3:
                            Premium.setTheaterPrice(m3.getMovieId());
                            Bill BILL = new Bill(PremiumSeats, m3, Premium, su);
                            bills.addMovieBill(BILL);
                            break;
                        case 4:
                            Premium.setTheaterPrice(m4.getMovieId());
                            Bill bill1 = new Bill(PremiumSeats, m4, Premium, su);
                            bills.addMovieBill(bill1);
                            break;
                        case 5:
                            Premium.setTheaterPrice(m5.getMovieId());
                            Bill bill2 = new Bill(PremiumSeats, m5, Premium, su);
                            bills.addMovieBill(bill2);
                            break;
                        case 6:
                            Premium.setTheaterPrice(m6.getMovieId());
                            Bill bill3 = new Bill(PremiumSeats, m6, Premium, su);
                            bills.addMovieBill(bill3);
                            break;
                    }
                    System.out.println("Press 1 to browse movies or 0 to confirm purchases");
                    resume = sc.nextInt();
                    if(resume==0) {
                        System.out.println("----THANK YOU FOR YOUR PURCHASES----");
                        bills.showBills();
                        System.exit(1);
                    }
                    else{
                        col=1;
                    }
                    break;
                case 3:
                    Theater Vip = new Theater(ml, Theater.TheaterTypes.VIP);
                    System.out.println("\nYou have chosen the VIP Theater\n");
                    Seats VIPSeats = new Seats(Vip);
                    VIPSeats.setSeats(m2.getRating());
                    System.out.println("-----SEAT SELECTION-----");
                    System.out.println("\nSeats marked with X are already occupied");
                    while (col != 0) {
                        VIPSeats.printSeats();
                        System.out.println("\nEnter seat row: ");
                        row = sc.nextInt();
                        System.out.println("Enter seat column (0 to stop): ");
                        col = sc.nextInt();
                        VIPSeats.selectSeats(row, col);
                    }
                    switch (selection) {
                        case 1:
                            Vip.setTheaterPrice(m.getMovieId());
                            Bill b = new Bill(VIPSeats, m, Vip, su);
                            bills.addMovieBill(b);
                            break;
                        case 2:
                            Vip.setTheaterPrice(m2.getMovieId());
                            Bill bill = new Bill(VIPSeats, m2, Vip, su);
                            bills.addMovieBill(bill);
                            break;
                        case 3:
                            Vip.setTheaterPrice(m3.getMovieId());
                            Bill BILL = new Bill(VIPSeats, m3, Vip, su);
                            bills.addMovieBill(BILL);
                            break;
                        case 4:
                            Vip.setTheaterPrice(m4.getMovieId());
                            Bill bill1 = new Bill(VIPSeats, m4, Vip, su);
                            bills.addMovieBill(bill1);
                            break;
                        case 5:
                            Vip.setTheaterPrice(m5.getMovieId());
                            Bill bill2 = new Bill(VIPSeats, m5, Vip, su);
                            bills.addMovieBill(bill2);
                            break;
                        case 6:
                            Vip.setTheaterPrice(m6.getMovieId());
                            Bill bill3 = new Bill(VIPSeats, m6, Vip, su);
                            bills.addMovieBill(bill3);
                            break;
                    }
                    System.out.println("Press 1 to browse movies or 0 to confirm purchases");
                    resume = sc.nextInt();
                    if(resume==0) {
                        System.out.println("----THANK YOU FOR YOUR PURCHASES----");
                        bills.showBills();
                        System.exit(1);
                    }
                    else{
                        col=1;
                    }
                    break;
            }
        }
    }
}