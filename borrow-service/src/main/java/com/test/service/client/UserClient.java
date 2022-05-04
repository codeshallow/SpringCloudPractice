package com.test.service.client;

import com.test.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author qianyu
 * @title
 * @Package com.test.service.client
 * @date 2022/5/5 01:10
 */
@FeignClient("userservice") //声明为userservice服务的HTTP请求客户端
public interface UserClient {

    @RequestMapping("/user/{uid}")
    User findUserById(@PathVariable("uid") int uid);
}
