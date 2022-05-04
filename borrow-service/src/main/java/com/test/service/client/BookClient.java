package com.test.service.client;

import com.test.entity.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author qianyu
 * @title
 * @Package com.test.service.client
 * @date 2022/5/5 01:14
 */
@FeignClient("bookservice")
public interface BookClient {
    @RequestMapping("/book/{bid}")
    Book findBookById(@PathVariable("bid") int bid);
}
