import java.time.LocalDate;

public interface Borrowable {
    public boolean borrow(LibraryItem item, Member member, LocalDate borrowDate, LocalDate dueDate, int loanPeriod);
    public boolean returnItem(LibraryItem item, Member member, LocalDate returnDate);
}
