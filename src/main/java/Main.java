import configuration.ThymeleafConfig;
import controllers.BookController;
import controllers.CartController;
import controllers.LoanController;
import controllers.UserController;
import io.javalin.rendering.template.JavalinThymeleaf;
import io.javalin.Javalin;



public class Main {
    public static void main(String[] args) {

        Javalin app = Javalin.create(config -> {
            UserController.setRoutes(config);
            BookController.setRoutes(config);
            CartController.setRoutes(config);
            config.staticFiles.add("/public");
            config.fileRenderer(new JavalinThymeleaf(ThymeleafConfig.templateEngine()));


        }).start(7070);





    }
}