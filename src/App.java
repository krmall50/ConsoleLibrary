import java.util.Scanner;

public class App {
    public static void start(){
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        while(choice != 9){
            System.out.println("========== LIBRARY SYSTEM ==========\n" + //
                                "1. Show all books\n" + //
                                "2. Add a book\n" + //
                                "3. Register a member\n" + //
                                "4. Borrow a book\n" + //
                                "5. Return a book\n" + //
                                "6. Show borrowed books\n" + //
                                "7. Show overdue books\n" + //
                                "8. Search for a book\n" + //
                                "9. Exit\n" + //
                                "====================================\n" + //
                                "Choose an option:");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            default:
                break;
        }
        }
        sc.close();
    }
}
