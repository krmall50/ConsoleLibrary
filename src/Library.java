import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Magazine> magazines;
    private ArrayList<Member> members;
    private HashMap<LibraryItem, Member> borrowedItems;
    private HashMap<LibraryItem, LocalDate> borrowDates;

    public Library(){
        this.books = new ArrayList<>();
        this.magazines = new ArrayList<>();
        this.members = new ArrayList<>();
        this.borrowedItems = new HashMap<>();
        this.borrowDates = new HashMap<>();
    }

    public class LibraryConfig{
        private int loanPeriod;

        public LibraryConfig(int loanPeriod){
            this.loanPeriod = loanPeriod;
        }

        public void setLoanPeroid(int loanPeriod){
            if (loanPeriod > 0){
                this.loanPeriod = loanPeriod;
            }   
        }
        public int getLoanPeriod(){
            return loanPeriod;
        }

    }

    public void registerMember(Member member){
        members.add(member);
    }
    public boolean isRegistered(Member member){
        return members.contains(member);
    }

    public void getBorrowedItems(){
        if (borrowedItems.size() == 0){
            System.out.println("No borrowed items.");
            return;
        }

        System.out.println("All borrowed Items:");
        for(LibraryItem item: borrowedItems.keySet()){
            item.getDescription();
            System.out.println("Borrowed by: " + borrowedItems.get(item).getName() + " till " + borrowDates.get(item) + "\n");
        }
    }

    public void borrowItem(Member member, LibraryItem item){
        if(!isRegistered(member)){
            System.out.println(member.getName() + " is not registered.");
            return;
        }

        Library.LibraryConfig config = this.new LibraryConfig(14);
        LocalDate borrowDate = LocalDate.now();
        LocalDate dueDate = borrowDate.plusDays(config.getLoanPeriod());        
        
        item.borrow(item, member, borrowDate, dueDate);
        
        borrowedItems.put(item, member);
        borrowDates.put(item, dueDate);
    }

    public void returnItem(Member member, LibraryItem item){
        if(!isRegistered(member)){
            System.out.println(member.getName() + " is not registered.");
            return;
        }
        item.returnItem(item, member, borrowDates.get(item));
        borrowedItems.remove(item, member);
        borrowDates.remove(item, borrowDates.get(item));
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void getAllBooks(){
        System.out.println("All books: ");
        for(Book book: books){
            book.getDescription();
            System.out.println("--------------");
        }
        System.out.println("--------------------------------------------");
    }

    public void addMagazine(Magazine magazine){
        magazines.add(magazine);
    }

    public void getAllMagazines(){
        System.out.println("All magazines: ");
        for(Magazine magazine: magazines){
            magazine.getDescription();
            System.out.println("--------------");
        }
        System.out.println("--------------------------------------------");
    }

}
