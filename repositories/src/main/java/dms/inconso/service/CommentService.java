/**
 * 
 */
package dms.inconso.service;

import java.util.List;

import dms.inconso.entities.Comment;;

/**
 * @author rmidi
 *
 */
public interface CommentService {
	/*
	 * here we define
	 * our Comment service
	 * methods
	 */
    void saveComemnt(Comment comment);
    void updateUser(Comment comment);
    void deleteCommentById(Long id);
    void deleteAllComent();
    List<Comment> getCommentsByDocument(Long id);
}
