package dms.inconso.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author Mr.SAAD
 *
 */
@Entity
public class Library implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToMany(fetch = FetchType.LAZY)
	private Collection<Folder> folders;
	@OneToMany(fetch = FetchType.LAZY)
	private Collection<Document> documents;
	private Double currentStorage;
	private Double storageLimit;

	/**
	 * 
	 */
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param storageLimit
	 */
	public Library(Double storageLimit) {
		super();
		this.storageLimit = storageLimit;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the folders
	 */
	public Collection<Folder> getFolders() {
		return folders;
	}

	/**
	 * @param folders
	 *            the folders to set
	 */
	public void setFolders(Collection<Folder> folders) {
		this.folders = folders;
	}

	/**
	 * @return the documents
	 */
	public Collection<Document> getDocuments() {
		return documents;
	}

	/**
	 * @param documents
	 *            the documents to set
	 */
	public void setDocuments(Collection<Document> documents) {
		this.documents = documents;
	}

	/**
	 * @return the currentStorage
	 */
	public Double getCurrentStorage() {
		return currentStorage;
	}

	/**
	 * @param currentStorage
	 *            the currentStorage to set
	 */
	public void setCurrentStorage(Double currentStorage) {
		this.currentStorage = currentStorage;
	}

	/**
	 * @return the storageLimit
	 */
	public Double getStorageLimit() {
		return storageLimit;
	}

	/**
	 * @param storageLimit
	 *            the storageLimit to set
	 */
	public void setStorageLimit(Double storageLimit) {
		this.storageLimit = storageLimit;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Library [id=" + id + ", folders=" + folders + ", documents=" + documents + ", currentStorage="
				+ currentStorage + ", storageLimit=" + storageLimit + "]";
	}

}
