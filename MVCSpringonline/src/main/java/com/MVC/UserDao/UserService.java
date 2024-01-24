package com.MVC.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MVC.Model.User;

@Service
public class UserService {
@Autowired	
private UserDao userDao;
public int createUser(User user) {
	return this.userDao.saveUser(user);
}
}
