package factories;

import entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserFactory {

    public static List<User> createUsers() {

        List<User> users = new ArrayList<>();

        users.add(new User("user1", "password1", "user1@email.com"));
        users.add(new User("user2", "password2", "user2@email.com"));
        users.add(new User("user3", "password3", "user3@email.com"));
        users.add(new User("user4", "password4", "user4@email.com"));
        users.add(new User("user5", "password5", "user5@email.com"));
        users.add(new User("user6", "password6", "user6@email.com"));
        users.add(new User("user7", "password7", "user7@email.com"));
        users.add(new User("user8", "password8", "user8@email.com"));
        users.add(new User("user9", "password9", "user9@email.com"));
        users.add(new User("user10", "password10", "user10@email.com"));
        users.add(new User("user11", "password11", true));

        return users;
    }
}