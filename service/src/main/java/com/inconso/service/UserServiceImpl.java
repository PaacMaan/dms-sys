/**
 * 
 */
package com.inconso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dms.inconso.entities.User;
import dms.inconso.repositories.UserRepository;
import dms.inconso.service.UserService;;

/**
 * @author rmidi
 *
 */
@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findOne(id);
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		saveUser(user);
	}

	@Override
	public void deleteUserById(Long id) {
		// TODO Auto-generated method stub
		userRepository.delete(id);
	}

	@Override
	public void deleteAllUsers() {
		// TODO Auto-generated method stub
		userRepository.deleteAll();
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public boolean isUserExist(User user) {
		// TODO Auto-generated method stub
		return findByName(user.getLastName()) != null;
	}

	@Override
	public User findByName(String name) {
		// TODO Auto-generated method stub
		return userRepository.findByName(name);
	}
	
}
