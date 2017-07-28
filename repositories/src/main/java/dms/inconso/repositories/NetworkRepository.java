/**
 * 
 */
package dms.inconso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dms.inconso.entities.Network;

/**
 * @author rmidi
 *
 */
@Repository
public interface NetworkRepository extends JpaRepository<Network, Long> {
	/* here we'll define
	 * our custom 
	 * repository methods
	 */
}
