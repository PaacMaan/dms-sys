/**
 * 
 */
package dms.inconso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dms.inconso.entities.User;

/**
 * @author rmidi
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	/* here we'll define
	 * our custom 
	 * repository methods
	 */
	User findByName(String name);
}
