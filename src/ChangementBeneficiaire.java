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
public class ChangementBeneficiaire {
	public ChangementBeneficiaire() {
	}
	
	private int ID;
	
	private ConsultantRH consultantRH;
	
	private Employe employe;
	
	private String ancien_beneficiare;
	
	private String nouveau_beneficiaire;
	
	private date date_changement;
	
	private Beneficiaire beneficiaire;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setAncien_beneficiare(String value) {
		this.ancien_beneficiare = value;
	}
	
	public String getAncien_beneficiare() {
		return ancien_beneficiare;
	}
	
	public void setNouveau_beneficiaire(String value) {
		this.nouveau_beneficiaire = value;
	}
	
	public String getNouveau_beneficiaire() {
		return nouveau_beneficiaire;
	}
	
	public void setDate_changement(date value) {
		this.date_changement = value;
	}
	
	public date getDate_changement() {
		return date_changement;
	}
	
	public void setEmploye(Employe value) {
		if (this.employe != value) {
			Employe lemploye = this.employe;
			this.employe = value;
			if (value != null) {
				employe.setChangementBeneficiaire(this);
			}
			if (lemploye != null && lemploye.getChangementBeneficiaire() == this) {
				lemploye.setChangementBeneficiaire(null);
			}
		}
	}
	
	public Employe getEmploye() {
		return employe;
	}
	
	public void setConsultantRH(ConsultantRH value) {
		if (this.consultantRH != value) {
			ConsultantRH lconsultantRH = this.consultantRH;
			this.consultantRH = value;
			if (value != null) {
				consultantRH.setChangementBeneficiaire(this);
			}
			if (lconsultantRH != null && lconsultantRH.getChangementBeneficiaire() == this) {
				lconsultantRH.setChangementBeneficiaire(null);
			}
		}
	}
	
	public ConsultantRH getConsultantRH() {
		return consultantRH;
	}
	
	public void setBeneficiaire(Beneficiaire value) {
		if (this.beneficiaire != value) {
			Beneficiaire lbeneficiaire = this.beneficiaire;
			this.beneficiaire = value;
			if (value != null) {
				beneficiaire.setChangementBeneficiaire(this);
			}
			if (lbeneficiaire != null && lbeneficiaire.getChangementBeneficiaire() == this) {
				lbeneficiaire.setChangementBeneficiaire(null);
			}
		}
	}
	
	public Beneficiaire getBeneficiaire() {
		return beneficiaire;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
