package com.ust.spring.springmvcorm.user.service;

import java.util.List;

import com.ust.spring.springmvcorm.user.entity.User;

public interface UserService {
	
	int save(User user);
	
	List<User> getUsers();

}
