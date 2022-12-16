package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.User;
import com.nissan.service.IUserService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class UserController {
	
	@Autowired
	IUserService userservice;
	
	@PostMapping("users")
	public User addUser(@RequestBody User newUser)
	{
		User user=null;
		try {
			user= userservice.updateUser(newUser);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	@PutMapping("users")
	public User updateUser(@RequestBody User newUser)
	{
		User user=null;
		try {
			user= userservice.updateUser(newUser);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	@DeleteMapping("users/{_uId}")
	public void deleteUser(@PathVariable Integer _uId)
	{
		userservice.deleteUser(_uId);
	}
	
	@GetMapping("users")
	public List<User> getAllUser(){
		return userservice.getAllUser();
	}
	
	@GetMapping("users/{_uId}")
	public User getByUserid(@PathVariable Integer _uId) {
		return userservice.getByUserId(_uId);
	}

}
