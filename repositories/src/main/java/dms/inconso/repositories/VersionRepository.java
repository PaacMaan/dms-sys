/**
 * 
 */
package dms.inconso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dms.inconso.entities.Version;

/**
 * @author rmidi
 *
 */
@Repository
public interface VersionRepository extends JpaRepository<Version, Long> {
	/* here we'll define
	 * our custom 
	 * repository methods
	 */
}
