package com.ust.spring.springmvcorm.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ust.spring.springmvcorm.user.dao.UserDao;
import com.ust.spring.springmvcorm.user.entity.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public int save(User user) {
		//business logic
		return dao.create(user);
	}

	@Override
	public List<User> getUsers() {

		return dao.findUsers();
	}



}
