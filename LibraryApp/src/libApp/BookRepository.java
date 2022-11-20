package libApp;

import java.util.ArrayList;

public class BookRepository {
    ArrayList<Book> books = new ArrayList<Book>();
    
    public BookRepository() {
        books.add(new Book("52456", "Something I never told you", "Shravya Bhinder" , "A love story that got an end.", "Romance and Love", 10, 4));
        books.add(new Book("52457", "Wish I could tell you", "Durjoy Datta", "A Story filled with feelings of her.", "Fiction", 15, 5));
        books.add(new Book("52458", "Death", "Sadh Guru", "Life to death.", "Spirtual", 12, 2));
        books.add(new Book("25864", "I should have told her", "Naveen", "The story of a boy who never confessed his love to her.", "True Story", 12, 1));
        books.add(new Book("25469", "Family, a killer", "Kavin", "A Nazi minded of the family.", "True Story", 10, 5));
        books.add(new Book("45864", "Wish she was here", "Naveen", "A friendship ended for no reason.", "Friendship", 16, 3));
    }

    public Book findByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> findByTitle(String title) {
        ArrayList<Book> booksFound = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                booksFound.add(book);
            }
        }
        return booksFound;
    }
}
