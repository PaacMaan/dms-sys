/**
 * 
 */
package dms.inconso.service;

import java.util.List;

import dms.inconso.entities.Like;

/**
 * @author rmidi
 *
 */
public interface LikeService {
	/*
	 * here we define
	 * our Like service
	 * methods
	 */
	void saveLike(Like like);
    void updateLike(Like like);
    void deleteLikeById(Long id);
    void deleteAllLikes();
    List<Like> getLikesByDocument(Long id);
}
