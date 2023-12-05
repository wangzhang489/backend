package com.bezkoder.springjwt.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "booklists")
public class BookList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //    @Size(max = 500)
//    private List<String> reviews;
    @Size(max = 500)
    private int visibility;
    @Size(max = 500)
    private String name;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "booklist_books",
            joinColumns = @JoinColumn(name = "booklist_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))
    private List<Book> books = new LinkedList<>();


    public BookList(int visibility, String name, List<Book> books) {
    }
}
