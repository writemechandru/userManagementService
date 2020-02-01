package com.psgr.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.psgr.project.entity.User;

@Service
public interface UserService {
	
	List<User> getAllUser();
	User getUserDetail(Integer userId);
	User createUser(User user);
	User updateUser(Integer id,User user);
	Boolean deleteUser(Integer id);

}
