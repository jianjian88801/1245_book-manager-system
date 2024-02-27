package com.xunmaw.book.service.inte;


import com.xunmaw.book.pojo.Book;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : xunmaw
 * @create 2022/7/16 13:48
 */

public interface BookService {

    List<Book> getBooks();

    Book getBookById(int id);

    List<Book> accuracyFindBook(String bookName, Integer state);

    List<Book> likeFindBook(String bookName, Integer state);


}
