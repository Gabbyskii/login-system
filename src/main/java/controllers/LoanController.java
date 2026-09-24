package controllers;

import entities.Book;
import entities.Library;
import entities.User;
import io.javalin.config.JavalinConfig;
import io.javalin.http.Context;
import services.BookService;

import java.time.LocalDate;

public class LoanController {
    private static BookService bookService = new BookService();



    public static void setRoutes(JavalinConfig config){
        config.routes.get("/myloans", ctx -> ctx.render("myloans"));
        config.routes.post("/cart/add", ctx -> putInCart(ctx));
        config.routes.get("/cart/show", ctx -> ctx.render("showcart"));
        config.routes.get("/loanbooks", ctx -> loanAll(ctx));


    }

    public static void loanAll(Context ctx){
        User user = ctx.sessionAttribute("user");
        for(Book book:user.getCart()){
            bookService.loanBook(book, user, LocalDate.now());
        }
    }

    public static void showCart(Context ctx){

    }

    public static void putInCart(Context ctx){
        User user = ctx.sessionAttribute("user");
        Book book = bookService.findBookByISBN(ctx.formParam("isbn"));
        if (book != null) {
            user.addToCart(book);
            ctx.render("books");
        }


    }


}







