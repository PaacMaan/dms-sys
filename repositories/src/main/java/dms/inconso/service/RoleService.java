/**
 * 
 */
package dms.inconso.service;

import java.util.List;

import dms.inconso.entities.Role;

/**
 * @author rmidi
 *
 */
public interface RoleService {
	/*
	 * here we define
	 * our Role service
	 * methods
	 */
	void saveRole(Role like);
    void updateRole(Role like);
    void deleteRoleById(Long id);
    void deleteAllRoles();
    List<Role> getAllRole();
    Role getRoleByUser(Long id);
}
