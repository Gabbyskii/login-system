package services;

import entities.Book;
import entities.Library;
import entities.Loan;
import entities.User;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class BookService {

    private Library library = Library.getInstance();

    public void loanBook(Book book, User user, LocalDate date){
        library.addLoan(new Loan(user, book, date));
    }

    public List<Book> findByAuthor(String author){

        return library.getBooks().stream().filter(book -> book.getAuthor().getName().equals(author)).toList();
    }

    public List<Book> findByTitle(String title){
        return library.getBooks().stream().filter(book -> book.getTitle().contains(title)).toList();
    }


    public Book findBookByISBN(String isbn){
        for(Book book: library.getBooks()){
            if(book.getIsbn().equals(isbn))
                return book;
        }
        return null;
    }

    public List<Book> getAllBooks(){
        return library.getBooks();
    }

    public List<Book> getBooks() {
        return library.getBooks();
    }


}
