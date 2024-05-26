package com.example.demoJPAHibernate.Models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Date;
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String authorName;
    private String publisherName;
    private  int pages;
    @Enumerated(value =  EnumType.STRING) // this will store the value as a string else it
    private  BookCategory bookCategory; // will store as a value in DB [default is value]
    @Enumerated
    private  Language language;
    @CreationTimestamp
    private Date createdOn;
    @UpdateTimestamp
    private  Date updatedOn;
}
