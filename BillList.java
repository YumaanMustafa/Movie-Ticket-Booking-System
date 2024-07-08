import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class BillList {
    private ArrayList<Bill>Bills = new ArrayList<>();
    public void addMovieBill(Bill b){
        Bills.add(b);
    }
    public void showBills(){
        for(Bill b: Bills){
            b.printBill();
        }
    }
}