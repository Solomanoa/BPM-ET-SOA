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
public class InformationPersonnelle {
	public InformationPersonnelle() {
	}
	
	private int ID;
	
	private String addresse;
	
	private String tel;
	
	private String email;
	
	private date dateNais;
	
	private String cin;
	
	private Employe employe;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setAddresse(String value) {
		this.addresse = value;
	}
	
	public String getAddresse() {
		return addresse;
	}
	
	public void setTel(String value) {
		this.tel = value;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
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
		return cin;
	}
	
	public void setEmploye(Employe value) {
		if (this.employe != value) {
			Employe lemploye = this.employe;
			this.employe = value;
			if (value != null) {
				employe.setInformationPersonnelle(this);
			}
			if (lemploye != null && lemploye.getInformationPersonnelle() == this) {
				lemploye.setInformationPersonnelle(null);
			}
		}
	}
	
	public Employe getEmploye() {
		return employe;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
