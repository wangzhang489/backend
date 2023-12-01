package com.bezkoder.springjwt.repository;



import com.bezkoder.springjwt.models.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookMapper {
    @Select("SELECT * FROM books,user_books,users WHERE users.username=#{username} and users.id=user_books.user_id and books.id=user_books.book_id")
    List<Book> getBookByUSername(String username);
}