package com.ust.spring.springmvcorm.user.dao;

import java.util.List;

import com.ust.spring.springmvcorm.user.entity.User;

public interface UserDao {
	
	int create(User user);
	
	
	List<User> findUsers();


}
