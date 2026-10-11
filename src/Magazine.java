public class Magazine extends LibraryItem {
    private int issueNum;

    public Magazine(int ID, String title, boolean available, int issueNum){
        super(ID, title, available);
        this.issueNum = issueNum;
    }

    public void setIssueNum(int issueNum){
        this.issueNum = issueNum;
    }
    public int getIssueNum(){
        return issueNum;
    }

    @Override 
    public void getDescription(){
        System.out.println("ID: " + getID());
        System.out.println("Title: " + getTitle());
        System.out.println("Available: " + getAvailability());
        System.out.println("Issue Number: " + getIssueNum());
        System.err.println();
    }
}
