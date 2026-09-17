import entities.User;
import factories.UserFactory;
import services.UserService;
import io.javalin.Javalin;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        var app = Javalin.create(config -> {
            config.staticFiles.add("/public");
        }).start(7070);




       /* try {
            User u = new User("gabski", "1234");
            System.out.println("Oprettet bruger: " + u.getUsername());


            List<User> users = UserFactory.createUsers();
            System.out.println("Antal brugere fra factory: " + users.size());


            UserService userService = new UserService();


            User found = userService.getUser("gabski");
            System.out.println("Fundet bruger: " + found.getUsername());


            User loggedIn = userService.login("gabski", "Kode1234");
            System.out.println("Login korrekt: " + loggedIn);


            User failedLogin = userService.login("gabski", "Kode3211");
            System.out.println("Login forkert password: " + failedLogin);


            User newUser = userService.createUser("dumle", "Kode1123");
            System.out.println("Ny bruger oprettet: " + newUser);

            User dupUsername = userService.createUser("pablo", "Kode4321");
            System.out.println("Duplikat brugernavn: " + dupUsername);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }*/




    }
}