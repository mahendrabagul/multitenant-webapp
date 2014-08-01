package com.howtodoinjava.dao;

import com.howtodoinjava.entity.User;

public interface UserDAO {
	public User getUser(String login);
}