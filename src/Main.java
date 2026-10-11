public class Main {
    public static void main(String[] args) throws Exception {
        // App.start();
        Book b = new Book(0, "Titanic", false, "Walter Lord", "Drama");
        Book b1 = new Book(1, "Breaking Bad", true, "Vince Gilligan", "Criminal");
        
        Library AstanaLib = new Library();
        AstanaLib.addBook(b);
        AstanaLib.addBook(b1);
        AstanaLib.getAllBooks();
    }
}
