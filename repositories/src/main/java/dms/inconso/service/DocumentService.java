/**
 * 
 */
package dms.inconso.service;

import java.util.List;

import dms.inconso.entities.Document;

/**
 * @author rmidi
 *
 */
public interface DocumentService {
	/*
	 * here we define
	 * our Document service
	 * methods
	 */
    void saveDocumenty(Document company);
    void updateDocument(Document company);
    void deleteDocumentById(Long id);
    void deleteAllDocuments();
    List<Document> getAllDocument();
    Document getDocumentById(Long id);
}
