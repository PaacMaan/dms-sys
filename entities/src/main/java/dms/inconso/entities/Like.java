package dms.inconso.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Mr.SAAD
 *
 */
@Entity
public class Like implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private User user;
	private Date dateOfLike;
	@ManyToOne
	@JoinColumn(name = "DOCUMENT_ID")
	private Document document;
	@ManyToOne
	@JoinColumn(name = "FOLDER_ID")
	private Folder folder;

	/**
	 * 
	 */
	public Like() {
		super();
		// TODO Auto-generated constructor stub
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
	 * @return the dateOfLike
	 */
	public Date getDateOfLike() {
		return dateOfLike;
	}

	/**
	 * @param dateOfLike
	 *            the dateOfLike to set
	 */
	public void setDateOfLike(Date dateOfLike) {
		this.dateOfLike = dateOfLike;
	}

	/**
	 * @return the document
	 */
	public Document getDocument() {
		return document;
	}

	/**
	 * @param document
	 *            the document to set
	 */
	public void setDocument(Document document) {
		this.document = document;
	}

	/**
	 * @return the folder
	 */
	public Folder getFolder() {
		return folder;
	}

	/**
	 * @param folder
	 *            the folder to set
	 */
	public void setFolder(Folder folder) {
		this.folder = folder;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Like [id=" + id + ", user=" + user + ", dateOfLike=" + dateOfLike + ", document=" + document
				+ ", folder=" + folder + "]";
	}

	

}
