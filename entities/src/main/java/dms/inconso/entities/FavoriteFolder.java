package dms.inconso.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Mr.SAAD
 *
 */
@Entity
@DiscriminatorValue(value = "FAV")
public class FavoriteFolder extends Folder {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public FavoriteFolder() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param title
	 * @param description
	 */
	public FavoriteFolder(String name, String title, String description) {
		super(name, title, description);
		// TODO Auto-generated constructor stub
	}

}
