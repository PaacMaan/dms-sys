/**
 * 
 */
package dms.inconso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dms.inconso.entities.FavoriteDocument;
/**
 * @author rmidi
 *
 */
@Repository
public interface FavoriteDocumentRepository extends JpaRepository<FavoriteDocument, Long> {
	/* here we'll define
	 * our custom 
	 * repository methods
	 */
}
