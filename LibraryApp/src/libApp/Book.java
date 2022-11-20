package libApp;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private String description;
    private String genre;
    private int quantity;
    private int checkedOut;

    public Book(String isbn, String title, String author, String description, String genre, int quantity,
            int checkedOut) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.description = description;
        this.genre = genre;
        this.quantity = quantity;
        this.checkedOut = checkedOut;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getCheckedOut() {
        return checkedOut;
    }

    public String getGenre() {
        return genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean checkedIn() {
        if (checkedOut <= 0) {
            return false;
        }
        checkedOut--;
        return true;
    }

    public boolean checkedOut() {
        if (checkedOut >= quantity) {
            return false;
        }
        checkedOut++;
        return true;
    }
}
