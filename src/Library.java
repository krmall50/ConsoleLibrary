import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Magazine> magazines = new ArrayList<>();

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
