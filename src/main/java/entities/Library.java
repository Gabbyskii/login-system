package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public Loan createLoan(User user, Book book, LocalDate date) {
        Loan loan = new Loan(user, book, date);
        loans.add(loan);
        return loan;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books.size() +
                ", users=" + users.size() +
                ", loans=" + loans.size() +
                '}';
    }
}