/**
 * 
 */
package dms.inconso.service;

import java.util.List;

import dms.inconso.entities.Library;

/**
 * @author rmidi
 *
 */
public interface LibraryService {
	/*
	 * here we define
	 * our Library service
	 * methods
	 */
	void saveLibrary(Library library);
    void updateLibrary(Library library);
    void deleteLibraryById(Long id);
    void deleteAllLibraries();
    List<Library> getLibrariesByUser(Long id);
    Library getLibraryById(Long id);
}
