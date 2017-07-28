/**
 * 
 */
package dms.inconso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dms.inconso.entities.Like;

/**
 * @author rmidi
 *
 */
@Repository
public interface LikeRepository extends JpaRepository<Like, Long>{
	/* here we'll define
	 * our custom 
	 * repository methods
	 */
}
