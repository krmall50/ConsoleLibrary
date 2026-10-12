public class Main {
    public static void main(String[] args) throws Exception {
        // App.start();
        Book titanic = new Book(0, "Titanic", true, "Walter Lord", "Drama");
        Book bb = new Book(1, "Breaking Bad", true, "Vince Gilligan", "Criminal");
        Book gatsby = new Book(2, "The Great Gatsby", true, "F. Scott Fitzgerald", "Classic");
        Book nineteenEightyFour = new Book(3, "1984", true, "George Orwell", "Dystopian");
        Book mockingbird = new Book(4, "To Kill a Mockingbird", true, "Harper Lee", "Drama");
        Book hobbit = new Book(5, "The Hobbit", true, "J.R.R. Tolkien", "Fantasy");
        Book prideAndPrejudice = new Book(6, "Pride and Prejudice", true, "Jane Austen", "Romance");
        Book dune = new Book(7, "Dune", true, "Frank Herbert", "Science Fiction");
        Book daVinciCode = new Book(8, "The Da Vinci Code", true, "Dan Brown", "Thriller");
        Book crimeAndPunishment = new Book(9, "Crime and Punishment", true, "Fyodor Dostoevsky", "Criminal");
        Book catcherInTheRye = new Book(10, "The Catcher in the Rye", true, "J.D. Salinger", "Fiction");
        Book harryPotter = new Book(11, "Harry Potter and the Sorcerer's Stone", true, "J.K. Rowling", "Fantasy");

        Magazine m = new Magazine(0, "Fasion", true, 1);
        Magazine m1 = new Magazine(1, "News", true, 2);

        Member jesse = new Member(0, "jesse");
        Member jack = new Member(0, "jack");
        Member.LoanDetails loan = jack.new LoanDetails();
        Member.LoanDetails loan2 = jesse.new LoanDetails();

        Library AstanaLib = new Library();
        AstanaLib.registerMember(jesse);
        AstanaLib.registerMember(jack);

        AstanaLib.addBook(titanic);
        AstanaLib.addBook(bb);


        AstanaLib.addMagazine(m);
        AstanaLib.addMagazine(m1);

        AstanaLib.borrowItem(jesse, dune);
        AstanaLib.borrowItem(jack, hobbit);
        
        loan2.getLoans();

        AstanaLib.returnItem(jesse, dune);
        AstanaLib.returnItem(jack, hobbit);

        AstanaLib.getBorrowedItems();

        AstanaLib.getAllBooks();
        AstanaLib.getAllMagazines();
    }
}
