package dms.inconso.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
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
import javax.persistence.OneToOne;

/**
 * @author Mr.SAAD
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "FAV_SITE", discriminatorType = DiscriminatorType.STRING, length = 4)
public class Site implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String url;
	private String description;
	@ManyToOne
	@JoinColumn(name = "TYPE_ID")
	private SiteType type;
	@ManyToOne
	@JoinColumn(name = "VISIBILITY_ID")
	private Visibility visibility;
	private Date dateOfCreation;
	private Date dateOfDeleting;
	private String reasonOfDeleting;
	@OneToOne
	private Library library;
	@ManyToMany
	@JoinTable(name = "users_sites", joinColumns = @JoinColumn(name = "site_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"))
	private Collection<User> users;
	@ManyToMany
	@JoinTable(name = "groups_sites", joinColumns = @JoinColumn(name = "site_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "group_id", referencedColumnName = "id"))
	private Collection<Network> groups;
	@OneToMany(mappedBy = "site")
	private Collection<SiteMembershipRequests> requests;

	/**
	 * 
	 */
	public Site() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param url
	 * @param description
	 * @param type
	 * @param visibility
	 */
	public Site(String name, String url, String description, SiteType type, Visibility visibility) {
		super();
		this.name = name;
		this.url = url;
		this.description = description;
		this.type = type;
		this.visibility = visibility;
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
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
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
	 * @return the type
	 */
	public SiteType getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(SiteType type) {
		this.type = type;
	}

	/**
	 * @return the visibility
	 */
	public Visibility getVisibility() {
		return visibility;
	}

	/**
	 * @param visibility
	 *            the visibility to set
	 */
	public void setVisibility(Visibility visibility) {
		this.visibility = visibility;
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
	 * @return the dateOfDeleting
	 */
	public Date getDateOfDeleting() {
		return dateOfDeleting;
	}

	/**
	 * @param dateOfDeleting
	 *            the dateOfDeleting to set
	 */
	public void setDateOfDeleting(Date dateOfDeleting) {
		this.dateOfDeleting = dateOfDeleting;
	}

	/**
	 * @return the reasonOfDeleting
	 */
	public String getReasonOfDeleting() {
		return reasonOfDeleting;
	}

	/**
	 * @param reasonOfDeleting
	 *            the reasonOfDeleting to set
	 */
	public void setReasonOfDeleting(String reasonOfDeleting) {
		this.reasonOfDeleting = reasonOfDeleting;
	}

	/**
	 * @return the library
	 */
	public Library getLibrary() {
		return library;
	}

	/**
	 * @param library
	 *            the library to set
	 */
	public void setLibrary(Library library) {
		this.library = library;
	}

	/**
	 * @return the users
	 */
	public Collection<User> getUsers() {
		return users;
	}

	/**
	 * @param users
	 *            the users to set
	 */
	public void setUsers(Collection<User> users) {
		this.users = users;
	}

	/**
	 * @return the groups
	 */
	public Collection<Network> getGroups() {
		return groups;
	}

	/**
	 * @param groups
	 *            the groups to set
	 */
	public void setGroups(Collection<Network> groups) {
		this.groups = groups;
	}

	/**
	 * @return the requests
	 */
	public Collection<SiteMembershipRequests> getRequests() {
		return requests;
	}

	/**
	 * @param requests
	 *            the requests to set
	 */
	public void setRequests(Collection<SiteMembershipRequests> requests) {
		this.requests = requests;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Site [id=" + id + ", name=" + name + ", url=" + url + ", description=" + description + ", type=" + type
				+ ", visibility=" + visibility + ", dateOfCreation=" + dateOfCreation + ", dateOfDeleting="
				+ dateOfDeleting + ", reasonOfDeleting=" + reasonOfDeleting + ", library=" + library + ", users="
				+ users + ", groups=" + groups + ", requests=" + requests + "]";
	}

}
