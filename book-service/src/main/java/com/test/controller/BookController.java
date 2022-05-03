package com.test.controller;

import com.test.entity.Book;
import com.test.service.BookService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author qianyu
 * @title
 * @Package com.test.controller
 * @date 2022/5/4 01:46
 */
@RestController
public class BookController {

    @Resource
    BookService bookService;

    @RequestMapping("/book/{bid}")
    Book findBookById(@PathVariable("bid") int bid){
        return bookService.getBookById(bid);
    }
}
