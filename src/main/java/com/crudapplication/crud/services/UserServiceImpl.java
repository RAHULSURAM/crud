package com.crudapplication.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudapplication.crud.dao.UserDao;
import com.crudapplication.crud.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public User addUser(User user) {
		userDao.save(user);
		return user;
	}

	@Override
	public List<User> getUsers() {
		return userDao.findAll();
	}

	@Override
	public User getUser(long id) {
		return userDao.findById(id).get();
	}
	
	@Override
	public User updateUser(User user) {
		userDao.save(user);
		return user;
	}
	
	public User deleteUser(long id) {
		User user = userDao.findById(id).get();
		userDao.deleteById(id);
		
		return user;
		
	}

}
