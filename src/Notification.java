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
public class Notification {
	public Notification() {
	}
	
	private int ID;
	
	private ConsultantRH consultantRH;
	
	private String notification;
	
	private Compagniesuurance compagniesuurance;
	
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
	
	public void setNotification(String value) {
		this.notification = value;
	}
	
	public String getNotification() {
		return notification;
	}
	
	public void setConsultantRH(ConsultantRH value) {
		if (this.consultantRH != value) {
			ConsultantRH lconsultantRH = this.consultantRH;
			this.consultantRH = value;
			if (value != null) {
				consultantRH.setNotification(this);
			}
			if (lconsultantRH != null && lconsultantRH.getNotification() == this) {
				lconsultantRH.setNotification(null);
			}
		}
	}
	
	public ConsultantRH getConsultantRH() {
		return consultantRH;
	}
	
	public void setCompagniesuurance(Compagniesuurance value) {
		if (this.compagniesuurance != value) {
			Compagniesuurance lcompagniesuurance = this.compagniesuurance;
			this.compagniesuurance = value;
			if (value != null) {
				compagniesuurance.setNotification(this);
			}
			if (lcompagniesuurance != null && lcompagniesuurance.getNotification() == this) {
				lcompagniesuurance.setNotification(null);
			}
		}
	}
	
	public Compagniesuurance getCompagniesuurance() {
		return compagniesuurance;
	}
	
	public void setEmploye(Employe value) {
		if (this.employe != value) {
			Employe lemploye = this.employe;
			this.employe = value;
			if (value != null) {
				employe.setNotification(this);
			}
			if (lemploye != null && lemploye.getNotification() == this) {
				lemploye.setNotification(null);
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
