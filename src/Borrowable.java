import java.time.LocalDate;

interface Borrowable {
    boolean borrow(Member member, LocalDate borrowDate, LocalDate dueDate, int loanPeriod);
    boolean returnItem(Member member, LocalDate returnDate);
}
