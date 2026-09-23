package entities;

public class Book {
    private String title;
    private String isbn;
    private Author author;
    private boolean isChildrensBook = false;

    public boolean isChildrensBook() {
        return isChildrensBook;
    }

    public Book(String title, String isbn, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    public Book(String title, String isbn, Author author, boolean isChildrensBook){
        this(title, isbn, author);
        this.isChildrensBook = isChildrensBook;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public Author getAuthor() {
        return author;
    }
}
