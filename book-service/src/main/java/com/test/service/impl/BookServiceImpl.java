package com.test.service.impl;

import com.test.entity.Book;
import com.test.mapper.BookMapper;
import com.test.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author qianyu
 * @title
 * @Package com.test.service.impl
 * @date 2022/5/4 01:43
 */
@Service
public class BookServiceImpl implements BookService {
    @Resource
    BookMapper bookMapper;

    @Override
    public Book getBookById(int bid) {

        return bookMapper.getBookById(bid);
    }
}
