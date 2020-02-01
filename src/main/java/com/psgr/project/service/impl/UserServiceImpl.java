package com.psgr.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psgr.project.entity.User;
import com.psgr.project.repository.UserRepository;
import com.psgr.project.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUserDetail(Integer userId) {
		User user = new User();
		user.setId(1);
		user.setFirstName("Pooranachandran");
		user.setPhoneNumber("+91 8056677078");
		return userRepository.findById(userId).orElse(user);
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.saveAndFlush(user);
	}

	@Override
	public User updateUser(Integer id, User user) {
		user.setId(id);
		return userRepository.saveAndFlush(user);
	}

	@Override
	public Boolean deleteUser(Integer id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
		return true;
	}

}
