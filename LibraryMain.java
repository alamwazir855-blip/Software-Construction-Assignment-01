package Assignmet01;

public class LibraryMain {

    public static void main(String[] args) {

        Book book = new Book(
                "Java Programming",
                "Engr Rizwan Shah"
        );

        Member member = new Member("Ihsan");

        book.displayBook();

        member.borrowBook(book);
    }
}