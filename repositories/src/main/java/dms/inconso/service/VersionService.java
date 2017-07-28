/**
 * 
 */
package dms.inconso.service;

import java.util.List;

import dms.inconso.entities.Version;

/**
 * @author rmidi
 *
 */
public interface VersionService {
	/*
	 * here we define
	 * our Version service
	 * methods
	 */
	void saveVersion(Version version);
    void updateVersion(Version version);
    void deleteVersionById(Long id);
    void deleteAllVersions();
    List<Version> getAllVersions();
}
