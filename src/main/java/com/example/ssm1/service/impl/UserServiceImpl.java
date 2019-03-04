package com.example.ssm1.service.impl;

import com.example.ssm1.doman.User;
import com.example.ssm1.repository.UserMapper;
import com.example.ssm1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int signIn(User user) {
        return userMapper.saveUser(user);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.selectAllUser();
    }
}