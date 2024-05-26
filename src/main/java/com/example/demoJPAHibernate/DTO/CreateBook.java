package com.example.demoJPAHibernate.DTO;

import com.example.demoJPAHibernate.Models.Book;
import com.example.demoJPAHibernate.Models.BookCategory;
import com.example.demoJPAHibernate.Models.Language;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CreateBook {
    @NotBlank
    private String name;
    private String authorName;
    private String publisherName;
    private int pages;
    private BookCategory bookCategory;
    private Language language;

    public Book to(){
        return Book.builder()  //creating an object
                .name(this.name)
                .authorName(this.authorName)
                .publisherName(this.publisherName)
                .pages(this.pages)
                .bookCategory(this.bookCategory)
                .language(this.language)
                .build();
    }

}
