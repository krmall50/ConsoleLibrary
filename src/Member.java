import java.util.ArrayList;

public class Member {
    private int ID;
    private String name;
    private ArrayList<LibraryItem> borrowedItems;


    public Member(int ID, String name){
        this.ID = ID;
        this.name = name;
        this.borrowedItems = new ArrayList<>();
    }
    
    public boolean hasBorrowed(LibraryItem item){
        if(borrowedItems.contains(item)){
            return true;
        }
        return false;
    }
    public void addToBorrowed(LibraryItem item){
        borrowedItems.add(item);
    }
    public void removeFromBorrowed(LibraryItem item){
        borrowedItems.remove(item);
    }
    public void setID(int ID){
        if (ID >= 0){
            this.ID = ID;
        }   
    }
    public void setName(String name){
        this.name = name;
    }
    public int getID(){
        return ID;
    }
    public String getName(){
        return name;
    }

}
