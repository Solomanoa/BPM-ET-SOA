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
public class Beneficiaire {
	public Beneficiaire() {
	}
	
	private int ID;
	
	private ChangementBeneficiaire changementBeneficiaire;
	
	private String nom;
	
	private String lienParente;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNom(String value) {
		this.nom = value;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setLienParente(String value) {
		this.lienParente = value;
	}
	
	public String getLienParente() {
		return lienParente;
	}
	
	public void setChangementBeneficiaire(ChangementBeneficiaire value) {
		if (this.changementBeneficiaire != value) {
			ChangementBeneficiaire lchangementBeneficiaire = this.changementBeneficiaire;
			this.changementBeneficiaire = value;
			if (value != null) {
				changementBeneficiaire.setBeneficiaire(this);
			}
			if (lchangementBeneficiaire != null && lchangementBeneficiaire.getBeneficiaire() == this) {
				lchangementBeneficiaire.setBeneficiaire(null);
			}
		}
	}
	
	public ChangementBeneficiaire getChangementBeneficiaire() {
		return changementBeneficiaire;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
