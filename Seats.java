import java.util.*;
public class Seats{
    private Theater t;
    Seats(Theater t){
        this.t = t;
    }
    private int randrow, randcol, numRows, numSeatsPerRow,cnt;
    private char[][] seats;
    private int[][]selectedSeats = new int[0][2];
    private int TicketPrice;
    public void setSeats(int rating) {
        Random random = new Random();
        switch(t.getType().toString()){
            case "Standard":
                numRows=9;
                numSeatsPerRow = 20;
                seats = new char[numRows][numSeatsPerRow];
                if(rating>0 && rating<4){
                    while(cnt <= 90){
                        randrow = random.nextInt(numRows);
                        randcol = random.nextInt(numSeatsPerRow);
                        if (seats[randrow][randcol] == '\0') {
                            seats[randrow][randcol] = 'X';
                            cnt++;
                        }
                    }
                }
                if(rating>3 && rating <=5){
                    while(cnt <= 130){
                        randrow = random.nextInt(numRows);
                        randcol = random.nextInt(numSeatsPerRow);
                        if (seats[randrow][randcol] == '\0') {
                            seats[randrow][randcol] = 'X';
                            cnt++;
                        }
                    }
                }
                break;
            case "Premium":
                numRows=10;
                numSeatsPerRow = 10;
                seats = new char[numRows][numSeatsPerRow];
                if(rating>0 && rating<4){
                    while(cnt <= 50){
                        randrow = random.nextInt(numRows);
                        randcol = random.nextInt(numSeatsPerRow);
                        if (seats[randrow][randcol] == '\0') {
                            seats[randrow][randcol] = 'X';
                            cnt++;
                        }
                    }
                }
                if(rating>3 && rating <=5){
                    while(cnt <= 75){
                        randrow = random.nextInt(numRows);
                        randcol = random.nextInt(numSeatsPerRow);
                        if (seats[randrow][randcol] == '\0') {
                            seats[randrow][randcol] = 'X';
                            cnt++;
                        }
                    }
                }
                break;
            case "VIP":
                numRows=5;
                numSeatsPerRow = 10;
                seats = new char[numRows][numSeatsPerRow];
                if(rating>0 && rating<4){
                    while(cnt <= 25){
                        randrow = random.nextInt(numRows);
                        randcol = random.nextInt(numSeatsPerRow);
                        if (seats[randrow][randcol] == '\0') {
                            seats[randrow][randcol] = 'X';
                            cnt++;
                        }
                    }
                }
                if(rating>3 && rating <=5){
                    while(cnt <= 35){
                        randrow = random.nextInt(numRows);
                        randcol = random.nextInt(numSeatsPerRow);
                        if (seats[randrow][randcol] == '\0') {
                            seats[randrow][randcol] = 'X';
                            cnt++;
                        }
                    }
                }
                break;
            default:
                System.out.println("Seats not set");
        }
    }
    public int getNumRows() {
        return numRows;
    }
    public int getNumSeatsPerRow() {
        return numSeatsPerRow;
    }
    private int row, col;
    public void selectSeats(int seatrow, int seatcol)
    {
        if(seatcol == 0){
            printSelectedSeats();
            return;
        }
        boolean isValidIndex = false;
        while(!isValidIndex) {
            try {
                if (seats[seatrow - 1][seatcol - 1] == '\0') {
                    seats[seatrow - 1][seatcol - 1] = 'X';
                    System.out.println("You have selected a seat at row "+seatrow+", column "+seatcol);
                    addSelectedSeat(seatrow, seatcol);
                    isValidIndex = true;
                } else {
                    System.out.println("This seat is already occupied, please choose an unoccupied seat");
                    break;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid input");
                break;
            }
        }
    }
    public void printSelectedSeats() {
        System.out.println("Selected Seats:");
        if(selectedSeats.length == 0){
            System.out.println("None");
        }
        else {
            for (int i = 0; i < selectedSeats.length; i++) {
                if (selectedSeats[i][1] != 0) {
                    int seatrow = selectedSeats[i][0];
                    int seatcol = selectedSeats[i][1];
                    System.out.println(t.getType().toString()+" Seat: Row " + seatrow + ", Column " + seatcol);
                }
            }
        }
    }
    private void addSelectedSeat(int seatrow, int seatcol) {
        int[][] newSelectedSeats = new int[selectedSeats.length + 1][2];
        for (int i = 0; i < selectedSeats.length; i++) {
            newSelectedSeats[i] = selectedSeats[i];
        }
        newSelectedSeats[selectedSeats.length] = new int[]{seatrow, seatcol};
        selectedSeats = newSelectedSeats;
    }
    public int numOfSelectedSeats(){
        return selectedSeats.length;
    }

    public void printSeats(){
        System.out.print("\n\n     ");
        for (int i = 1; i <= numSeatsPerRow; i++) {
            if (i / 10 == 0) {
                System.out.print( i + "    ");
            } else {
                System.out.print(i + "   ");
            }
        }
        System.out.println();
        System.out.print("  ");
        for (int i = 1; i <= numSeatsPerRow; i++) {
            System.out.print("-------");
        }
        System.out.println();
        for (int row = 0; row < numRows; row++) {
            if((row+1)/10 == 0) {
                System.out.print((row + 1) + "  ");
            }
            else{
                System.out.print((row + 1) + " ");
            }
            for (int seat = 0; seat < numSeatsPerRow; seat++) {
                if (seats [row][seat] == 'X') {

                    System.out.print("[ "+seats[row][seat]+" ]");
                } else {
                    System.out.print("[   ]");
                }
            }
            System.out.println();
        }
        System.out.println("\n");
        for (int i = 1; i <= numSeatsPerRow; i++) {
            if(i==numSeatsPerRow/2){
                System.out.print("SCREEN");
            }
            System.out.print("-------");
        }
    }
    public void setTicketPrices(int TheaterPrice) {
        for(int i = 0; i< selectedSeats.length-1;i++){
            TicketPrice = TicketPrice+TheaterPrice;
        }
    }
    public int getTicketPrice() {
        return TicketPrice;
    }
}