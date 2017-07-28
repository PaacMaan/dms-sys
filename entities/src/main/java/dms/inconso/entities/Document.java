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
@DiscriminatorColumn(name = "FAV_DOC", discriminatorType = DiscriminatorType.STRING, length = 4)
public class Document implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String title;
	private String description;
	private String author;
	private Double size;
	@ManyToOne
	@JoinColumn(name = "CREATOR_ID")
	private User creator;
	@ManyToOne
	@JoinColumn(name = "EDITOR_ID")
	private User editor;
	private Date dateOfCreation;
	private Date dateofEditing;
	@OneToMany(mappedBy = "document", fetch = FetchType.LAZY)
	private Collection<Version> Versions;
	@OneToMany(mappedBy = "document")
	private Collection<Comment> comments;
	@OneToMany(mappedBy = "document")
	private Collection<Like> likes;
	@ManyToMany
	@JoinTable(name = "documents_tags", joinColumns = @JoinColumn(name = "document-id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "tag_id", referencedColumnName = "id"))
	private Collection<Tag> tags;
	@ManyToOne
	@JoinColumn(name = "TYPE_ID")
	private TypeMime typeMime;
	@ManyToOne
	@JoinColumn(name = "FOLDER_ID")
	private Folder folder;

	/**
	 * 
	 */
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param title
	 * @param description
	 */
	public Document(String name, String title, String description) {
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
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the size
	 */
	public Double getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(Double size) {
		this.size = size;
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
	 * @return the dateofEditing
	 */
	public Date getDateofEditing() {
		return dateofEditing;
	}

	/**
	 * @param dateofEditing
	 *            the dateofEditing to set
	 */
	public void setDateofEditing(Date dateofEditing) {
		this.dateofEditing = dateofEditing;
	}

	/**
	 * @return the versions
	 */
	public Collection<Version> getVersions() {
		return Versions;
	}

	/**
	 * @param versions
	 *            the versions to set
	 */
	public void setVersions(Collection<Version> versions) {
		Versions = versions;
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
	 * @return the typeMime
	 */
	public TypeMime getTypeMime() {
		return typeMime;
	}

	/**
	 * @param typeMime
	 *            the typeMime to set
	 */
	public void setTypeMime(TypeMime typeMime) {
		this.typeMime = typeMime;
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
		return "Document [id=" + id + ", name=" + name + ", title=" + title + ", description=" + description
				+ ", author=" + author + ", size=" + size + ", creator=" + creator + ", editor=" + editor
				+ ", dateOfCreation=" + dateOfCreation + ", dateofEditing=" + dateofEditing + ", Versions=" + Versions
				+ ", comments=" + comments + ", likes=" + likes + ", tags=" + tags + ", typeMime=" + typeMime
				+ ", folder=" + folder + "]";
	}
	
}
