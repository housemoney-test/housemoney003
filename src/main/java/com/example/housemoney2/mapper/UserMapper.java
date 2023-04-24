package com.example.housemoney2.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.housemoney2.entity.User;

@Mapper
public interface UserMapper {
	List<User>findAll();
	int create(User entity);
	User login(User entity);

}