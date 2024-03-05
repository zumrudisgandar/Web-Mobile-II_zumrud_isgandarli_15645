package com.zumrudisgandar.libraryCRUDApp.controller;

import com.zumrudisgandar.libraryCRUDApp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.zumrudisgandar.libraryCRUDApp.model.Book;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;
    private Book defaultBook;

    //private final Book secondBook;

    private List bookList;

    @Autowired
    public BookController (BookService bookService, Book defaultBook) {
        this.bookService = bookService;
        this.defaultBook = defaultBook;
    }

    @GetMapping({"", "/"})
    public String getAllBooks(Model model) {
        var list = bookService.listBooks();
        model.addAttribute("books", list);
        return "book_list";
    }

    @GetMapping("/create")
    public String showCreatePage(Model model) {
        model.addAttribute("book", defaultBook);
        return "CreateBook";
    }

    @PostMapping("/save")
    public String saveNewBook(@ModelAttribute("book") Book newBook) {
        var list = bookService.listBooks();
        list.add(newBook);
        return "redirect:/books";
    }

    @GetMapping("/delete/{idx}")
    public String deleteBook(@PathVariable Integer idx) {
        System.out.println(idx);
        bookService.deleteBook(idx);
        return "redirect:/books";
    }

    @GetMapping("/edit/{idx}")
    public String showEditPage(Model model, @PathVariable Integer idx) {
        Book book = bookService.listBooks().get(idx);
        model.addAttribute("book", book);
        return "EditBook";
    }

    @PostMapping("/saveEdit")
    public String saveEdit(@RequestParam Integer idx, @ModelAttribute("book") Book editedBook) {
        bookService.updateBook(idx, editedBook);
        return "redirect:/books";
    }
}
