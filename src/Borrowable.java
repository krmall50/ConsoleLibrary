import java.time.LocalDate;

public interface Borrowable {
    public void borrow(LibraryItem item, Member member, LocalDate borrowDate, LocalDate dueDate);
    public void returnItem(LibraryItem item, Member member, LocalDate returnDate);
}
