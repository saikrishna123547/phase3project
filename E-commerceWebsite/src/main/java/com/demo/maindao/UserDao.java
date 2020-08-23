package com.demo.maindao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.main.User;

public interface UserDao  extends JpaRepository<User, Long>{

	User findByEmailId(String emailId);
	
}
