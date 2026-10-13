import java.time.LocalDate;

public abstract class LibraryItem implements Borrowable {
    private int ID;
    private String title;
    private boolean available;

    public LibraryItem(){};

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

    public boolean borrow(Member member, LocalDate borrowDate, LocalDate dueDate, int loanPeriod){
        if (this.getAvailability()){
            this.setAvailability(false);
            member.addToBorrowed(this);

            System.out.println(member.getName() + " borrowed item " + this.getTitle() + " on " + borrowDate + " till: " + borrowDate.plusDays(loanPeriod));
            System.out.println("-----------------------------------------------------");
            return true;
        } else {
            System.out.println(member.getName() + " item " + this.getTitle() + " is not available");
            System.out.println("-----------------------------------------------------");
            return false;
        }
        
    }
    public boolean returnItem(Member member, LocalDate dueDate){
        if (!this.getAvailability() && member.hasBorrowed(this)){
            this.setAvailability(true);
            member.removeFromBorrowed(this);

            if (LocalDate.now().isAfter(dueDate)){
                System.out.println(member.getName() + " returned item " + this.getTitle() + " overdue by "  + java.time.temporal.ChronoUnit.DAYS.between(dueDate, LocalDate.now()) + " days.");
                System.out.println("-----------------------------------------------------");
            } else{
                System.out.println(member.getName() + " returned item " + this.getTitle() + " on time");
                System.out.println("-----------------------------------------------------");
            }
            return true;
        } else {
            System.out.println(member.getName() + " you did not borrow " + this.getTitle());
            System.out.println("-----------------------------------------------------");
            return false;
        }        
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
