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
public class NotificationProcessor {
	private int ID;
	
	private String notification;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setNotification(String value) {
		this.notification = value;
	}
	
	public String getNotification() {
		return notification == null ? "" : notification;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int consultantRH_consultantRHID;
	
	public void setConsultantRH_consultantRHID(int value) {
		this.consultantRH_consultantRHID = value;
	}
	
	public int getConsultantRH_consultantRHID() {
		return consultantRH_consultantRHID;
	}
	
	private int compagniesuurance_compagniesuuranceID;
	
	public void setCompagniesuurance_compagniesuuranceID(int value) {
		this.compagniesuurance_compagniesuuranceID = value;
	}
	
	public int getCompagniesuurance_compagniesuuranceID() {
		return compagniesuurance_compagniesuuranceID;
	}
	
	private int employe_employeID;
	
	public void setEmploye_employeID(int value) {
		this.employe_employeID = value;
	}
	
	public int getEmploye_employeID() {
		return employe_employeID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				Notification _notification = NotificationDAO.loadNotificationByORMID(getID());
				if (_notification!= null) {
					copyFromBean(_notification);
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
				Notification _notification = NotificationDAO.createNotification();
				copyToBean(_notification);
				if (NotificationDAO.save(_notification)) {
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
				Notification _notification= NotificationDAO.loadNotificationByORMID(getID());
				if (_notification != null) {
					copyToBean(_notification);
					if (NotificationDAO.save(_notification)) {
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
				Notification _notification = NotificationDAO.loadNotificationByORMID(getID());
				if (_notification != null && NotificationDAO.deleteAndDissociate(_notification)) {
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
	
	private void copyFromBean(Notification _notification) {
		setNotification(_notification.getNotification());
		setID(_notification.getORMID());
		
		{
			ConsultantRH _consultantRH = _notification.getConsultantRH();
			if (_consultantRH != null) {
				setConsultantRH_consultantRHID(_consultantRH.getORMID());
			}
		}
		
		
		{
			Compagniesuurance _compagniesuurance = _notification.getCompagniesuurance();
			if (_compagniesuurance != null) {
				setCompagniesuurance_compagniesuuranceID(_compagniesuurance.getORMID());
			}
		}
		
		
		{
			Employe _employe = _notification.getEmploye();
			if (_employe != null) {
				setEmploye_employeID(_employe.getORMID());
			}
		}
		
	}
	
	private void copyToBean(Notification _notification) {
		_notification.setNotification(getNotification());
		try  {
			ConsultantRH _consultantRH = ConsultantRHDAO.loadConsultantRHByORMID(getConsultantRH_consultantRHID());
			_notification.setConsultantRH(_consultantRH);
		}
		catch (PersistentException e) {
		}
		
		try  {
			Compagniesuurance _compagniesuurance = CompagniesuuranceDAO.loadCompagniesuuranceByORMID(getCompagniesuurance_compagniesuuranceID());
			_notification.setCompagniesuurance(_compagniesuurance);
		}
		catch (PersistentException e) {
		}
		
		try  {
			Employe _employe = EmployeDAO.loadEmployeByORMID(getEmploye_employeID());
			_notification.setEmploye(_employe);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

