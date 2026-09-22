package entities;

import entities.Loan;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private String password;
    private List<Loan> loans = new ArrayList<>();

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", loans=" + loans.size() +
                '}';
    }
}