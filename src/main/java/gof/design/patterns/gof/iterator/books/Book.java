package gof.design.patterns.gof.iterator.books;

import java.time.LocalDate;
import java.util.StringJoiner;

public class Book {

    private String author;
    private String title;
    private LocalDate publicationYear;

    public Book(String author, String title, LocalDate publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Book.class.getSimpleName() + "[", "]")
                .add("author='" + author + "'")
                .add("title='" + title + "'")
                .add("publicationYear=" + publicationYear)
                .toString();
    }

}
