/**
 * 
 */
package dms.inconso.service;

import java.util.List;

import dms.inconso.entities.Folder;

/**
 * @author rmidi
 *
 */
public interface FolderService {
	/*
	 * here we define
	 * our Folder service
	 * methods
	 */
	void saveFolder(Folder folder);
    void updateFolder(Folder folder);
    void deleteFolderById(Long id);
    void deleteAllFolders();
    List<Folder> getFoldersByUser(Long id);
    Folder getFolderById(Long id);
}
