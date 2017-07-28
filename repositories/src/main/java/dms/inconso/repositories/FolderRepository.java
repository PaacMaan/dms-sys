/**
 * 
 */
package dms.inconso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dms.inconso.entities.Folder;

/**
 * @author rmidi
 *
 */
@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
	/* here we'll define
	 * our custom 
	 * repository methods
	 */
}
