package com.nissan.service;

import java.util.List;

import com.nissan.model.User;

public interface IUserService {
	
	
	//getAll User
	public List<User> getAllUser();
	
	//Save User
	public User addUser (User user) throws Exception;
	
	//update user
	public User updateUser(User user) throws Exception;
	
	//Delete user
	public void deleteUser(Integer uId);
	
	//get user by id
	public User getByUserId(Integer uId);

}
