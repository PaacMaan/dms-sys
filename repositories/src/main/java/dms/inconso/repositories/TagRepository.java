/**
 * 
 */
package dms.inconso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dms.inconso.entities.Tag;

/**
 * @author rmidi
 *
 */
@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
	/* here we'll define
	 * our custom 
	 * repository methods
	 */
}
