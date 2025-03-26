import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- Digital Library System ---");
            System.out.println("1. Add a Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by ID or Title");
            System.out.println("4. Update Book Details");
            System.out.println("5. Delete a Book Record");
            System.out.println("6. Exit System");
            
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            
            switch (choice) {
                case 1: {
                    // Add a book
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Book Genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter Availability Status (Available/Checked Out): ");
                    String availabilityStatus = scanner.nextLine();

                    Book newBook = new Book(bookId, title, author, genre, availabilityStatus);
                    library.addBook(newBook);
                    break;
                }
                case 2:
                    // View all books
                    library.viewBooks();
                    break;
                case 3: {
                    // Search for a book
                    System.out.print("Enter Book ID or Title to search: ");
                    String searchTerm = scanner.nextLine();
                    library.searchBook(searchTerm);
                    break;
                }
                case 4: {
                    // Update book details
                    System.out.print("Enter Book ID to update: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    
                    System.out.print("Enter new Title (leave blank to skip): ");
                    String title = scanner.nextLine();
                    System.out.print("Enter new Author (leave blank to skip): ");
                    String author = scanner.nextLine();
                    System.out.print("Enter new Genre (leave blank to skip): ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter new Availability Status (leave blank to skip): ");
                    String availabilityStatus = scanner.nextLine();

                    library.updateBook(bookId, title.isEmpty() ? null : title, author.isEmpty() ? null : author, genre.isEmpty() ? null : genre, availabilityStatus.isEmpty() ? null : availabilityStatus);
                    break;
                }
                case 5: {
                    // Delete a book
                    System.out.print("Enter Book ID to delete: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    library.deleteBook(bookId);
                    break;
                }
                case 6:
                    // Exit the system
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
