package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class LibraryTest {

    private final Library library = new Library();

    @BeforeEach
    void setLibrary() {
        library.clearBooks();
        library.addBook(new Book("A", "Vlad", 1917));
        library.addBook(new Book("B", "Anton", 1917));
        library.addBook(new Book("C", "Vlad", 1997));
        library.addBook(new Book("Bible", "Luca", 24));
    }

    @Test
    void addBookTest() {
        int size = 5;
        library.addBook(Mockito.mock(Book.class));
        Assertions.assertEquals(size, library.booksSize());
    }

    @Test
    void removeBookTest() {
        int size = 3;
        library.removeBook(library.searchByAuthor("Anton").get(0));
        Assertions.assertEquals(size, library.booksSize());
    }

    @Test
    void removeNoneBookTest() {
        int size = 4;
        library.removeBook(new Book("A", "Eugene", 1234));
        Assertions.assertEquals(size, library.booksSize());
    }

    @Test
    void removeNullBookTest() {
        Assertions.assertThrows(NullPointerException.class, () -> library.removeBook(null));
    }

    @Test
    void searchByAuthorTest() {
        int size = 2;
        Assertions.assertEquals(size, library.searchByAuthor("Vlad").size());
    }

    @Test
    void searchByNullAuthorTest() {
        Assertions.assertThrows(NullPointerException.class, () -> library.searchByAuthor(null));
    }

    @Test
    void searchByTitleTest() {
        int size = 1;
        Assertions.assertEquals(size, library.searchByTitle("Bible").size());
    }

    @Test
    void searchByNullTitleTest() {
        Assertions.assertThrows(NullPointerException.class, () -> library.searchByTitle(null));
    }

    @Test
    void searchByYearTest() {
        int size = 1;
        Assertions.assertEquals(size, library.searchByYear(24).size());
    }

    @Test
    void searchByBelowZeroYearTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> library.searchByYear(-5));
    }

    @Test
    void searchByAbove2023YearTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> library.searchByYear(2024));
    }
}