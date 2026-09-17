import controllers.UserController;
import entities.User;
import factories.UserFactory;
import io.javalin.rendering.template.JavalinThymeleaf;
import services.UserService;
import io.javalin.Javalin;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        var app = Javalin.create(config -> {
            UserController.setRoutes(config);
            config.staticFiles.add("/public");
            config.fileRenderer(new JavalinThymeleaf());

        }).start(7070);







    }
}