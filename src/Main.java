public class Main {
    public static void main(String[] args) throws Exception {
        // App.start();
        Book b = new Book(0, "Titanic", false, "Walter Lord", "Drama");
        Book b1 = new Book(1, "Breaking Bad", true, "Vince Gilligan", "Criminal");
        
        Book.addBook(b);
        Book.addBook(b1);
        Book.getAllBooks();
    }
}
