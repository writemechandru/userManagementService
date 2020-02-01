package com.psgr.project.conrtoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.psgr.project.entity.User;
import com.psgr.project.service.UserService;

@RestController()
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(path = "/users")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}
	
	@GetMapping(path = "/users/{id}")
	public User getUser(@PathVariable("id") Integer userId) {
		return userService.getUserDetail(userId);
	}
	
	@PostMapping(path="/users")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@PutMapping(path="/users/{id}")
	public User updateUser(@RequestBody User user,@PathVariable("id") Integer userId) {
		return userService.updateUser(userId, user);
	}
	
	@DeleteMapping(path="/users/{id}")
	public Boolean deleteUser(@PathVariable("id") Integer userId) {
		return userService.deleteUser(userId);
	}
}
