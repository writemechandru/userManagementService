package com.psgr.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.psgr.project.entity.User;

@Repository
public interface UserRepository extends JpaRepository
<User, Integer>{
	
	public Optional<User> findById(Integer id);


}
