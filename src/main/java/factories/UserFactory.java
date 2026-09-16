package factories;

import entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserFactory {

    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }


    public List<User> createUsers() {
        users.add(new User("gabski", "1234"));
        users.add(new User("pablo", "4321"));
        users.add(new User("lucia", "6543"));
        users.add(new User("jason", "1234"));
        users.add(new User("brian", "4567"));
        users.add(new User("cal", "9876"));
        users.add(new User("alina", "1234"));
        users.add(new User("lars", "6543"));;
        users.add(new User("diana", "4321"));
        users.add(new User("susu", "2345"));

        return users;
    }




}
