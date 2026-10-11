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
}
