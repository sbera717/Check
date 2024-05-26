package com.example.demoJPAHibernate.Service;

import com.example.demoJPAHibernate.DTO.CreateBook;
import com.example.demoJPAHibernate.Models.Book;
import com.example.demoJPAHibernate.Models.BookCategory;
import com.example.demoJPAHibernate.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public Book createBook(CreateBook createBook){
        Book book = createBook.to();
        book.setId(4);
        return bookRepository.save(book);
    }

    public Book getBook(int id){
        return bookRepository.findById(id).orElse(null);
    }

    public List<Book> getBook(){
        return bookRepository.findAll();
    }

    public List<Book> getAllBook(BookCategory category){
        return bookRepository.findByBookCategory(category);

    }
}
