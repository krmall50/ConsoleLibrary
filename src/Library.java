import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Magazine> magazines;
    private ArrayList<Member> members;

    public Library(){
        this.books = new ArrayList<>();
        this.magazines = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void registerMember(Member member){
        members.add(member);
    }

    public void borrowItem(Member member, LibraryItem item){
        item.borrow(item, member);
    }

    public void returnItem(Member member, LibraryItem item){
        item.returnItem(item, member);
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
