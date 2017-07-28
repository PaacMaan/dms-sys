/**
 * 
 */
package dms.inconso.service;

import java.util.List;

import dms.inconso.entities.TypeMime;

/**
 * @author rmidi
 *
 */
public interface TypeMimeService {
	/*
	 * here we define
	 * our TypeMime service
	 * methods
	 */
	void saveTypeMime(TypeMime typeMime);
    void updateTypeMime(TypeMime typeMime);
    void deleteTypeMimeById(Long id);
    void deleteAllTypeMimes();
    List<TypeMime> getAllTypeMimes();
}
