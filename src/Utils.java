import java.util.Scanner;

public class Utils {
    public static int generateIdForLibraryItem(Library lib){       
        for (int i = 0; i<10000; i++){
            int ID = (int)(Math.random() * 10001);
            if(lib.getItemById(ID) == null){
                return ID;
            }

        }
        return 10001;
    }

    public static int generateIdForMember(Library lib){       
        for (int i = 0; i<10000; i++){
            int ID = (int)(Math.random() * 10001);
            if(lib.getMemberById(ID) == null){
                return ID;
            }
        }
        return 10001;
    }

    public static int readIntChoice(Scanner sc){
        int num = 0;
        try {           
            while(num != 1 && num != 2){
                num = Integer.parseInt(sc.nextLine());
                if (num != 1 && num != 2){
                    System.out.println("Please, choose right option, 1 or 2.");
                }
            }
        } catch (NumberFormatException NumberFormatException) {      
            if (NumberFormatException.getMessage() == "No line found") {
                return -1;
            }    
            System.out.println("Please, choose right option, 1 or 2.");
            num = readIntChoice(sc);
        } 
        return num;
    }
    public static int readInt(Scanner sc){
        int num = 0;
        try {           
            num = Integer.parseInt(sc.nextLine());

        } catch (NumberFormatException NumberFormatException) {      
            if (NumberFormatException.getMessage().equals("No line found")) {
                return -1;
            }    
            System.out.println("Please enter valid number.");
            num = readInt(sc);
        } 
        return num;
}
}
