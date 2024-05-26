package com.example.demoJPAHibernate.Controller;
import com.example.demoJPAHibernate.DTO.CreateBook;
import com.example.demoJPAHibernate.Models.Book;
import com.example.demoJPAHibernate.Models.BookCategory;
import com.example.demoJPAHibernate.Service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/book")
    public Book createBook(@RequestBody @Valid CreateBook createBook){
        return bookService.createBook(createBook);
    }

    @GetMapping("/book/{bookID}")
        public Book getBook(@PathVariable("bookID") int id){
            return  bookService.getBook(id);
    }

    @GetMapping("/book/all")
    public List<Book> getBook(){
        return getBook();
    }

    @GetMapping("/get-all-book/{bookcategory}")
    public List<Book> getAllBook(@PathVariable("bookcategory") BookCategory category){
        return bookService.getAllBook(category);
    }




}
