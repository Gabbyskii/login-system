package controllers;

import entities.Book;
import entities.Library;
import entities.User;
import io.javalin.config.JavalinConfig;
import io.javalin.http.Context;
import services.*;
import services.UserService;

import java.util.List;

public class AdminController {
    private static UserService userService = new UserService();


    public static void setRoutes(JavalinConfig config){
        config.routes.get("/users", ctx -> getUsers(ctx));
        config.routes.get("/finduser", ctx -> findUser(ctx));

    }


    public static void getUsers(Context ctx){
        List<User> users = Library.getInstance().getUsers();
        ctx.attribute("users", users);
        ctx.render("users");

    }

    public static void findUser(Context ctx){
        String username = ctx.queryParam("username");
        User user = userService.getUser(username);
        if(user != null){
            ctx.attribute("user", user);
            ctx.render("userinfo");
        }
        else{
            ctx.status(404);
            ctx.result("Brugeren findes ikke");
        }
    }


}
