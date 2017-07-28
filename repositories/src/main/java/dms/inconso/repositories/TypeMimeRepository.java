/**
 * 
 */
package dms.inconso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author rmidi
 *
 */
@Repository
public interface TypeMimeRepository extends JpaRepository<TypeMimeRepository, Long> {
	/* here we'll define
	 * our custom 
	 * repository methods
	 */
}
