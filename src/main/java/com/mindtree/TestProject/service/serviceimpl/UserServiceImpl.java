package com.mindtree.TestProject.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mindtree.TestProject.dao.UserDao;
import com.mindtree.TestProject.entity.User;
import com.mindtree.TestProject.service.UserService;

@Service
@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public String addUser()
	{
		User user=new User();
 		user.setUserName("monika");
		user.setPassword("pass");
		this.userDao.addUser(user);
		System.out.println("done");
		return "true";
	}
	
	
	@Override
	public String startWebService() {
		System.out.println("Start Service");
		// TODO Auto-generated method stub
		return "Web service started";
	}
	
	public boolean deleteUser()
	{
		
		return true;
	}
	
	
	
	public boolean logIn(User user)
	{
		User vUser=this.userDao.getUser(user.getUserName());
		
		if(vUser==null)
		return false;
		
		if(vUser.getPassword().equals(user.getPassword()))
			return true;
		
		return false;
		
		
	}
	
}
