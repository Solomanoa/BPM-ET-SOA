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
public class InformationPersonnelleProcessor {
	private int ID;
	
	private String addresse;
	
	private String tel;
	
	private String email;
	
	private date dateNais;
	
	private String cin;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setAddresse(String value) {
		this.addresse = value;
	}
	
	public String getAddresse() {
		return addresse == null ? "" : addresse;
	}
	
	public void setTel(String value) {
		this.tel = value;
	}
	
	public String getTel() {
		return tel == null ? "" : tel;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email == null ? "" : email;
	}
	
	public void setDateNais(date value) {
		this.dateNais = value;
	}
	
	public date getDateNais() {
		return dateNais;
	}
	
	public void setCin(String value) {
		this.cin = value;
	}
	
	public String getCin() {
		return cin == null ? "" : cin;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
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
				InformationPersonnelle _informationPersonnelle = InformationPersonnelleDAO.loadInformationPersonnelleByORMID(getID());
				if (_informationPersonnelle!= null) {
					copyFromBean(_informationPersonnelle);
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
				InformationPersonnelle _informationPersonnelle = InformationPersonnelleDAO.createInformationPersonnelle();
				copyToBean(_informationPersonnelle);
				if (InformationPersonnelleDAO.save(_informationPersonnelle)) {
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
				InformationPersonnelle _informationPersonnelle= InformationPersonnelleDAO.loadInformationPersonnelleByORMID(getID());
				if (_informationPersonnelle != null) {
					copyToBean(_informationPersonnelle);
					if (InformationPersonnelleDAO.save(_informationPersonnelle)) {
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
				InformationPersonnelle _informationPersonnelle = InformationPersonnelleDAO.loadInformationPersonnelleByORMID(getID());
				if (_informationPersonnelle != null && InformationPersonnelleDAO.deleteAndDissociate(_informationPersonnelle)) {
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
	
	private void copyFromBean(InformationPersonnelle _informationPersonnelle) {
		setAddresse(_informationPersonnelle.getAddresse());
		setTel(_informationPersonnelle.getTel());
		setEmail(_informationPersonnelle.getEmail());
		setDateNais(_informationPersonnelle.getDateNais());
		setCin(_informationPersonnelle.getCin());
		setID(_informationPersonnelle.getORMID());
		
		{
			Employe _employe = _informationPersonnelle.getEmploye();
			if (_employe != null) {
				setEmploye_employeID(_employe.getORMID());
			}
		}
		
	}
	
	private void copyToBean(InformationPersonnelle _informationPersonnelle) {
		_informationPersonnelle.setAddresse(getAddresse());
		_informationPersonnelle.setTel(getTel());
		_informationPersonnelle.setEmail(getEmail());
		_informationPersonnelle.setDateNais(getDateNais());
		_informationPersonnelle.setCin(getCin());
		try  {
			Employe _employe = EmployeDAO.loadEmployeByORMID(getEmploye_employeID());
			_informationPersonnelle.setEmploye(_employe);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

