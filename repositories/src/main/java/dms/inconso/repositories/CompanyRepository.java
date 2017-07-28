/**
 * 
 */
package dms.inconso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dms.inconso.entities.Company;

/**
 * @author rmidi
 *
 */
@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
	/* here we'll define
	 * our custom 
	 * repository methods
	 */
}
