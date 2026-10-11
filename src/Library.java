import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Magazine> magazines;
    private ArrayList<Member> members;

    public Library(ArrayList<Book> books, ArrayList<Magazine> magazines, ArrayList<Member> members){
        this.books = books;
        this.magazines = magazines;
        this.members = members;
    }

    public void registerMember(Member member){
        members.add(member);
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void getAllBooks(){
        System.out.println("All books: ");
        for(Book book: books){
            book.getDescription();
        }
    }

    public void addMagazine(Magazine magazine){
        magazines.add(magazine);
    }

    public void getAllMagazines(){
        System.out.println("All magazines: ");
        for(Magazine magazine: magazines){
            magazine.getDescription();
        }
    }

}
