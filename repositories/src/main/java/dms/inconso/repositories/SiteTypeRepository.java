/**
 * 
 */
package dms.inconso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dms.inconso.entities.SiteType;

/**
 * @author rmidi
 *
 */
@Repository
public interface SiteTypeRepository extends JpaRepository<SiteType, Long>{
	/* here we'll define
	 * our custom 
	 * repository methods
	 */
}
