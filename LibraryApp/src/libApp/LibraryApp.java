package libApp;

import java.util.ArrayList;

public class LibraryApp {
    private BookRepository bookRepo= new BookRepository();
    
    public void searchByIsbn(String isbn) {
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null) {
            System.out.printf("One book found with ISBN: %s\n", isbn);
            System.out.printf("\nTitle: %s\nAuthor: %s\nDescription: %s\n", book.getTitle(), book.getAuthor(), book.getDescription());
        } else {
            System.out.println("No book found with ISBN: " + isbn);
        }
    }

    public void searchByTitle(String title) {
        ArrayList<Book> book = bookRepo.findByTitle(title);
        System.out.printf("%d books found.\n", book.size());
        if (book.size() > 0) {
            for (Book book2 : book) {
                System.out.printf("\nTitle: %s\nAuthor: %s\nDescription: %s\n", book2.getTitle(), book2.getAuthor(), book2.getDescription());
            }
        } 
    }

    public void checkedInBooks(String isbn) {
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null) {
            if (book.checkedIn()) {
                System.out.printf("\nChecked in SUCCESSFUL.\n");
                System.out.printf("\nTitle: %s\nAuthor: %s\nDescription: %s\n", book.getTitle(), book.getAuthor(), book.getDescription());
                System.out.printf("\nTotal Books available: %d\n", book.getQuantity()-book.getCheckedOut());
            } else {
                System.out.printf("\nAll books are checked in.\n");
                System.out.printf("\nTitle: %s\nAuthor: %s\nDescription: %s\n", book.getTitle(), book.getAuthor(), book.getDescription());
            }
        } else {
            System.out.println("\nNo Book checked in with ISBN: " + isbn);
        }
            
    }

    public void checkedOutBooks(String isbn) {
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null) {
            if (book.checkedOut()) {
                System.out.printf("\nChecked out SUCCESSFUL.\n");
                System.out.printf("\nTitle: %s\nAuthor: %s\nDescription: %s\n", book.getTitle(), book.getAuthor(), book.getDescription());
                System.out.printf("\nTotal Books available: %d\n", book.getQuantity()-book.getCheckedOut());
            } else {
                System.out.printf("\nNo more books to check out.\n");
                System.out.printf("\nTitle: %s\nAuthor: %s\nDescription: %s\n", book.getTitle(), book.getAuthor(), book.getDescription());
            }
            
        } else {
            System.out.println("\nNo Book checked out with ISBN: " + isbn);
        }
            
    }
}
