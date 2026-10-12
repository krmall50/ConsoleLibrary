import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Member {
    private int ID;
    private String name;
    private ArrayList<LibraryItem> borrowedItems;
    public HashMap<LibraryItem, LocalDate> loans;


    public Member(int ID, String name){
        this.ID = ID;
        this.name = name;
        this.borrowedItems = new ArrayList<>();
        this.loans = new HashMap<>();
    }

    public class LoanDetails{

        public void getLoans(){
            System.out.println(name + "'s all loans: ");
            for(LibraryItem key: loans.keySet()){
                System.out.println(key.getTitle() + " till " + loans.get(key));
            }
            System.out.println("----------------------------------");
        }

        public void addLoan(LibraryItem item, LocalDate dueDate){
            loans.put(item, dueDate);
        }

        public void removeLoan(LibraryItem item, LocalDate dueDate){
            loans.remove(item, dueDate);
        }
    }
    public boolean hasBorrowed(LibraryItem item){
        if(borrowedItems.contains(item)){
            return true;
        }
        return false;
    }
    public void AddToBorrowed(LibraryItem item){
        borrowedItems.add(item);
    }
    public void RemoveFromBorrowed(LibraryItem item){
        borrowedItems.remove(item);
    }
    public void SetID(int ID){
        this.ID = ID;
    }
    public void SetName(String name){
        this.name = name;
    }
    public int getID(){
        return ID;
    }
    public String getName(){
        return name;
    }

}
