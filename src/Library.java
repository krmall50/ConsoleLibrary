import java.util.ArrayList;

public class Library {
    private  ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void getAllBooks(){
        for(Book book: books){
            book.getDescription();
        }
    }

}
