/**
 * 
 */
package dms.inconso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dms.inconso.entities.Library;

/**
 * @author rmidi
 *
 */
@Repository
public interface LibraryRepository extends JpaRepository<Library, Long> {
	/* here we'll define
	 * our custom 
	 * repository methods
	 */
}
