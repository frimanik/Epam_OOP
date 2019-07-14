package com.company.services;

import com.company.entity.Book;

public class ServiceDemoImpl {
    ServiceLibraryImpl books;

    public ServiceDemoImpl(ServiceLibraryImpl books) {
        this.books = books;
    }

    public void Test() {
        System.out.println("FreeSpace: " + books.freeSpace());
        books.addBook(new Book("Flowers for Algernon", "Daniel Keyes", "001"));
        books.addBook(new Book("The Hobbit", "J.R.Tolkien", "002"));
        books.addBook(new Book("The song of ice and fire", "Geroge.R.R.Martin", "003"));
        System.out.println("FreeSpace: " + books.freeSpace());
        books.addBook(new Book("The shadow over innsmouth", "H.P.Lovecraft", "004"));
        books.addBook(new Book("A space odyssey", "Arthur C. Clarke", "005"));
        System.out.println("FreeSpace: " + books.freeSpace());
        System.out.println(books.findBook("003").toString());
        books.deleteBook("003");
        System.out.println(books.findBook("004").toString());
        System.out.println(books.findBook("005").toString());
    }


}
