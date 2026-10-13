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
}
