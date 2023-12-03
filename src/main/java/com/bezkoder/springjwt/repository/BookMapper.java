package com.bezkoder.springjwt.repository;


import com.bezkoder.springjwt.models.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface BookMapper {
    @Select("SELECT * FROM books,user_books,users WHERE users.username=#{username} and users.id=user_books.user_id and books.id=user_books.book_id")
    List<Book> getBookByUSername(String username);

    @Select("SELECT user_books.book_id FROM books,user_books WHERE user_books.user_id=#{userid} and books.id=user_books.book_id")
    List<Integer> getBookIDByUserID(int userid);

    @Select("SELECT user_books.book_id FROM user_books,users WHERE users.username=#{username} and users.id=user_books.user_id")
    List<Integer> getBookIdByUsername(String username);

    @Insert("insert into user_books values (#{userid},#{bookid} )")
    int buybook(int userid, int bookid);
}