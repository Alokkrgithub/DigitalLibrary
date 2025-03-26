public class Book {
    private int bookId;
    private String title;
    private String author;
    private String genre;
    private String availabilityStatus;  // "Available" or "Checked Out"
    
    // Constructor
    public Book(int bookId, String title, String author, String genre, String availabilityStatus) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availabilityStatus = availabilityStatus;
    }

    // Getter and Setter Methods
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    // Method to display book details
    @Override
    public String toString() {
        return "ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Genre: " + genre + ", Status: " + availabilityStatus;
    }
}
