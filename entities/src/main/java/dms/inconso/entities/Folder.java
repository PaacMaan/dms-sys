package dms.inconso.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author Mr.SAAD
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "FAV_FOL", discriminatorType = DiscriminatorType.STRING, length = 4)
public class Folder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String title;
	private String description;
	@ManyToOne
	@JoinColumn(name = "CREATOR_ID")
	private User creator;
	@ManyToOne
	@JoinColumn(name = "EDITOR_ID")
	private User editor;
	private Date dateOfCreation;
	private Date dateOfEditing;
	@OneToMany(mappedBy = "folder", fetch = FetchType.LAZY)
	private Collection<Comment> comments;
	@OneToMany(mappedBy = "folder", fetch = FetchType.LAZY)
	private Collection<Like> likes;
	@ManyToMany
	@JoinTable(name = "folders_tags", joinColumns = @JoinColumn(name = "folder-id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "tag_id", referencedColumnName = "id"))
	private Collection<Tag> tags;
	@OneToMany(mappedBy = "folder", fetch = FetchType.LAZY)
	private Collection<Document> documents;
	@ManyToOne
	@JoinColumn(name = "PARENT_ID")

	private Folder folderParent;

	/**
	 * 
	 */
	public Folder() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param title
	 * @param description
	 */
	public Folder(String name, String title, String description) {
		super();
		this.name = name;
		this.title = title;
		this.description = description;
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the creator
	 */
	public User getCreator() {
		return creator;
	}

	/**
	 * @param creator
	 *            the creator to set
	 */
	public void setCreator(User creator) {
		this.creator = creator;
	}

	/**
	 * @return the editor
	 */
	public User getEditor() {
		return editor;
	}

	/**
	 * @param editor
	 *            the editor to set
	 */
	public void setEditor(User editor) {
		this.editor = editor;
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
	 * @return the dateOfEditing
	 */
	public Date getDateOfEditing() {
		return dateOfEditing;
	}

	/**
	 * @param dateOfEditing
	 *            the dateOfEditing to set
	 */
	public void setDateOfEditing(Date dateOfEditing) {
		this.dateOfEditing = dateOfEditing;
	}

	/**
	 * @return the comments
	 */
	public Collection<Comment> getComments() {
		return comments;
	}

	/**
	 * @param comments
	 *            the comments to set
	 */
	public void setComments(Collection<Comment> comments) {
		this.comments = comments;
	}

	/**
	 * @return the likes
	 */
	public Collection<Like> getLikes() {
		return likes;
	}

	/**
	 * @param likes
	 *            the likes to set
	 */
	public void setLikes(Collection<Like> likes) {
		this.likes = likes;
	}

	/**
	 * @return the tags
	 */
	public Collection<Tag> getTags() {
		return tags;
	}

	/**
	 * @param tags
	 *            the tags to set
	 */
	public void setTags(Collection<Tag> tags) {
		this.tags = tags;
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
	 * @return the folderParent
	 */
	public Folder getFolderParent() {
		return folderParent;
	}

	/**
	 * @param folderParent
	 *            the folderParent to set
	 */
	public void setFolderParent(Folder folderParent) {
		this.folderParent = folderParent;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Folder [id=" + id + ", name=" + name + ", title=" + title + ", description=" + description
				+ ", creator=" + creator + ", editor=" + editor + ", dateOfCreation=" + dateOfCreation
				+ ", dateOfEditing=" + dateOfEditing + ", comments=" + comments + ", likes=" + likes + ", tags=" + tags
				+ ", documents=" + documents + ", folderParent=" + folderParent + "]";
	}

}
