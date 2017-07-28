package dms.inconso.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * @author Mr.SAAD
 *
 */
@Entity
public class Tag implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Date dateOfCreation;
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private User user;
	@ManyToMany(mappedBy = "tags")
	private Collection<Document> documents;
	@ManyToMany(mappedBy = "tags")
	private Collection<Folder> folders;

	/**
	 * 
	 */
	public Tag() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public Tag(String name) {
		super();
		this.name = name;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dateOfCreation
	 */
	public Date getDateOfCreation() {
		return dateOfCreation;
	}

	/**
	 * @param dateOfCreation
	 *            the dateOfCreation to set
	 */
	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(User user) {
		this.user = user;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Tag [id=" + id + ", name=" + name + ", dateOfCreation=" + dateOfCreation + ", user=" + user
				+ ", documents=" + documents + ", folders=" + folders + "]";
	}

}
