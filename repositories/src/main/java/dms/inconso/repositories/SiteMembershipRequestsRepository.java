/**
 * 
 */
package dms.inconso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dms.inconso.entities.SiteMembershipRequests;

/**
 * @author rmidi
 *
 */
@Repository
public interface SiteMembershipRequestsRepository extends JpaRepository<SiteMembershipRequests, Long> {
	/* here we'll define
	 * our custom 
	 * repository methods
	 */
}
