import java.util.ArrayList;

public class Book extends LibraryItem {
    private static ArrayList<Book> books = new ArrayList<>();
    private String author;
    private String genre;

    public Book(int ID, String title, boolean available, String author, String genre){
        super(ID, title, available);
        this.author = author;
        this.genre = genre;
    }

    public void getDescription(){
        System.out.println("ID: " + getID());
        System.out.println("Title: " + getTitle());
        System.out.println("Available: " + getAvailability());
        System.out.println("Author: " + getAuthor());
        System.out.println("Genre: " + getGenre());
        System.err.println();
    }
    public static void addBook(Book book){
        books.add(book);
    }

    public static void getAllBooks(){
        for(Book book: books){
            book.getDescription();
        }
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public String getAuthor(){
        return author;
    }

    public String getGenre(){
        return genre;
    }
}
