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
