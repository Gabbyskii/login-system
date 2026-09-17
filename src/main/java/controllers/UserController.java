package controllers;

import io.javalin.config.JavalinConfig;

public class UserController {

    public static void setRoutes(JavalinConfig config){
        config.routes.post("/login", ctx-> login(ctx));

    }


}
