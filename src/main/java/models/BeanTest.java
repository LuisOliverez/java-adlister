package models;

import java.util.ArrayList;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {
        // Create instances of Author
        Author author1 = new Author(1, "John", "Doe");
        Author author2 = new Author(2, "Jane", "Smith");

        // Create instances of Quote
        Quote quote1 = new Quote(1, author1.getFirstName() + " " + author1.getLastName(), "Quote 1");
        Quote quote2 = new Quote(2, author2.getFirstName() + " " + author2.getLastName(), "Quote 2");
        Quote quote3 = new Quote(3, author1.getFirstName() + " " + author1.getLastName(), "Quote 3");

        // Create instances of Albums
        Albums album1 = new Albums(1, "Post Malone", "Hollywood's Bleeding", 2019, 1000, "Hip-Hop");
        Albums album2 = new Albums(2, "Portugal. The Man", "Woodstock", 2017, 1500, "Alternative");


        // Create an ArrayList to store Quote instances
        List<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);

        // Iterate over the ArrayList to print out the content and author name of each quote
        for (Quote quote : quotes) {
            System.out.println("Content: " + quote.getQuote());
            System.out.println("Author: " + quote.getAuthor());
            System.out.println();
        }


        // Print the details of the albums
        System.out.println("Album 1:");
        System.out.println("Artist: " + album1.getArtist());
        System.out.println("Name: " + album1.getName());
        System.out.println("Release Date: " + album1.getReleaseDate());
        System.out.println("Sales: " + album1.getSales());
        System.out.println("Genre: " + album1.getGenre());
        System.out.println();

        System.out.println("Album 2:");
        System.out.println("Artist: " + album2.getArtist());
        System.out.println("Name: " + album2.getName());
        System.out.println("Release Date: " + album2.getReleaseDate());
        System.out.println("Sales: " + album2.getSales());
        System.out.println("Genre: " + album2.getGenre());
        System.out.println();
    }
}
