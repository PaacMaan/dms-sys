/**
 * 
 */
package dms.inconso.service;

import java.util.List;

import dms.inconso.entities.Site;

/**
 * @author rmidi
 *
 */
public interface SiteService {
	/*
	 * here we define
	 * our Site service
	 * methods
	 */
	void saveSite(Site site);
    void updateSite(Site site);
    void deleteSiteById(Long id);
    void deleteAllSites();
    List<Site> getAllSites();
}
