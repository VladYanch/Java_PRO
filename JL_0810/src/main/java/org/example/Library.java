package org.example;

import org.example.Book;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Add book: \"" + book.getTitle() + "\"");
    }

    public void removeBook(Book book) {
        books.remove(book);
        System.out.println("Remove book: \"" + book.getTitle() + "\"");
    }

    public List<Book> searchByAuthor(String author) {
        if (author == null) {
            throw new NullPointerException();
        }
        return books.stream()
                .filter(b -> author.equals(b.getAuthor()))
                .toList();
    }

    public List<Book> searchByTitle(String title) {
        if (title == null) {
            throw new NullPointerException();
        }
        return books.stream()
                .filter(b -> title.equals(b.getTitle()))
                .toList();
    }

    public List<Book> searchByYear(int year) {
        if (year < 0 || year > 2023) {
            throw new IllegalArgumentException();
        }
        return books.stream()
                .filter(b -> b.getYear() == year)
                .toList();
    }

    public int booksSize() {
        return books.size();
    }

    public void clearBooks() {
        books.clear();
    }
}

//        Класс Library:
//        Поля:
//        List<Book> books - список книг в библиотеке.
//
//        Методы:
//        void addBook(Book book) - добавляет книгу в список книг библиотеки.
//        void removeBook(Book book) - удаляет книгу из списка книг библиотеки.
//        List<Book> searchByAuthor(String author) - возвращает список книг по заданному автору.
//        List<Book> searchByTitle(String title) - возвращает список книг по заданному названию.
//        List<Book> searchByYear(int year) - возвращает список книг по заданному году издания.
