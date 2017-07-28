/**
 * 
 */
package dms.inconso.service;

import java.util.List;

import dms.inconso.entities.Permission;

/**
 * @author rmidi
 *
 */
public interface PermissionService {
	/*
	 * here we define
	 * our Permission service
	 * methods
	 */
	void savePermission(Permission permission);
    void updatePermission(Permission permission);
    void deletePermissionById(Long id);
    void deleteAllPermissions();
    List<Permission> getAllPermission();
    Permission getPermissionByUser(Long id);
}
