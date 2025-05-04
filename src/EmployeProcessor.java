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
public class EmployeProcessor {
	private int ID;
	
	private String nom;
	
	private String matricule;
	
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
	
	public void setMatricule(String value) {
		this.matricule = value;
	}
	
	public String getMatricule() {
		return matricule == null ? "" : matricule;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int informationPersonnelle_informationPersonnelleID;
	
	public void setInformationPersonnelle_informationPersonnelleID(int value) {
		this.informationPersonnelle_informationPersonnelleID = value;
	}
	
	public int getInformationPersonnelle_informationPersonnelleID() {
		return informationPersonnelle_informationPersonnelleID;
	}
	
	private int notification_notificationID;
	
	public void setNotification_notificationID(int value) {
		this.notification_notificationID = value;
	}
	
	public int getNotification_notificationID() {
		return notification_notificationID;
	}
	
	private int changementBeneficiaire_changementBeneficiaireID;
	
	public void setChangementBeneficiaire_changementBeneficiaireID(int value) {
		this.changementBeneficiaire_changementBeneficiaireID = value;
	}
	
	public int getChangementBeneficiaire_changementBeneficiaireID() {
		return changementBeneficiaire_changementBeneficiaireID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				Employe _employe = EmployeDAO.loadEmployeByORMID(getID());
				if (_employe!= null) {
					copyFromBean(_employe);
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
				Employe _employe = EmployeDAO.createEmploye();
				copyToBean(_employe);
				if (EmployeDAO.save(_employe)) {
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
				Employe _employe= EmployeDAO.loadEmployeByORMID(getID());
				if (_employe != null) {
					copyToBean(_employe);
					if (EmployeDAO.save(_employe)) {
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
				Employe _employe = EmployeDAO.loadEmployeByORMID(getID());
				if (_employe != null && EmployeDAO.deleteAndDissociate(_employe)) {
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
	
	private void copyFromBean(Employe _employe) {
		setNom(_employe.getNom());
		setMatricule(_employe.getMatricule());
		setID(_employe.getORMID());
		
		{
			InformationPersonnelle _informationPersonnelle = _employe.getInformationPersonnelle();
			if (_informationPersonnelle != null) {
				setInformationPersonnelle_informationPersonnelleID(_informationPersonnelle.getORMID());
			}
		}
		
		
		{
			Notification _notification = _employe.getNotification();
			if (_notification != null) {
				setNotification_notificationID(_notification.getORMID());
			}
		}
		
		
		{
			ChangementBeneficiaire _changementBeneficiaire = _employe.getChangementBeneficiaire();
			if (_changementBeneficiaire != null) {
				setChangementBeneficiaire_changementBeneficiaireID(_changementBeneficiaire.getORMID());
			}
		}
		
	}
	
	private void copyToBean(Employe _employe) {
		_employe.setNom(getNom());
		_employe.setMatricule(getMatricule());
		try  {
			InformationPersonnelle _informationPersonnelle = InformationPersonnelleDAO.loadInformationPersonnelleByORMID(getInformationPersonnelle_informationPersonnelleID());
			_employe.setInformationPersonnelle(_informationPersonnelle);
		}
		catch (PersistentException e) {
		}
		
		try  {
			Notification _notification = NotificationDAO.loadNotificationByORMID(getNotification_notificationID());
			_employe.setNotification(_notification);
		}
		catch (PersistentException e) {
		}
		
		try  {
			ChangementBeneficiaire _changementBeneficiaire = ChangementBeneficiaireDAO.loadChangementBeneficiaireByORMID(getChangementBeneficiaire_changementBeneficiaireID());
			_employe.setChangementBeneficiaire(_changementBeneficiaire);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

