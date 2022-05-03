package com.test.service;

import com.test.entity.UserBorrowDetail;

/**
 * @author qianyu
 * @title
 * @Package com.test.service
 * @date 2022/5/4 02:24
 */
public interface BorrowService {
    UserBorrowDetail getUserBorrowDetailByUid(int uid);
}
