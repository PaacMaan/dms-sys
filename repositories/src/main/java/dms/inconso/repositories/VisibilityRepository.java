/**
 * 
 */
package dms.inconso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dms.inconso.entities.Visibility;

/**
 * @author rmidi
 *
 */
@Repository
public interface VisibilityRepository extends JpaRepository<Visibility, Long> {
	/* here we'll define
	 * our custom 
	 * repository methods
	 */
}
