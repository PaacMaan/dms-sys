/**
 * 
 */
package dms.inconso.service;

import java.util.List;

import dms.inconso.entities.SiteType;

/**
 * @author rmidi
 *
 */
public interface SiteTypeService {
	/*
	 * here we define
	 * our SiteType service
	 * methods
	 */
	void saveSiteType(SiteType siteType);
    void updateSiteType(SiteType siteType);
    void deleteSiteTypeById(Long id);
    void deleteAllSiteTypes();
    List<SiteType> getAllSiteTypes();
}
