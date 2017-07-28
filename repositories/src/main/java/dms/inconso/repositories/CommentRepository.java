/**
 * 
 */
package dms.inconso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dms.inconso.entities.*;

/**
 * @author rmidi
 *
 */
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
	/* here we'll define
	 * our custom 
	 * repository methods
	 */
}
