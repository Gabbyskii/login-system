package factories;

import entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserFactory {

    public static List<User> createUsers() {
        List<User> users = new ArrayList<>();

        users.add(new User("gabski", "Kode1234"));
        users.add(new User("pablo", "Kode4321"));
        users.add(new User("lucia", "Kode6543"));
        users.add(new User("jason", "Kode1234"));
        users.add(new User("brian", "Kode4567"));
        users.add(new User("cal", "Kode9876"));
        users.add(new User("alina", "Kode1234"));
        users.add(new User("lars", "Kode6543"));
        users.add(new User("diana", "Kode4321"));
        users.add(new User("susu", "Kode2345"));

        return users;
    }




}
