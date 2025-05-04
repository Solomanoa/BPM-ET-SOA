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
public class BeneficiaireProcessor {
	private int ID;
	
	private String nom;
	
	private String lienParente;
	
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
	
	public void setLienParente(String value) {
		this.lienParente = value;
	}
	
	public String getLienParente() {
		return lienParente == null ? "" : lienParente;
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
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				Beneficiaire _beneficiaire = BeneficiaireDAO.loadBeneficiaireByORMID(getID());
				if (_beneficiaire!= null) {
					copyFromBean(_beneficiaire);
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
				Beneficiaire _beneficiaire = BeneficiaireDAO.createBeneficiaire();
				copyToBean(_beneficiaire);
				if (BeneficiaireDAO.save(_beneficiaire)) {
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
				Beneficiaire _beneficiaire= BeneficiaireDAO.loadBeneficiaireByORMID(getID());
				if (_beneficiaire != null) {
					copyToBean(_beneficiaire);
					if (BeneficiaireDAO.save(_beneficiaire)) {
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
				Beneficiaire _beneficiaire = BeneficiaireDAO.loadBeneficiaireByORMID(getID());
				if (_beneficiaire != null && BeneficiaireDAO.deleteAndDissociate(_beneficiaire)) {
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
	
	private void copyFromBean(Beneficiaire _beneficiaire) {
		setNom(_beneficiaire.getNom());
		setLienParente(_beneficiaire.getLienParente());
		setID(_beneficiaire.getORMID());
		
		{
			ChangementBeneficiaire _changementBeneficiaire = _beneficiaire.getChangementBeneficiaire();
			if (_changementBeneficiaire != null) {
				setChangementBeneficiaire_changementBeneficiaireID(_changementBeneficiaire.getORMID());
			}
		}
		
	}
	
	private void copyToBean(Beneficiaire _beneficiaire) {
		_beneficiaire.setNom(getNom());
		_beneficiaire.setLienParente(getLienParente());
		try  {
			ChangementBeneficiaire _changementBeneficiaire = ChangementBeneficiaireDAO.loadChangementBeneficiaireByORMID(getChangementBeneficiaire_changementBeneficiaireID());
			_beneficiaire.setChangementBeneficiaire(_changementBeneficiaire);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

