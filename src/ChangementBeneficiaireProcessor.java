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
public class ChangementBeneficiaireProcessor {
	private int ID;
	
	private String ancien_beneficiare;
	
	private String nouveau_beneficiaire;
	
	private date date_changement;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setAncien_beneficiare(String value) {
		this.ancien_beneficiare = value;
	}
	
	public String getAncien_beneficiare() {
		return ancien_beneficiare == null ? "" : ancien_beneficiare;
	}
	
	public void setNouveau_beneficiaire(String value) {
		this.nouveau_beneficiaire = value;
	}
	
	public String getNouveau_beneficiaire() {
		return nouveau_beneficiaire == null ? "" : nouveau_beneficiaire;
	}
	
	public void setDate_changement(date value) {
		this.date_changement = value;
	}
	
	public date getDate_changement() {
		return date_changement;
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
	
	private int consultantRH_consultantRHID;
	
	public void setConsultantRH_consultantRHID(int value) {
		this.consultantRH_consultantRHID = value;
	}
	
	public int getConsultantRH_consultantRHID() {
		return consultantRH_consultantRHID;
	}
	
	private int beneficiaire_beneficiaireID;
	
	public void setBeneficiaire_beneficiaireID(int value) {
		this.beneficiaire_beneficiaireID = value;
	}
	
	public int getBeneficiaire_beneficiaireID() {
		return beneficiaire_beneficiaireID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				ChangementBeneficiaire _changementBeneficiaire = ChangementBeneficiaireDAO.loadChangementBeneficiaireByORMID(getID());
				if (_changementBeneficiaire!= null) {
					copyFromBean(_changementBeneficiaire);
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
				ChangementBeneficiaire _changementBeneficiaire = ChangementBeneficiaireDAO.createChangementBeneficiaire();
				copyToBean(_changementBeneficiaire);
				if (ChangementBeneficiaireDAO.save(_changementBeneficiaire)) {
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
				ChangementBeneficiaire _changementBeneficiaire= ChangementBeneficiaireDAO.loadChangementBeneficiaireByORMID(getID());
				if (_changementBeneficiaire != null) {
					copyToBean(_changementBeneficiaire);
					if (ChangementBeneficiaireDAO.save(_changementBeneficiaire)) {
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
				ChangementBeneficiaire _changementBeneficiaire = ChangementBeneficiaireDAO.loadChangementBeneficiaireByORMID(getID());
				if (_changementBeneficiaire != null && ChangementBeneficiaireDAO.deleteAndDissociate(_changementBeneficiaire)) {
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
	
	private void copyFromBean(ChangementBeneficiaire _changementBeneficiaire) {
		setAncien_beneficiare(_changementBeneficiaire.getAncien_beneficiare());
		setNouveau_beneficiaire(_changementBeneficiaire.getNouveau_beneficiaire());
		setDate_changement(_changementBeneficiaire.getDate_changement());
		setID(_changementBeneficiaire.getORMID());
		
		{
			Employe _employe = _changementBeneficiaire.getEmploye();
			if (_employe != null) {
				setEmploye_employeID(_employe.getORMID());
			}
		}
		
		
		{
			ConsultantRH _consultantRH = _changementBeneficiaire.getConsultantRH();
			if (_consultantRH != null) {
				setConsultantRH_consultantRHID(_consultantRH.getORMID());
			}
		}
		
		
		{
			Beneficiaire _beneficiaire = _changementBeneficiaire.getBeneficiaire();
			if (_beneficiaire != null) {
				setBeneficiaire_beneficiaireID(_beneficiaire.getORMID());
			}
		}
		
	}
	
	private void copyToBean(ChangementBeneficiaire _changementBeneficiaire) {
		_changementBeneficiaire.setAncien_beneficiare(getAncien_beneficiare());
		_changementBeneficiaire.setNouveau_beneficiaire(getNouveau_beneficiaire());
		_changementBeneficiaire.setDate_changement(getDate_changement());
		try  {
			Employe _employe = EmployeDAO.loadEmployeByORMID(getEmploye_employeID());
			_changementBeneficiaire.setEmploye(_employe);
		}
		catch (PersistentException e) {
		}
		
		try  {
			ConsultantRH _consultantRH = ConsultantRHDAO.loadConsultantRHByORMID(getConsultantRH_consultantRHID());
			_changementBeneficiaire.setConsultantRH(_consultantRH);
		}
		catch (PersistentException e) {
		}
		
		try  {
			Beneficiaire _beneficiaire = BeneficiaireDAO.loadBeneficiaireByORMID(getBeneficiaire_beneficiaireID());
			_changementBeneficiaire.setBeneficiaire(_beneficiaire);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

