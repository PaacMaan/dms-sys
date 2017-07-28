/**
 * 
 */
package dms.inconso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dms.inconso.entities.FavoriteFolder;

/**
 * @author rmidi
 *
 */
@Repository
public interface FavoriteFolderRepository extends JpaRepository<FavoriteFolder, Long> {
	/* here we'll define
	 * our custom 
	 * repository methods
	 */
}
