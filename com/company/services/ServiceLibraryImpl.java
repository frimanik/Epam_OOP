package com.company.services;

import com.company.entity.Book;
import com.company.repository.Library;

public class ServiceLibraryImpl implements Library {
    private Book[] books;

    public ServiceLibraryImpl(int librarySize) {
        books = new Book[librarySize];
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public Book findBook(String id) {

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null)
                continue;
            else if (books[i].getId().equals(id)) {
                return books[i];
            }
        }
        return null;
    }

    public void deleteBook(String id) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getId().equals(id)) {
                books[i] = null;
            }
        }
    }

    public boolean freeSpace() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                return true;
            }
        }
        return false;
    }

}