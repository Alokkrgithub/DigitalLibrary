import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<Integer, Book> books;

    public Library() {
        this.books = new HashMap<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        if (books.containsKey(book.getBookId())) {
            System.out.println("Error: Book with ID " + book.getBookId() + " already exists.");
        } else {
            books.put(book.getBookId(), book);
            System.out.println("Book " + book.getTitle() + " added successfully.");
        }
    }

    // View all books in the library
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            books.values().forEach(System.out::println);
        }
    }

    // Search for a book by ID or title
    public void searchBook(String searchTerm) {
        boolean found = false;
        for (Book book : books.values()) {
            if (String.valueOf(book.getBookId()).contains(searchTerm) || book.getTitle().toLowerCase().contains(searchTerm.toLowerCase())) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found.");
        }
    }

    // Update a book's details
    public void updateBook(int bookId, String title, String author, String genre, String availabilityStatus) {
        Book book = books.get(bookId);
        if (book == null) {
            System.out.println("Error: Book with ID " + bookId + " not found.");
        } else {
            if (title != null && !title.isEmpty()) book.setTitle(title);
            if (author != null && !author.isEmpty()) book.setAuthor(author);
            if (genre != null && !genre.isEmpty()) book.setGenre(genre);
            if (availabilityStatus != null && !availabilityStatus.isEmpty()) book.setAvailabilityStatus(availabilityStatus);
            System.out.println("Book ID " + bookId + " updated successfully.");
        }
    }

    // Delete a book from the library
    public void deleteBook(int bookId) {
        if (books.containsKey(bookId)) {
            books.remove(bookId);
            System.out.println("Book ID " + bookId + " deleted successfully.");
        } else {
            System.out.println("Error: Book with ID " + bookId + " not found.");
        }
    }
}
