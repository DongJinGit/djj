package com.example.ssm1.repository;

import com.example.ssm1.doman.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int saveUser(User user);
    List<User> selectAllUser();
 }