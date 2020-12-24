package com.example.demo.controller;

import com.example.demo.PageInfo;
import com.example.demo.Response;
import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试项目
 *
 * @author fuyitao
 * @date 2020/12/24
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 测试接口
     *
     * @return
     */
    @GetMapping("/page")
    public Response<PageInfo<User>> pageInfo() {
        PageInfo<User> page = userService.page(new PageInfo<>(1, 10));

        Response<PageInfo<User>> response = new Response<>();
        response.setData(page);
        return response;
    }

}
