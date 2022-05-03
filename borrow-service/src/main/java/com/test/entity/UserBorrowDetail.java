package com.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;



import java.util.List;

/**
 * @author qianyu
 * @title
 * @Package com.test.entity
 * @date 2022/5/4 02:10
 */
@Data
@AllArgsConstructor
public class UserBorrowDetail {
    User user;
    List<Book> bookList;
}
