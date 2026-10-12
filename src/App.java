import java.util.Scanner;

public class App {
    public static void start(){
        Library Lib = new Library();

        Book titanic = new Book(0, "Titanic", true, "Walter Lord", "Drama");
        Book bb = new Book(1, "Breaking Bad", true, "Vince Gilligan", "Criminal");
        Book hobbit = new Book(5, "The Hobbit", true, "J.R.R. Tolkien", "Fantasy");
        Book dune = new Book(7, "Dune", true, "Frank Herbert", "Science Fiction");
        Magazine news = new Magazine(2, "nres", true, 123);
        Member memberAdmin = new Member(0, "admin");

        Lib.addBook(dune);
        Lib.addBook(titanic);
        Lib.addBook(bb);
        Lib.addBook(hobbit);
        Lib.addMagazine(news);
        Lib.registerMember(memberAdmin);

        Lib.borrowItem(memberAdmin, news);
        Lib.getOverDueItems();

        int choice = 0;
        Scanner sc = new Scanner(System.in);

        while(choice != 9){
            System.out.println("========== LIBRARY SYSTEM ==========\n" + //
                                "1. Show all books or magazines\n" + //
                                "2. Add a book or magazine\n" + //
                                "3. Register a member\n" + //
                                "4. Borrow a book or magazine\n" + //
                                "5. Return a book or magazine\n" + //
                                "6. Show borrowed items\n" + //
                                "7. Show overdue items\n" + //
                                "8. Search for a book or magazine\n" + //
                                "9. Exit\n" + //
                                "====================================\n" + //
                                "Choose an option:");
        choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Book (1) or magazine (2)?");
                int choice2 = sc.nextInt();
                sc.nextLine();
                if (choice2 == 1){
                    Lib.getAllBooks();
                } else if (choice2 == 2){
                    Lib.getAllMagazines();
                } else {
                    System.out.println("Choose right value!");
                }
                break;
            case 2:
                System.out.println("Book (1) or magazine (2)?");
                int choice3 = sc.nextInt();
                sc.nextLine();
                if (choice3 == 1){
                    System.out.println("Enter title:");
                    String title = sc.nextLine();
                    System.out.println("Now the Author: ");
                    String author = sc.nextLine();
                    System.out.println("Genre: ");
                    String genre = sc.nextLine();
                    Book book = new Book((int)(Math.random()*10001), title, true, author, genre);
                    Lib.addBook(book);
                } else if (choice3 == 2){
                    System.out.println("Enter title:");
                    String title = sc.nextLine();
                    System.out.println("Enter the issue number: ");
                    int issueNum = sc.nextInt();
                    sc.nextLine();
                    Magazine magazine = new Magazine((int)(Math.random()*10001), title, false, issueNum);
                    Lib.addMagazine(magazine);
                } else {
                    System.out.println("Choose right value!");
                }
                break;
            case 3:
                System.out.println("Enter member's name: ");
                String name = sc.nextLine();
                Member member = new Member((int)(Math.random()*10001), name);
                Lib.registerMember(member);
                System.out.println("Registered! Your ID: " + member.getID());
                break;
            case 4:
                System.out.println("Book (1) or magazine (2)?");

                int choice4 = sc.nextInt();
                sc.nextLine();
                if (choice4 == 1){
                    System.out.println("Enter books ID:");
                    int ID = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter member's ID: ");
                    int borrowerID = sc.nextInt();
                    sc.nextLine();

                    Member borrower = Lib.getMemberById(borrowerID);
                    Book book = Lib.getBookById(ID);
                    
                    Lib.borrowItem(borrower, book);
                } else if (choice4 == 2){
                    System.out.println("Enter magazines ID:");
                    int ID = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter member's ID: ");
                    int borrowerID = sc.nextInt();
                    sc.nextLine();

                    Member borrower = Lib.getMemberById(borrowerID);
                    Magazine magazine = Lib.getMagazineById(ID);
                    
                    Lib.borrowItem(borrower, magazine);
                } else {
                    System.out.println("Choose right value!");
                }
                break;
            case 5:
                System.out.println("Book (1) or magazine (2)?");

                int choice5 = sc.nextInt();
                sc.nextLine();
                if (choice5 == 1){
                    System.out.println("Enter books ID:");
                    int ID = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter member's ID: ");
                    int borrowerID = sc.nextInt();
                    sc.nextLine();

                    Member returner = Lib.getMemberById(borrowerID);
                    Book book = Lib.getBookById(ID);
                    
                    Lib.returnItem(returner, book);
                } else if (choice5 == 2){
                    System.out.println("Enter magazines ID:");
                    int ID = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter member's ID: ");
                    int borrowerID = sc.nextInt();
                    sc.nextLine();

                    Member returner = Lib.getMemberById(borrowerID);
                    Magazine magazine = Lib.getMagazineById(ID);
                    
                    Lib.returnItem(returner, magazine);
                } else {
                    System.out.println("Choose right value!");
                }
                break;
            case 6:
                Lib.getBorrowedItems();
                break;
            case 7:
                Lib.getOverDueItems();
                break;
            case 8:
                System.out.println("Book (1) or magazine (2)?");
                int choice8 = sc.nextInt();
                sc.nextLine();
                if (choice8 == 1){
                    System.out.println("Enter books ID:");
                    int ID = sc.nextInt();
                    sc.nextLine();
                    Lib.getBookById(ID).getDescription();
                } else if (choice8 == 2){
                    System.out.println("Enter magazines ID:");
                    int ID = sc.nextInt();
                    sc.nextLine();
                    Lib.getMagazineById(ID).getDescription();
                } else {
                    System.out.println("Choose right value!");
                }
                break;
            default:
                break;
        }
        }
        sc.close();
    }
}
