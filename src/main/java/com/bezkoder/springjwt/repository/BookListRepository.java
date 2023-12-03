package com.bezkoder.springjwt.repository;



import com.bezkoder.springjwt.models.BookList;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BookListRepository extends JpaRepository<BookList, Long> {
    Optional<BookList> findByName(String name);

    Boolean existsByName(String name);

    Page<BookList> findByNameContaining(String name, Pageable pageable);

    List<BookList> findAll();

}
