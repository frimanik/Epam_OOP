package com.company.repository;

import com.company.entity.Book;

public interface Library {

    void addBook(Book book);

    Book findBook(String id);

    void deleteBook(String id);

    boolean freeSpace();
}