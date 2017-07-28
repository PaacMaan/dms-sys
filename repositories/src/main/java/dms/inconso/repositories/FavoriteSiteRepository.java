/**
 * 
 */
package dms.inconso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dms.inconso.entities.FavoriteSite;

/**
 * @author rmidi
 *
 */
@Repository
public interface FavoriteSiteRepository extends JpaRepository<FavoriteSite, Long> {
	/* here we'll define
	 * our custom 
	 * repository methods
	 */
}
