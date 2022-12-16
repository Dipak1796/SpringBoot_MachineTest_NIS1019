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

import com.nissan.model.Login;
import com.nissan.service.ILoginService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class LoginController {
	
	@Autowired
	ILoginService loginservice;
	
	@GetMapping("logins")
	public List<Login> getAllogin(){
		return loginservice.getAllLogin();
	}
	
	@GetMapping("logins/{_lId}")
	public Login getByLoginId(@PathVariable Integer _lId) {
		return loginservice.getByLoginId(_lId);
	}
	
	@PostMapping("logins")
	public Login addlogin(@RequestBody Login login)
	{
		return loginservice.addLogin(login);
	}
	
	@PutMapping("logins")
	public Login updateUser(@RequestBody Login login)
	{
		return loginservice.updatelogin(login);
	}
	
	@DeleteMapping("logins/{_lId}")
	public void deleteUser(@PathVariable Integer _lId)
	{
		loginservice.deleteLogin(_lId);
	}
	
	

}
