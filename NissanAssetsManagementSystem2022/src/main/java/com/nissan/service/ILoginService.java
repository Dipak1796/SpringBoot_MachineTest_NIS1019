package com.nissan.service;

import java.util.List;

import com.nissan.model.Login;

public interface ILoginService {
	
	//Save Login
	public Login addLogin(Login login);
	
	//update Login
	public Login updatelogin(Login login);
	
	//delete Login
	public void deleteLogin(Integer id);
	
	//getAll Login
	public List<Login> getAllLogin();
	
	//get Login by Id
	public Login getByLoginId(Integer lId);

}
