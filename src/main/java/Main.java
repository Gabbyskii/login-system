import configuration.ThymeleafConfig;
import controllers.UserController;
import io.javalin.rendering.template.JavalinThymeleaf;
import io.javalin.Javalin;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Javalin app = Javalin.create(config -> {
            UserController.setRoutes(config);
            config.staticFiles.add("/public");
            config.fileRenderer(new JavalinThymeleaf(ThymeleafConfig.templateEngine()));


        }).start(7070);





    }
}