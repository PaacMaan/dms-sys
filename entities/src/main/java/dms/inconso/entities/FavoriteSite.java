package dms.inconso.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Mr.SAAD
 *
 */
@Entity
@DiscriminatorValue(value = "FAV")
public class FavoriteSite extends Site {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public FavoriteSite() {
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
	public FavoriteSite(String name, String url, String description, SiteType type, Visibility visibility) {
		super(name, url, description, type, visibility);
		// TODO Auto-generated constructor stub
	}

}
