/**
 * 
 */
package dms.inconso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dms.inconso.entities.Role;

/**
 * @author rmidi
 *
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	/* here we'll define
	 * our custom 
	 * repository methods
	 */
}
