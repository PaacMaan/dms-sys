/**
 * 
 */
package dms.inconso.service;

import java.util.List;

import dms.inconso.entities.Tag;

/**
 * @author rmidi
 *
 */
public interface TagService {
	/*
	 * here we define
	 * our Tag service
	 * methods
	 */
	void saveTag(Tag tag);
    void updateTag(Tag tag);
    void deleteTagById(Long id);
    void deleteAllTags();
    List<Tag> getAllTags();
}
