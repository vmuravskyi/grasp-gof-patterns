package gof.design.patterns.gof.iterator.application;

import gof.design.patterns.gof.iterator.books.Book;
import gof.design.patterns.gof.iterator.books.BookShelf;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        Book[] books = {new Book("Harper Lee", "To Kill a Mockingbird", LocalDate.of(1960, 1, 1)),
                new Book("George Orwell", "1984", LocalDate.of(1949, 1, 1)),
                new Book("J.K. Rowling", "Harry Potter and the Philosopher’s Stone", LocalDate.of(2001, 1, 1)),
                new Book("J.R.R. Tolkien", "The Lord of the Rings", LocalDate.of(1937, 1, 1))};
        var bookShelf = new BookShelf(books);

        System.out.println("By author");
        var iteratorByAuthor = bookShelf.ascendingIteratorByAuthor();
        while (iteratorByAuthor.hasNext()) {
            var book = iteratorByAuthor.next();
            System.out.println(book);
        }
        System.out.println("*********************************");

        System.out.println("By publication year");
        var iteratorByPublicationYear = bookShelf.ascendingIteratorByPublicationYear();
        while (iteratorByPublicationYear.hasNext()) {
            var book = iteratorByPublicationYear.next();
            System.out.println(book);
        }
        System.out.println("*********************************");

        System.out.println("By title");
        var iteratorByTitle = bookShelf.ascendingIteratorByTitle();
        while (iteratorByTitle.hasNext()) {
            var book = iteratorByTitle.next();
            System.out.println(book);
        }
    }

}
