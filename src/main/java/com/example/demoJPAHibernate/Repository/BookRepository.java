package com.example.demoJPAHibernate.Repository;

import com.example.demoJPAHibernate.Models.Book;
import com.example.demoJPAHibernate.Models.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

//    @Query("select b from Book b where b.bookCategory =:category")
//    @Query("select b from Book b where b.bookCategory = ?1")
//    List<Book> findAllBookByCategory(BookCategory category);

    List<Book> findByBookCategory(BookCategory category);
    // without writing any queries this function will behave as above
    // this is known  as function query

}
