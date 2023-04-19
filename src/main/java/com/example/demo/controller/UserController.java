package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.User;
import com.example.demo.service.UserServiceImpl;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserServiceImpl userService;

	@PostMapping("/user")
	public User createUser(@RequestBody User user) {

		return userService.createUser(user);
	}

	@PutMapping("/user/{id}")
	public User updateUser(@PathVariable(name = "id") int id, @RequestBody User user) {

		User selectedUser = new User();
		User updatedUser = new User();

		selectedUser = userService.findUser(id);

		selectedUser.setEmail(user.getEmail());
		selectedUser.setName(user.getName());
		selectedUser.setPassword(user.getPassword());
		selectedUser.setStreamName(user.getStreamName());

		updatedUser = userService.updateUser(selectedUser);

		return updatedUser;
	}

	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable(name = "id") int id) {
		userService.deleteUser(id);
	}

}
