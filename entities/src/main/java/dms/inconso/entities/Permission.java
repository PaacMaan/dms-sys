package dms.inconso.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * @author Mr.SAAD
 *
 */
@Entity
public class Permission implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

	@ManyToMany(mappedBy = "permissions")
	private Collection<Role> roles;

	@ManyToMany(mappedBy = "permissions")
	private Collection<Visibility> visibilities;

	/**
	 * 
	 */
	public Permission() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public Permission(String name) {
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
	 * @return the roles
	 */
	public Collection<Role> getRoles() {
		return roles;
	}

	/**
	 * @param roles
	 *            the roles to set
	 */
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

	/**
	 * @return the visibilities
	 */
	public Collection<Visibility> getVisibilities() {
		return visibilities;
	}

	/**
	 * @param visibilities
	 *            the visibilities to set
	 */
	public void setVisibilities(Collection<Visibility> visibilities) {
		this.visibilities = visibilities;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Permission [id=" + id + ", name=" + name + ", roles=" + roles + ", visibilities=" + visibilities + "]";
	}

}
