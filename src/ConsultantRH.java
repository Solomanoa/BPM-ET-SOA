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
public class ConsultantRH {
	public ConsultantRH() {
	}
	
	private int ID;
	
	private String nom;
	
	private ChangementBeneficiaire changementBeneficiaire;
	
	private Notification notification;
	
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
	
	public void setChangementBeneficiaire(ChangementBeneficiaire value) {
		if (this.changementBeneficiaire != value) {
			ChangementBeneficiaire lchangementBeneficiaire = this.changementBeneficiaire;
			this.changementBeneficiaire = value;
			if (value != null) {
				changementBeneficiaire.setConsultantRH(this);
			}
			if (lchangementBeneficiaire != null && lchangementBeneficiaire.getConsultantRH() == this) {
				lchangementBeneficiaire.setConsultantRH(null);
			}
		}
	}
	
	public ChangementBeneficiaire getChangementBeneficiaire() {
		return changementBeneficiaire;
	}
	
	public void setNotification(Notification value) {
		if (this.notification != value) {
			Notification lnotification = this.notification;
			this.notification = value;
			if (value != null) {
				notification.setConsultantRH(this);
			}
			if (lnotification != null && lnotification.getConsultantRH() == this) {
				lnotification.setConsultantRH(null);
			}
		}
	}
	
	public Notification getNotification() {
		return notification;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
