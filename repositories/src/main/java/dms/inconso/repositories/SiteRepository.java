/**
 * 
 */
package dms.inconso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dms.inconso.entities.Site;

/**
 * @author rmidi
 *
 */
@Repository
public interface SiteRepository extends JpaRepository<Site, Long> {
	/* here we'll define
	 * our custom 
	 * repository methods
	 */
}
