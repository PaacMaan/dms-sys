package dms.inconso.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author Mr.SAAD
 *
 */
@Entity
public class Company implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String name;
	private String address;
	private String postalCode;
	private String phone;
	private String fax;
	private String email;
	@OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
	private Collection<User> users;

	/**
	 * 
	 */
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param address
	 * @param postalCode
	 * @param phone
	 * @param fax
	 * @param email
	 */
	public Company(String name, String address, String postalCode, String phone, String fax, String email) {
		super();
		this.name = name;
		this.address = address;
		this.postalCode = postalCode;
		this.phone = phone;
		this.fax = fax;
		this.email = email;
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode
	 *            the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the fax
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * @param fax
	 *            the fax to set
	 */
	public void setFax(String fax) {
		this.fax = fax;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Company [name=" + name + ", address=" + address + ", postalCode=" + postalCode + ", phone=" + phone
				+ ", fax=" + fax + ", email=" + email + ", users=" + users + "]";
	}

	

}
