package controllers;

import entities.User;
import exceptions.IllegalUserDataException;
import io.javalin.config.JavalinConfig;
import io.javalin.http.Context;
import services.UserService;

public class UserController {
    static UserService userService = new UserService();

    public static void setRoutes(JavalinConfig config){
        config.routes.post("/login", ctx -> login(ctx));
        config.routes.post("/createuser", ctx -> createUser(ctx));
        config.routes.get("/welcome", ctx -> ctx.render("welcome"));
    }

    public static void createUser(Context ctx){
        String username = ctx.formParam("username");
        String password = ctx.formParam("password");
        String email = ctx.formParam("email");

        try {
        User user = userService.createUser(username, password, email);
            ctx.sessionAttribute("user", user);
            ctx.render("welcome");
        }
        catch (IllegalUserDataException e){
            ctx.status(404);
            ctx.result(e.getMessage());
            System.out.println(e.getMessage());
        }

    }

    public static void login(Context ctx){
        String username = ctx.formParam("username");
        String password = ctx.formParam("password");

        User user = userService.login(username, password);
        if(user != null){
            ctx.sessionAttribute("user", user);
            ctx.render("welcome");
        }
        else{
            ctx.status(404);
            ctx.result("Brugeren findes ikke");
        }

    }




}
