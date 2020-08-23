package com.demo.mainService;

import java.util.List;

import com.demo.main.User;

public interface UserService {
public User authenticate(String userId, String pwd);
public User addUser(User user);
public User getUserById(long id);
public User getUserByEmailId(String emailId);
public User updateUser(User user);
public List<User> getAllUsers();


}
