package com.mindtree.TestProject.dao.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.TestProject.dao.UserDao;
import com.mindtree.TestProject.entity.User;

@Transactional
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean addUser(User user) {
		this.sessionFactory.getCurrentSession().save(user);
		return true;
	}

	public User getUser(String userName) {
		return (User) this.sessionFactory.getCurrentSession().get(User.class, userName);
	}

	public boolean deleteUser(String userName) {
		this.sessionFactory.getCurrentSession().delete(this.getUser(userName));
		return true;
	}

	public List<User> getAllUsers() {
		return this.sessionFactory.getCurrentSession().createQuery("from User").list();
	}

	
	public boolean updateUser(User user)
	{
		this.sessionFactory.getCurrentSession().update(user);
		return true;
	}
	
	
}
