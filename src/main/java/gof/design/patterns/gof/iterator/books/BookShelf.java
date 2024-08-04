package gof.design.patterns.gof.iterator.books;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class BookShelf {

    private Book[] books;

    public BookShelf(Book[] books) {
        this.books = books;
    }

    public Iterator<Book> ascendingIteratorByAuthor() {
        return new AscendingIterator(this.books.clone(), Comparator.comparing(Book::getAuthor));
    }

    public Iterator<Book> ascendingIteratorByPublicationYear() {
        return new AscendingIterator(this.books.clone(), Comparator.comparing(Book::getPublicationYear));
    }

    public Iterator<Book> ascendingIteratorByTitle() {
        return new AscendingIterator(this.books.clone(), Comparator.comparing(Book::getTitle));
    }

    /**
     * Adapter to provide ascending iterators by a field.
     */
    private class AscendingIterator implements Iterator<Book> {

        private Book[] sortedBooks;
        private int itr;

        public AscendingIterator(Book[] sortedBooks, Comparator<Book> comparator) {
            Arrays.sort(sortedBooks, comparator);
            this.sortedBooks = sortedBooks;
            this.itr = -1;
        }

        public boolean hasNext() {
            if (sortedBooks.length == 0 || sortedBooks.length <= this.itr + 1) {
                return false;
            } else {
                return true;
            }
        }

        public Book next() {
            if (hasNext()) {
                this.itr++;
                return sortedBooks[itr];
            } else {
                throw new NoSuchElementException();
            }
        }

    }

}
