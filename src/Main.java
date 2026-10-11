public class Main {
    public static void main(String[] args) throws Exception {
        // App.start();
        Book b = new Book(0, "Titanic", false, "Walter Lord", "Drama");
        Book b1 = new Book(1, "Breaking Bad", true, "Vince Gilligan", "Criminal");

        Magazine m = new Magazine(0, "Fasion", true, 1);
        Magazine m1 = new Magazine(1, "News", true, 2);

        Member member = new Member(0, "Jack");

        Library AstanaLib = new Library();

        AstanaLib.addBook(b);
        AstanaLib.addBook(b1);
        AstanaLib.registerMember(member);

        AstanaLib.addMagazine(m);
        AstanaLib.addMagazine(m1);

        AstanaLib.getAllBooks();
        AstanaLib.getAllMagazines();
    }
}
