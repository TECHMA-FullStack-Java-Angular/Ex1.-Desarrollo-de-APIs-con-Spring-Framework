package com.example.demo.service;

import java.util.List;


import com.example.demo.dto.User;

public interface IUserService {
	
	//Basic CRUD methods
	
		public List<User> showUsers(); //get All 
		
		public User createUser(User user);	//CREATE
		
		public User findUser(int id); // READ
		
		public User updateUser(User user); // UPDATE
		
		public void deleteUser(int id);//  DELETE
		
		

}
