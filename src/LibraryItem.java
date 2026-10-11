public abstract class LibraryItem implements Borrowable {
    private int ID;
    private String title;
    private boolean available;

    public LibraryItem(int ID, String title, boolean available){
        this.ID = ID;
        this.title = title;
        this.available = available;
    }
    public abstract void getDescription();

    public void setID(int ID){
        if (ID >= 0){
            this.ID = ID;
        }
    }

    public void borrow(LibraryItem item, Member member){
        item.setAvailability(false);
        member.AddToBorrowed(item);
    }
    public void returnItem(LibraryItem item, Member member){
        item.setAvailability(true);
        member.RemoveFromBorrowed(item);
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAvailability(boolean available){
        this.available = available;
    }

    public int getID(){
        return ID;
    }
    
    public String getTitle(){
        return title;
    }

    public boolean getAvailability(){
        return available;
    }
}
