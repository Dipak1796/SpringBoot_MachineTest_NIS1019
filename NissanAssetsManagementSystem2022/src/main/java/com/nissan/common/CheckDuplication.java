package com.nissan.common;

import java.util.List;

import com.nissan.model.Login;
import com.nissan.model.User;

public class CheckDuplication {
	//check Duplication for phone number
	public Boolean checkPhoneNumber(List<User> userlist,String email)
	{
		for(User user:userlist)
		{
			if(user.getPhoneNumber().equals(email))
				return true;
		}
		return false;
	}
	//check Duplication for username
	public Boolean checkUserName(List<Login> loginlist,String username) {
		for(Login login:loginlist)
		{
			if(login.getUsername().equals(username))
				return true;
		}
		return false;
	}

}
