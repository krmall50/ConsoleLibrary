import java.util.Scanner;

public class App {
    public static void start(){
        Library library = new Library();
        Library.LibraryConfig config = library.new LibraryConfig(14);

        Book titanic = new Book(0, "Titanic", true, "Walter Lord", "Drama");
        Book bb = new Book(1, "Breaking Bad", true, "Vince Gilligan", "Criminal");
        Book hobbit = new Book(5, "The Hobbit", true, "J.R.R. Tolkien", "Fantasy");
        Book dune = new Book(7, "Dune", true, "Frank Herbert", "Science Fiction");
        Magazine news = new Magazine(2, "nres", true, 123);
        Member member1 = new Member(0, "alex");
        Member member2 = new Member(1, "jane");

        library.addBook(dune);
        library.addBook(titanic);
        library.addBook(bb);
        library.addBook(hobbit);
        library.addMagazine(news);
        library.registerMember(member1);
        library.registerMember(member2);

        library.borrowItem(member1, news, config);
        library.borrowItem(member2, news, config);
        library.getOverDueItems();

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

        System.out.println("----------------------------------------------");

        switch (choice) {
            case 1:
                System.out.println("Book (1) or magazine (2)?");
                int choice2 = sc.nextInt();
                sc.nextLine();
                System.out.println("----------------------------------------------");

                if (choice2 == 1){
                    library.getAllBooks();
                } else if (choice2 == 2){
                    library.getAllMagazines();
                } else {
                    System.out.println("Choose right value!");
                }

                break;
            case 2:
                System.out.println("Book (1) or magazine (2)?");
                int choice3 = sc.nextInt();

                sc.nextLine();
                System.out.println("----------------------------------------------");

                if (choice3 == 1){
                    System.out.println("Enter title:");
                    String title = sc.nextLine();

                    System.out.println("Now the Author: ");
                    String author = sc.nextLine();

                    System.out.println("Genre: ");
                    String genre = sc.nextLine();

                    Book book = new Book(Utils.generateIdForLibraryItem(library), title, true, author, genre);
                    library.addBook(book);

                    System.out.println("Registered! Your books ID: " + book.getID());
                    System.out.println("----------------------------------------------");
                } else if (choice3 == 2){
                    System.out.println("Enter title:");
                    String title = sc.nextLine();
                    
                    System.out.println("Enter the issue number: ");
                    int issueNum = sc.nextInt();
                    sc.nextLine();

                    Magazine magazine = new Magazine(Utils.generateIdForLibraryItem(library), title, true, issueNum);
                    library.addMagazine(magazine);

                    System.out.println("Registered! Your magazine's ID: " + magazine.getID());
                    System.out.println("----------------------------------------------");
                } else {
                    System.out.println("Choose right value!");
                }
                break;
            case 3:
                System.out.println("Enter member's name: ");
                String name = sc.nextLine();

                Member member = new Member(Utils.generateIdForMember(library), name);
                library.registerMember(member);

                System.out.println("Registered! Your ID: " + member.getID());
                break;
            case 4:
                System.out.println("Book (1) or magazine (2)?");
                System.out.println("----------------------------------------------");

                int choice4 = sc.nextInt();
                sc.nextLine();

                if (choice4 == 1){
                    System.out.println("Enter books ID:");
                    int ID = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter member's ID: ");
                    int borrowerID = sc.nextInt();
                    sc.nextLine();

                    Member borrower = library.getMemberById(borrowerID);
                    Book book = library.getBookById(ID);
                    
                    library.borrowItem(borrower, book, config);
                } else if (choice4 == 2){
                    System.out.println("Enter magazines ID:");
                    int ID = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter member's ID: ");
                    int borrowerID = sc.nextInt();
                    sc.nextLine();

                    Member borrower = library.getMemberById(borrowerID);
                    Magazine magazine = library.getMagazineById(ID);
                    
                    library.borrowItem(borrower, magazine, config);
                } else {
                    System.out.println("Choose right value!");
                }
                break;
            case 5:
                System.out.println("Book (1) or magazine (2)?");
                System.out.println("----------------------------------------------");

                int choice5 = sc.nextInt();
                sc.nextLine();
                if (choice5 == 1){
                    System.out.println("Enter books ID:");
                    int ID = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter member's ID: ");
                    int borrowerID = sc.nextInt();
                    sc.nextLine();

                    Member returner = library.getMemberById(borrowerID);
                    Book book = library.getBookById(ID);
                    
                    library.returnItem(returner, book);
                } else if (choice5 == 2){
                    System.out.println("Enter magazines ID:");
                    int ID = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter member's ID: ");
                    int borrowerID = sc.nextInt();
                    sc.nextLine();

                    Member returner = library.getMemberById(borrowerID);
                    Magazine magazine = library.getMagazineById(ID);
                    
                    library.returnItem(returner, magazine);
                } else {
                    System.out.println("Choose right value!");
                }
                break;
            case 6:
                library.getBorrowedItems();
                break;
            case 7:
                library.getOverDueItems();
                break;
            case 8:
                System.out.println("Book (1) or magazine (2)?");
                System.out.println("----------------------------------------------");

                int choice8 = sc.nextInt();
                sc.nextLine();
                if (choice8 == 1){
                    System.out.println("Enter books ID:");
                    int ID = sc.nextInt();
                    sc.nextLine();

                    library.getBookById(ID).getDescription();
                } else if (choice8 == 2){
                    System.out.println("Enter magazines ID:");
                    int ID = sc.nextInt();
                    sc.nextLine();
                    
                    library.getMagazineById(ID).getDescription();
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
