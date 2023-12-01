package com.bezkoder.springjwt.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Size(max = 500)
    private String author;
    @Size(max = 500)
    private String bookformat;
    @Size(max = 8000)
    private String description;

    @Size(max = 500)
    private String genre;
    @Size(max = 1000)
    private String img;
    @Size(max = 500)
    private String isbn;
//    @Size(max = 1000)
//    private String isbn13;
    @Size(max = 1000)
    private String link;
    @Size(max = 500)
    private int pages;
    @Size(max = 500)
    private double rating;
    @Size(max = 500)
    private int reviews;
    @Size(max = 500)
    private String title;

    public Book(String author, String bookformat, String description, String genre, String img, String isbn, String link, int pages, double rating, int reviews, String title) {
    }
//    @Size(max = 500)
//    private int totalratings;

}
