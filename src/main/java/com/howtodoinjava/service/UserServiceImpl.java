package com.howtodoinjava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.howtodoinjava.dao.UserDAO;
import com.howtodoinjava.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	@Override
	@Transactional
	public User getUser(String login) {
		return userDAO.getUser(login);
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}