package factories;

import entities.Author;
import entities.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BookFactory {

    private static final Random RANDOM = new Random();

    private static final String[] TITLE_ADJECTIVES = {
            "Silent", "Hidden", "Last", "Forgotten", "Broken", "Eternal",
            "Golden", "Frozen", "Distant", "Sacred", "Lost", "Burning",
            "Whispering", "Endless", "Shattered", "Midnight", "Wandering", "Ancient"
    };

    private static final String[] TITLE_NOUNS = {
            "Kingdom", "Shadow", "River", "Garden", "Storm", "Mirror",
            "Journey", "Flame", "Promise", "Horizon", "Echo", "Castle",
            "Forest", "Ocean", "Legacy", "Dream", "Path", "Star"
    };

    private static final String[] FIRST_NAMES = {
            "Anna", "Lars", "Mette", "Erik", "Sofia", "Jonas", "Ida",
            "Peter", "Clara", "Magnus", "Freja", "Oliver", "Emma", "Noah"
    };

    private static final String[] LAST_NAMES = {
            "Hansen", "Jensen", "Nielsen", "Pedersen", "Andersen", "Christensen",
            "Larsen", "Sørensen", "Rasmussen", "Petersen", "Madsen", "Kristiansen"
    };

    /**
     * Generates a list of random books, each with a unique author.
     */
    public static List<Book> generateBooks(int count) {
        List<Book> books = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Author author = generateAuthor();
            Book book = new Book(generateTitle(), generateIsbn(), author);
            author.addBook(book);
            books.add(book);
        }
        return books;
    }


    public static List<Book> generateBooks(int count, List<Author> authorPool) {
        List<Book> books = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Author author = authorPool.get(RANDOM.nextInt(authorPool.size()));
            Book book = new Book(generateTitle(), generateIsbn(), author);
            author.addBook(book);
            books.add(book);
        }
        return books;
    }

    private static Author generateAuthor() {
        String name = FIRST_NAMES[RANDOM.nextInt(FIRST_NAMES.length)] + " "
                + LAST_NAMES[RANDOM.nextInt(LAST_NAMES.length)];
        return new Author(name);
    }

    private static String generateTitle() {
        String adjective = TITLE_ADJECTIVES[RANDOM.nextInt(TITLE_ADJECTIVES.length)];
        String noun = TITLE_NOUNS[RANDOM.nextInt(TITLE_NOUNS.length)];
        return "The " + adjective + " " + noun;
    }

    private static String generateIsbn() {
        // Simple 13-digit fake ISBN
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 13; i++) {
            sb.append(RANDOM.nextInt(10));
        }
        return sb.toString();
    }


}