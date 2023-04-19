package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IUserDao;
import com.example.demo.dto.User;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	IUserDao iUser;

	@Override
	public List<User> showUsers() {
		
		return iUser.findAll();
	}

	@Override
	public User createUser(User user) {
		
		return iUser.save(user);
	}

	@Override
	public User findUser(int id) {
		
		return iUser.findById(id).get();
	}

	@Override
	public User updateUser(User user) {
		
		return iUser.save(user);
	}

	@Override
	public void deleteUser(int id) {
		iUser.deleteById(id);
		
	}

}
