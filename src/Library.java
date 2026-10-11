import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Magazine> magazines;
    private ArrayList<Member> members;
    private HashMap<LibraryItem, Member> borrowedItems;

    public Library(){
        this.books = new ArrayList<>();
        this.magazines = new ArrayList<>();
        this.members = new ArrayList<>();
        this.borrowedItems = new HashMap<>();
    }

    public void registerMember(Member member){
        members.add(member);
    }

    public void getBorrowedItems(){
        System.out.println("All borrowed Items:");
        for(LibraryItem item: borrowedItems.keySet()){
            item.getDescription();
            System.out.println("Borrowed by: " + borrowedItems.get(item).getName() + "\n");
        }
    }

    public void borrowItem(Member member, LibraryItem item){
        item.borrow(item, member);
        borrowedItems.put(item, member);
    }

    public void returnItem(Member member, LibraryItem item){
        item.returnItem(item, member);
        borrowedItems.remove(member, item);
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
