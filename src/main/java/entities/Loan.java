package entities;

import java.time.LocalDate;

public class Loan {

    private User user;
    private Book book;
    private LocalDate date;

    public Loan(User user, Book book, LocalDate date) {
        this.user = user;
        this.book = book;
        this.date = date;
        user.getLoans().add(this);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "user=" + user.getUsername() +
                ", book=" + book.getTitle() +
                ", date=" + date +
                '}';
    }

}