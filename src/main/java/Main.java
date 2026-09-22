import configuration.ThymeleafConfig;
import controllers.UserController;
import entities.Book;
import entities.User;
import factories.BookFactory;
import factories.UserFactory;
import io.javalin.rendering.template.JavalinThymeleaf;
import services.UserService;
import io.javalin.Javalin;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Javalin app = Javalin.create(config -> {

            config.staticFiles.add("/public");

            config.fileRenderer(new JavalinThymeleaf(ThymeleafConfig.templateEngine()));


        }).start(7070);





    }
}