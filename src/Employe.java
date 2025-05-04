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
public class Employe {
	public Employe() {
	}
	
	private int ID;
	
	private Notification notification;
	
	private InformationPersonnelle informationPersonnelle;
	
	private String nom;
	
	private String matricule;
	
	private ChangementBeneficiaire changementBeneficiaire;
	
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
	
	public void setMatricule(String value) {
		this.matricule = value;
	}
	
	public String getMatricule() {
		return matricule;
	}
	
	public void setInformationPersonnelle(InformationPersonnelle value) {
		if (this.informationPersonnelle != value) {
			InformationPersonnelle linformationPersonnelle = this.informationPersonnelle;
			this.informationPersonnelle = value;
			if (value != null) {
				informationPersonnelle.setEmploye(this);
			}
			if (linformationPersonnelle != null && linformationPersonnelle.getEmploye() == this) {
				linformationPersonnelle.setEmploye(null);
			}
		}
	}
	
	public InformationPersonnelle getInformationPersonnelle() {
		return informationPersonnelle;
	}
	
	public void setNotification(Notification value) {
		if (this.notification != value) {
			Notification lnotification = this.notification;
			this.notification = value;
			if (value != null) {
				notification.setEmploye(this);
			}
			if (lnotification != null && lnotification.getEmploye() == this) {
				lnotification.setEmploye(null);
			}
		}
	}
	
	public Notification getNotification() {
		return notification;
	}
	
	public void setChangementBeneficiaire(ChangementBeneficiaire value) {
		if (this.changementBeneficiaire != value) {
			ChangementBeneficiaire lchangementBeneficiaire = this.changementBeneficiaire;
			this.changementBeneficiaire = value;
			if (value != null) {
				changementBeneficiaire.setEmploye(this);
			}
			if (lchangementBeneficiaire != null && lchangementBeneficiaire.getEmploye() == this) {
				lchangementBeneficiaire.setEmploye(null);
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
