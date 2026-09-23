package entities;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private String email;
    private List<Loan> loans;
    private boolean isAdmin = false;
    private boolean isChild = false;
    private List<Book> cart = new ArrayList<>();

    public boolean isChild() {
        return isChild;
    }

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.loans = new ArrayList<>();
    }

    public User(String username, String password, boolean isChild){
        this(username, password, "N/A");
        this.isChild = isChild;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    public void setChild(boolean child) {
        isChild = child;
    }

    public List<Book> getCart() {
        return cart;
    }

    public void setCart(List<Book> cart) {
        this.cart = cart;
    }

    public void addToCart(Book book){
        cart.add(book);
    }

    public boolean isAdmin(){
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin){
        this.isAdmin = isAdmin;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void addLoan(Loan loan) {
        loans.add(loan);
    }
}