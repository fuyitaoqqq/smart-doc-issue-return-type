package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author fuyitao
 * @date 2020/12/24
 */
@Service
public class UserService extends ServiceImpl<UserMapper, User> {

    private static final Logger log = LoggerFactory.getLogger(UserService.class);

}
