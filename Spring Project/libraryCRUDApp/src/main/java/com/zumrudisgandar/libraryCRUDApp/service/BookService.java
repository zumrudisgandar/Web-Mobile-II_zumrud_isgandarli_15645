package com.zumrudisgandar.libraryCRUDApp.service;

import com.zumrudisgandar.libraryCRUDApp.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private List<Book> books = new ArrayList<>(List.of(
            new Book("Idiot", 1869, "Life of Lev Nikolayevich", "Fyodor Dostoyevski"),
            new Book("Da Vinchi Code", 2010, "Da Vinci Code in Louvre", "Dan Brown"),
            new Book ("Martin Iden", 2018, "Biography of Martin Iden", "Cek London")
    ));

    public List<Book> listBooks(){
        return books;
    }

    public void deleteBook(Integer idx){
        if(idx == null || idx < 0 || idx >= books.size()) return;
        books.remove(idx.intValue());
    }

    public void updateBook(Integer idx, Book updatedBook) {
        if (idx >= 0 && idx < books.size()) {
            Book existingBook = books.get(idx);
            System.out.println(existingBook);
            existingBook.setTitle(updatedBook.getTitle());
            existingBook.setPublicationYear((updatedBook.getPublicationYear()));
            existingBook.setDescription(updatedBook.getDescription());
            existingBook.setAuthor(updatedBook.getAuthor());
            books.set(idx.intValue(), existingBook);
        } else {
            throw new IllegalArgumentException("Index is out of bounds.");
        }
    }
}