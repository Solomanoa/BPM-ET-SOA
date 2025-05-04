/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
public class Compagniesuurance {
	public Compagniesuurance() {
	}
	
	private int ID;
	
	private Notification notification;
	
	private String id_compagnie;
	
	private String nom_compagnie;
	
	private String adresse_compagnie;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setId_compagnie(String value) {
		this.id_compagnie = value;
	}
	
	public String getId_compagnie() {
		return id_compagnie;
	}
	
	public void setNom_compagnie(String value) {
		this.nom_compagnie = value;
	}
	
	public String getNom_compagnie() {
		return nom_compagnie;
	}
	
	public void setAdresse_compagnie(String value) {
		this.adresse_compagnie = value;
	}
	
	public String getAdresse_compagnie() {
		return adresse_compagnie;
	}
	
	public void setNotification(Notification value) {
		if (this.notification != value) {
			Notification lnotification = this.notification;
			this.notification = value;
			if (value != null) {
				notification.setCompagniesuurance(this);
			}
			if (lnotification != null && lnotification.getCompagniesuurance() == this) {
				lnotification.setCompagniesuurance(null);
			}
		}
	}
	
	public Notification getNotification() {
		return notification;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
