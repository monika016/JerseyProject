package com.mindtree.TestProject.dao;

import java.util.List;

import com.mindtree.TestProject.entity.User;

public interface UserDao {
	public boolean addUser(User user);

	public User getUser(String userName);

	public boolean deleteUser(String userName);

	public List<User> getAllUsers();

	public boolean updateUser(User user);
}
