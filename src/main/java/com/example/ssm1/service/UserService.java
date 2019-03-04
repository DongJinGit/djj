package com.example.ssm1.service;

import com.example.ssm1.doman.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
//写一些复杂的业务逻辑
public interface UserService {
    int signIn(User user);
    List<User> getAllUser();
}