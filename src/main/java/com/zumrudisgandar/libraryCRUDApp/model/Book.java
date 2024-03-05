package com.zumrudisgandar.libraryCRUDApp.model;

public class Book {

    private String title;
    private int publicationYear;
    private String description;
    private String author;

    public Book(String title, int publicationYear, String description, String author) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.description = description;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
