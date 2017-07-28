/**
 * 
 */
package dms.inconso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dms.inconso.entities.Permission;

/**
 * @author rmidi
 *
 */
@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {
	/* here we'll define
	 * our custom 
	 * repository methods
	 */
}
