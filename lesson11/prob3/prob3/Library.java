package prob3;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private HashMap<String, Book> books;

    public Library() {
        books = new HashMap<>();
    }

    // Adds a new book to the library. If the ISBN already exists, it displays an appropriate message.
    public void addBook(String ISBN, String title, String author) {
        if (books.containsKey(ISBN)) {
            System.out.println("A book with ISBN " + ISBN + " already exists in the library.");
        } else {
            books.put(ISBN, new Book(ISBN, title, author));
            System.out.println("Book added successfully: " + title);
        }
    }


    public void borrowBook(String ISBN) {
        Book book = books.get(ISBN);
        if (book == null) {
            System.out.println("No book found with ISBN: " + ISBN);
        } else if (book.isBorrwed()) {
            System.out.println("The book \"" + book.getTitle() + "\" is already borrowed.");
        } else {
            book.setBorrwed(true);
            System.out.println("The book \"" + book.getTitle() + "\" has been borrowed.");
        }
    }


    public void returnBook(String ISBN) {
        Book book = books.get(ISBN);
        if (book == null) {
            System.out.println("No book found with ISBN: " + ISBN);
        } else if (!book.isBorrwed()) {
            System.out.println("The book \"" + book.getTitle() + "\" was not borrowed.");
        } else {
            book.setBorrwed(false);
            System.out.println("The book \"" + book.getTitle() + "\" has been returned.");
        }
    }


    public  void isBookBorrowed(String ISBN) {
        Book book = books.get(ISBN);
        if (book == null) {
            System.out.println("No book found with ISBN: " + ISBN);
        } else if (book.isBorrwed()) {
            System.out.println("The book \"" + book.getTitle() + "\" is borrowed.");
        } else {
            System.out.println("The book \"" + book.getTitle() + "\" is not borrowed.");

        }
    }

    public void getBookDetails(String ISBN) {
        Book book = books.get(ISBN);
        if (book == null) {
            System.out.println("No book found with ISBN: " + ISBN);
        } else {
            System.out.println(book);
        }
    }

    // Lists all books in the library.
    public void listAllBooks() {
        if (books.isEmpty()) {
            System.out.println("The library has no books.");
        } else {
            for (Map.Entry<String, Book> entry : books.entrySet()) {
                System.out.println(entry.getValue());
            }
        }
    }

    public void listBorrowedBooks() {
        for (Map.Entry<String, Book> entry : books.entrySet()) {
            Book book = entry.getValue();
            if (book.isBorrwed()) {
                System.out.println(book);
            }
        }

    }

    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook("12345", "book1", "amin hcinet");
        library.addBook("67890", "book2", "zyed");
        library.addBook("12345", "book3", "Author");

        library.borrowBook("12345");
        library.borrowBook("67890");
        library.borrowBook("67890"); // Borrow again

        System.out.println("\nAll Books in the Library:");
        library.listAllBooks();

        System.out.println("\nBorrowed Books:");
        library.listBorrowedBooks();

        library.returnBook("67890");
        library.returnBook("67890"); // Return again

        System.out.println("\nBook Details:");
        library.getBookDetails("12345");

        System.out.println("\nCheck if a book is borrwed:");

        library.isBookBorrowed("12345");
    }
}
