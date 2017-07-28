/**
 * 
 */
package dms.inconso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dms.inconso.entities.Document;

/**
 * @author rmidi
 *
 */
@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
	/* here we'll define
	 * our custom 
	 * repository methods
	 */
}
