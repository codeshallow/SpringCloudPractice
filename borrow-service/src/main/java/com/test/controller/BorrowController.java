package com.test.controller;

import com.test.entity.UserBorrowDetail;
import com.test.service.BorrowService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author qianyu
 * @title
 * @Package com.test.controller
 * @date 2022/5/4 02:41
 */
@RestController
public class BorrowController {
    @Resource
    BorrowService borrowService;

    @RequestMapping("/borrow/{uid}")
    UserBorrowDetail findUserBorrow(@PathVariable("uid") int uid){
        return borrowService.getUserBorrowDetailByUid(uid);
    }
}
