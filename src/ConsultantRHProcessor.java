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
public class ConsultantRHProcessor {
	private int ID;
	
	private String nom;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setNom(String value) {
		this.nom = value;
	}
	
	public String getNom() {
		return nom == null ? "" : nom;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int changementBeneficiaire_changementBeneficiaireID;
	
	public void setChangementBeneficiaire_changementBeneficiaireID(int value) {
		this.changementBeneficiaire_changementBeneficiaireID = value;
	}
	
	public int getChangementBeneficiaire_changementBeneficiaireID() {
		return changementBeneficiaire_changementBeneficiaireID;
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
				ConsultantRH _consultantRH = ConsultantRHDAO.loadConsultantRHByORMID(getID());
				if (_consultantRH!= null) {
					copyFromBean(_consultantRH);
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
				ConsultantRH _consultantRH = ConsultantRHDAO.createConsultantRH();
				copyToBean(_consultantRH);
				if (ConsultantRHDAO.save(_consultantRH)) {
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
				ConsultantRH _consultantRH= ConsultantRHDAO.loadConsultantRHByORMID(getID());
				if (_consultantRH != null) {
					copyToBean(_consultantRH);
					if (ConsultantRHDAO.save(_consultantRH)) {
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
				ConsultantRH _consultantRH = ConsultantRHDAO.loadConsultantRHByORMID(getID());
				if (_consultantRH != null && ConsultantRHDAO.deleteAndDissociate(_consultantRH)) {
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
	
	private void copyFromBean(ConsultantRH _consultantRH) {
		setNom(_consultantRH.getNom());
		setID(_consultantRH.getORMID());
		
		{
			ChangementBeneficiaire _changementBeneficiaire = _consultantRH.getChangementBeneficiaire();
			if (_changementBeneficiaire != null) {
				setChangementBeneficiaire_changementBeneficiaireID(_changementBeneficiaire.getORMID());
			}
		}
		
		
		{
			Notification _notification = _consultantRH.getNotification();
			if (_notification != null) {
				setNotification_notificationID(_notification.getORMID());
			}
		}
		
	}
	
	private void copyToBean(ConsultantRH _consultantRH) {
		_consultantRH.setNom(getNom());
		try  {
			ChangementBeneficiaire _changementBeneficiaire = ChangementBeneficiaireDAO.loadChangementBeneficiaireByORMID(getChangementBeneficiaire_changementBeneficiaireID());
			_consultantRH.setChangementBeneficiaire(_changementBeneficiaire);
		}
		catch (PersistentException e) {
		}
		
		try  {
			Notification _notification = NotificationDAO.loadNotificationByORMID(getNotification_notificationID());
			_consultantRH.setNotification(_notification);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

