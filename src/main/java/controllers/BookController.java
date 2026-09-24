package controllers;

import entities.Book;
import io.javalin.config.JavalinConfig;
import io.javalin.http.Context;
import services.*;
import java.util.List;

public class BookController {
    private static BookService bookService = new BookService();

    public static void setRoutes(JavalinConfig config){
        config.routes.get("/books", ctx -> showAllBooks(ctx));
        config.routes.get("/getbooks", ctx -> getBooks(ctx));
        config.routes.get("/booksbyauthor", ctx -> getBooksByAuthor(ctx));
        config.routes.get("/booksbytitle", ctx -> getBooksByTitle(ctx));
    }

    public static void showAllBooks(Context ctx){
        List<Book> books = bookService.getAllBooks();
        ctx.attribute("books", books);
        ctx.render("books");
    }

    public static void getBooksByAuthor(Context ctx){
        List<Book> books = bookService.findByAuthor(ctx.queryParam("author"));
        ctx.attribute("books", books);
        ctx.render("books");
    }

    public static void getBooksByTitle(Context ctx){
        List<Book> books = bookService.findByTitle(ctx.queryParam("title"));
        ctx.attribute("books", books);
        ctx.render("books");
    }

    public static void getBooks(Context ctx){
        List<Book> books = bookService.getBooks();
        ctx.attribute("books", books);
        ctx.render("books");
    }


}



