package com.demo.mainServiceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.main.User;
import com.demo.mainService.UserService;
import com.demo.maindao.UserDao;
@Service
public class UserServiceimpl implements UserService{
@Autowired
private UserDao dao;
	@Override
	public User authenticate(String userId, String pwd) {
		
		return null;
	}

	@Override
	public User addUser(User user) {
		
		return dao.save(user);
	}

	@Override
	public User getUserById(long id) {
		
		return dao.findById(id).get();
	}

	@Override
	public User getUserByEmailId(String emailId) {
		
		return dao.findByEmailId(emailId);
	}

	@Override
	public User updateUser(User user) {
		
		return dao.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		
		return dao.findAll();
	}

}
