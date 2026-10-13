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

    public boolean borrow(LibraryItem item, Member member, LocalDate borrowDate, LocalDate dueDate){
        if (item.getAvailability()){
            item.setAvailability(false);
            member.AddToBorrowed(item);

            Member.LoanDetails loans = member.new LoanDetails();
            loans.addLoan(item, dueDate);

            System.out.println(member.getName() + " borrowed item " + item.getTitle() + " on " + borrowDate + " till: " + borrowDate.plusDays(14));
            System.out.println("-----------------------------------------------------");
            return true;
        } else {
            System.out.println(member.getName() + " item " + item.getTitle() + " is not available");
            System.out.println("-----------------------------------------------------");
            return false;
        }
        
    }
    public boolean returnItem(LibraryItem item, Member member, LocalDate returnDate){
        if (!item.getAvailability() && member.hasBorrowed(item)){
            item.setAvailability(true);
            member.RemoveFromBorrowed(item);

            Member.LoanDetails loans = member.new LoanDetails();
            loans.removeLoan(item, returnDate);


            if (LocalDate.now().isAfter(returnDate)){
                System.out.println(member.getName() + " returned item " + item.getTitle() + " overdue by "  + LocalDate.now().compareTo(returnDate) + " days.");
                System.out.println("-----------------------------------------------------");
            } else{
                System.out.println(member.getName() + " returned item " + item.getTitle() + " on time");
                System.out.println("-----------------------------------------------------");
            }
            return true;
        } else {
            System.out.println(member.getName() + " you did not borrow " + item.getTitle());
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
