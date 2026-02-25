package com.example.libraryapp.Model;


import com.example.libraryapp.DTO.Book.BookRequest;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Year;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String author;
    private String isbn;
    private Year publicationYear;

    public static Book from(BookRequest bookRequest){
        Book book = new Book();
        book.setTitle(bookRequest.getTitle());
        book.setAuthor(bookRequest.getAuthor());
        return book;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Year getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Year publicationYear) {
        this.publicationYear = publicationYear;
    }

}
