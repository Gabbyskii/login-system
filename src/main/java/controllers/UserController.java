package controllers;

import entities.User;
import io.javalin.config.JavalinConfig;
import io.javalin.http.Context;
import services.UserService;

public class UserController {
    static UserService userService = new UserService();

    public static void setRoutes(JavalinConfig config){
        config.routes.post("/login", ctx-> login(ctx));
        config.routes.get("/login", ctx-> ctx.redirect("/login.html"));

        config.routes.post("/createuser", ctx-> createUser(ctx));
        config.routes.get("/createuser", ctx-> ctx.redirect("/createUser.html"));
    }


    public static void login(Context ctx){
        String username = ctx.formParam("username");
        String password = ctx.formParam("password");

        User user = userService.login(username, password);
        if (user != null){
            ctx.redirect("/welcome.html");
        }
        else {
            ctx.status(404);
            ctx.result("Brugeren findes ikke!");
        }

    }

    public static void createUser(Context ctx){
        String newUsername = ctx.formParam("newusername");
        String newPassword = ctx.formParam("newpassword");

        User newUser = userService.createUser(newUsername, newPassword);
        if (newUser != null){
            ctx.redirect("/welcome.html");
        }
        else {
            ctx.status(404);
            ctx.result("Brugeren kunne ikke oprettes!");
        }

    }


}
