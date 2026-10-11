public interface Borrowable {
    public void borrow(LibraryItem item, Member member);
    public void returnItem(LibraryItem item, Member member);
}
