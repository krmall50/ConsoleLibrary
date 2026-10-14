import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Magazine> magazines;
    private ArrayList<Member> members;
    private HashMap<LibraryItem, Member> borrowedItems;
    private HashMap<LibraryItem, LocalDate> dueDates;

    public Library(){
        this.books = new ArrayList<>();
        this.magazines = new ArrayList<>();
        this.members = new ArrayList<>();
        this.borrowedItems = new HashMap<>();
        this.dueDates = new HashMap<>();
    }

    public class LibraryConfig{
        private int loanPeriod;

        public LibraryConfig(int loanPeriod){
            this.loanPeriod = loanPeriod;
        }

        public void setLoanPeriod(int loanPeriod){
            if (loanPeriod > 0){
                this.loanPeriod = loanPeriod;
            }   
        }
        public int getLoanPeriod(){
            return loanPeriod;
        }

    }

    public void getOverDueItems(){
        if (dueDates.size() == 0){
            System.out.println("No overdue items.");
            return;
        }
        System.out.println("Overdue Items: ");
        for (LibraryItem item: dueDates.keySet()){
            if(LocalDate.now().isAfter(dueDates.get(item))){                
                System.out.println( borrowedItems.get(item).getName() + " : " + item.getTitle()
                 + " overdue by " + java.time.temporal.ChronoUnit.DAYS.between(dueDates.get(item), LocalDate.now()) + " days.");
            };
        }
    }

    public Book getBookById(int ID){
        for(Book book: books){
            if(book.getID() == ID){
                return book;
            }
        }
        return null;
    }

    public Magazine getMagazineById(int ID){
        for(Magazine magazine: magazines){
            if(magazine.getID() == ID){
                return magazine;
            }
        }
        return null;
    }

    public LibraryItem getItemById(int ID){
        for(LibraryItem item: books){
            if(item.getID() == ID){
                return item;
            }
        }
        for(LibraryItem item: magazines){
            if(item.getID() == ID){
                return item;
            }
        }
        
        return null;
    }

    public Member getMemberById(int ID){
        for(Member member: members){
            if (member.getID() == ID){
                return member;
            }
        }
        return null;
    }

    public void registerMember(Member member){
        members.add(member);
    }
    public boolean isRegistered(Member member){
        if (member != null){
            for (Member m: members){
            if (m.getID() == member.getID()){
                return true;
            }
        }
        }    
        return false;
    }
    public boolean itemExists(LibraryItem item){
        if(getItemById(item.getID()) == null || item == null){
            return false;
        }
        return true;
    }

    public void getBorrowedItems(){
        if (borrowedItems.size() == 0){
            System.out.println("No borrowed items.");
            return;
        }

        System.out.println("All borrowed Items:");
        for(LibraryItem item: borrowedItems.keySet()){
            item.getDescription();
            System.out.println("Borrowed by: " + borrowedItems.get(item).getName() + " till " + dueDates.get(item) + "\n");
        }
    }

    public void borrowItem(Member member, LibraryItem item, Library.LibraryConfig config){
        if(!isRegistered(member)){
            System.out.println(member.getName() + " is not registered.");
            return;
        }
        LocalDate borrowDate = LocalDate.now();
        LocalDate dueDate = borrowDate.plusDays(config.getLoanPeriod());    
        
        if(item.borrow(member, borrowDate, dueDate, config.getLoanPeriod())){
            borrowedItems.put(item, member);
            dueDates.put(item, dueDate);
        }          
    }

    public void returnItem(Member member, LibraryItem item){
        if(!isRegistered(member)){
            System.out.println(member.getName() + " is not registered.");
            return;
        }
        if (!itemExists(item)){
            System.out.println("Item is not registered.");
            return;
        }
        if(item.returnItem(member, dueDates.get(item))){
            borrowedItems.remove(item, member);
            dueDates.remove(item, dueDates.get(item));
        }   
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void getAllBooks(){
        if (books.size() == 0){
            System.out.println("No Books.");
            return;
        }
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
        if (magazines.size() == 0){
            System.out.println("No magazines.");
            return;
        }

        System.out.println("All magazines: ");
        for(Magazine magazine: magazines){
            magazine.getDescription();
            System.out.println("--------------");
        }
        System.out.println("--------------------------------------------");
    }

}
