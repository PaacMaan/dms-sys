/**
 * 
 */
package dms.inconso.service;

import java.util.List;

import dms.inconso.entities.SiteMembershipRequests;

/**
 * @author rmidi
 *
 */
public interface SiteMembershipRequestsService {
	/*
	 * here we define
	 * our SiteMembershipRequests service
	 * methods
	 */
	void saveSiteMembershipRequests(SiteMembershipRequests like);
    void updateSiteMembershipRequests(SiteMembershipRequests like);
    void deleteSiteMembershipRequestsById(Long id);
    void deleteAllSiteMembershipRequests();
    List<SiteMembershipRequests> getAllSiteMembershipRequestsByUser(Long id);
}
