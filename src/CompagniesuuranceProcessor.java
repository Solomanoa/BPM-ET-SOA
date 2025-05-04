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
import org.orm.PersistentException;
public class CompagniesuuranceProcessor {
	private int ID;
	
	private String id_compagnie;
	
	private String nom_compagnie;
	
	private String adresse_compagnie;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setId_compagnie(String value) {
		this.id_compagnie = value;
	}
	
	public String getId_compagnie() {
		return id_compagnie == null ? "" : id_compagnie;
	}
	
	public void setNom_compagnie(String value) {
		this.nom_compagnie = value;
	}
	
	public String getNom_compagnie() {
		return nom_compagnie == null ? "" : nom_compagnie;
	}
	
	public void setAdresse_compagnie(String value) {
		this.adresse_compagnie = value;
	}
	
	public String getAdresse_compagnie() {
		return adresse_compagnie == null ? "" : adresse_compagnie;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int notification_notificationID;
	
	public void setNotification_notificationID(int value) {
		this.notification_notificationID = value;
	}
	
	public int getNotification_notificationID() {
		return notification_notificationID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				Compagniesuurance _compagniesuurance = CompagniesuuranceDAO.loadCompagniesuuranceByORMID(getID());
				if (_compagniesuurance!= null) {
					copyFromBean(_compagniesuurance);
					result = "Search success";
				}
				else {
					result = "Search failed";
				}
			}
			catch (PersistentException e) {
				result = "Search error: " + e.toString();
			}
		}
		else if(action.equals("insert"))  {
			try {
				Compagniesuurance _compagniesuurance = CompagniesuuranceDAO.createCompagniesuurance();
				copyToBean(_compagniesuurance);
				if (CompagniesuuranceDAO.save(_compagniesuurance)) {
					result = "Insert success";
				}
				else {
					result = "Insert failed";
				}
			}
			catch (Exception e) {
				result = "Insert error: " + e.toString();
			}
		}
		else if (action.equals("update")) {
			try {
				Compagniesuurance _compagniesuurance= CompagniesuuranceDAO.loadCompagniesuuranceByORMID(getID());
				if (_compagniesuurance != null) {
					copyToBean(_compagniesuurance);
					if (CompagniesuuranceDAO.save(_compagniesuurance)) {
						result = "Update success";
					}
					 else {
						result = "Update failed";
					}
				}
				 else  {
					result = "Update failed";
				}
				
			}
			catch (PersistentException e) {
				result = "Update error: " + e.toString();
			}
		}
		else if (action.equals("delete")) {
			try {
				Compagniesuurance _compagniesuurance = CompagniesuuranceDAO.loadCompagniesuuranceByORMID(getID());
				if (_compagniesuurance != null && CompagniesuuranceDAO.deleteAndDissociate(_compagniesuurance)) {
					result = "Delete success";
				}
				else {
					result = "Delete failed";
				}
			}
			catch (PersistentException e)  {
				result = "Delete error: " + e.toString();
			}
		}
		else if (action.equals("")) {
			result = "";
		}
		action = "";
		return result;
	}
	
	private void copyFromBean(Compagniesuurance _compagniesuurance) {
		setId_compagnie(_compagniesuurance.getId_compagnie());
		setNom_compagnie(_compagniesuurance.getNom_compagnie());
		setAdresse_compagnie(_compagniesuurance.getAdresse_compagnie());
		setID(_compagniesuurance.getORMID());
		
		{
			Notification _notification = _compagniesuurance.getNotification();
			if (_notification != null) {
				setNotification_notificationID(_notification.getORMID());
			}
		}
		
	}
	
	private void copyToBean(Compagniesuurance _compagniesuurance) {
		_compagniesuurance.setId_compagnie(getId_compagnie());
		_compagniesuurance.setNom_compagnie(getNom_compagnie());
		_compagniesuurance.setAdresse_compagnie(getAdresse_compagnie());
		try  {
			Notification _notification = NotificationDAO.loadNotificationByORMID(getNotification_notificationID());
			_compagniesuurance.setNotification(_notification);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

