import java.time.LocalDate;

public interface Borrowable {
    public boolean borrow(LibraryItem item, Member member, LocalDate borrowDate, LocalDate dueDate);
    public boolean returnItem(LibraryItem item, Member member, LocalDate returnDate);
}
