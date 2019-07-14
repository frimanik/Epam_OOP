package com.company.entity;

public class Book {
    private String title;
    private String author;
    private String id;

    public Book(String title, String author, String id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Title: " + title + "," + " Author: " + author + "," + " Id: " + id;
    }
}