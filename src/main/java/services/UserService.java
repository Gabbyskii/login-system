package services;

import entities.Library;
import entities.User;
import factories.UserFactory;

import java.util.List;

public class UserService {

   private Library library = new Library();

    public UserService() {

    }


    public void addUser(User user){
        library.addUser(user);
    }

    public User getUser(String username){
        if (username == null){
            System.out.println("no username found!");
        }

        for (User us: library.getUsers()){
            if (us.getUsername().equals(username)){
                return us;
            }
        }
        return null;
    }

    public User login(String username, String password){
        if (username == null && password == null){
            System.out.println("no login!");
            return null;
        }

        for (User login: library.getUsers()){
            if (login.getUsername().equals(username) &&
                    login.getPassword().equals(password)){
                System.out.println("Login succesful!");
                return login;
            }
        }

        return null;
    }

    public User createUser(String username, String password){
        if (username == null || password == null){
            System.out.println("no user created!");
        }

        if (!validatePassword(password)) {
           throw new IllegalArgumentException("Password must be 8-15 characters!");
        }

        for (User us: library.getUsers()) {
            if (us.getUsername().equals(username)) {
                return null;
            }
        }

        User user = new User(username,password);
        library.getUsers().add(user);

        return user;

    }
    public boolean validatePassword(String password) {
        return password.length() >= 8 && password.length() <= 15;
    }


}
