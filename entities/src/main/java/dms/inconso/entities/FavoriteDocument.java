package dms.inconso.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Mr.SAAD
 *
 */
@Entity
@DiscriminatorValue(value = "FAV")
public class FavoriteDocument extends Document {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public FavoriteDocument() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param title
	 * @param description
	 */
	public FavoriteDocument(String name, String title, String description) {
		super(name, title, description);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FavoriteDocument []";
	}
	

}
