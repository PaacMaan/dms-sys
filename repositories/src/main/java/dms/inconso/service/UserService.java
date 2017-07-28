/**
 * 
 */
package dms.inconso.service;

import java.util.List;

import dms.inconso.entities.User;

/**
 * @author rmidi
 *
 */
public interface UserService {
	/*
	 * here we define
	 * our User service
	 * methods
	 */
	User findById(Long id);
	User findByName(String name);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUserById(Long id);
    void deleteAllUsers();
    List<User> findAllUsers();
    boolean isUserExist(User user);
}
