package dms.inconso.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * @author Mr.SAAD
 *
 */
@Entity
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private String password;
	private String poste;
	private String emplacement;
	private String resume;
	private String avatar;
	private String mobile;
	private String skype;
	private Date dateOfCreation;
	private Date dateOfDeleting;
	private String reasonOfDeleting;
	private String status;
	@OneToOne
	@JoinColumn(name = "LIBRARY_ID")
	private Library library;
	@ManyToMany
	@JoinTable(name = "users_groups", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "group_id", referencedColumnName = "id"))
	private Collection<Network> groups;
	@ManyToOne
	@JoinColumn(name = "companyName")
	private Company company;
	@ManyToMany
	@JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
	private Set<Role> roles;
	@ManyToMany(mappedBy = "users")
	private Collection<Site> sites;

	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param username
	 * @param password
	 * @param status
	 */
	public User(String firstName, String lastName, String email, String username, String password, String status) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.status = status;
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the poste
	 */
	public String getPoste() {
		return poste;
	}

	/**
	 * @param poste
	 *            the poste to set
	 */
	public void setPoste(String poste) {
		this.poste = poste;
	}

	/**
	 * @return the emplacement
	 */
	public String getEmplacement() {
		return emplacement;
	}

	/**
	 * @param emplacement
	 *            the emplacement to set
	 */
	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}

	/**
	 * @return the resume
	 */
	public String getResume() {
		return resume;
	}

	/**
	 * @param resume
	 *            the resume to set
	 */
	public void setResume(String resume) {
		this.resume = resume;
	}

	/**
	 * @return the avatar
	 */
	public String getAvatar() {
		return avatar;
	}

	/**
	 * @param avatar
	 *            the avatar to set
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 *            the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the skype
	 */
	public String getSkype() {
		return skype;
	}

	/**
	 * @param skype
	 *            the skype to set
	 */
	public void setSkype(String skype) {
		this.skype = skype;
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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
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
	 * @return the company
	 */
	public Company getCompany() {
		return company;
	}

	/**
	 * @param company
	 *            the company to set
	 */
	public void setCompany(Company company) {
		this.company = company;
	}

	/**
	 * @return the roles
	 */
	public Set<Role> getRoles() {
		return roles;
	}

	/**
	 * @param roles
	 *            the roles to set
	 */
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	/**
	 * @return the sites
	 */
	public Collection<Site> getSites() {
		return sites;
	}

	/**
	 * @param sites
	 *            the sites to set
	 */
	public void setSites(Collection<Site> sites) {
		this.sites = sites;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", username=" + username + ", password=" + password + ", poste=" + poste + ", emplacement="
				+ emplacement + ", resume=" + resume + ", avatar=" + avatar + ", mobile=" + mobile + ", skype=" + skype
				+ ", dateOfCreation=" + dateOfCreation + ", dateOfDeleting=" + dateOfDeleting + ", reasonOfDeleting="
				+ reasonOfDeleting + ", status=" + status + ", library=" + library + ", groups=" + groups + ", company="
				+ company + ", roles=" + roles + ", sites=" + sites + "]";
	}

}