/**
 * 
 */
package dms.inconso.service;

import java.util.List;

import dms.inconso.entities.Visibility;

/**
 * @author rmidi
 *
 */
public interface VisibilityService {
	/*
	 * here we define
	 * our Visibility service
	 * methods
	 */
	void saveVisibility(Visibility visibility);
    void updateVisibility(Visibility visibility);
    void deleteVisibilityById(Long id);
    void deleteAllVisibility();
    List<Visibility> getAllVisibilities();
    Visibility getVisibiltyByPermission(Long id);
}
