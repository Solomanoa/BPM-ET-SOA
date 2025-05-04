/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class ListClasseGestionRHData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Employe...");
		Employe[] employes = EmployeDAO.listEmployeByQuery(null, null);
		int length = Math.min(employes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(employes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing InformationPersonnelle...");
		InformationPersonnelle[] informationPersonnelles = InformationPersonnelleDAO.listInformationPersonnelleByQuery(null, null);
		length = Math.min(informationPersonnelles.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(informationPersonnelles[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Beneficiaire...");
		Beneficiaire[] beneficiaires = BeneficiaireDAO.listBeneficiaireByQuery(null, null);
		length = Math.min(beneficiaires.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(beneficiaires[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ChangementBeneficiaire...");
		ChangementBeneficiaire[] changementBeneficiaires = ChangementBeneficiaireDAO.listChangementBeneficiaireByQuery(null, null);
		length = Math.min(changementBeneficiaires.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(changementBeneficiaires[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ConsultantRH...");
		ConsultantRH[] consultantRHs = ConsultantRHDAO.listConsultantRHByQuery(null, null);
		length = Math.min(consultantRHs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(consultantRHs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Compagniesuurance...");
		Compagniesuurance[] compagniesuurances = CompagniesuuranceDAO.listCompagniesuuranceByQuery(null, null);
		length = Math.min(compagniesuurances.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(compagniesuurances[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Notification...");
		Notification[] notifications = NotificationDAO.listNotificationByQuery(null, null);
		length = Math.min(notifications.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(notifications[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Employe by Criteria...");
		EmployeCriteria employeCriteria = new EmployeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//employeCriteria.ID.eq();
		employeCriteria.setMaxResults(ROW_COUNT);
		Employe[] employes = employeCriteria.listEmploye();
		int length =employes== null ? 0 : Math.min(employes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(employes[i]);
		}
		System.out.println(length + " Employe record(s) retrieved."); 
		
		System.out.println("Listing InformationPersonnelle by Criteria...");
		InformationPersonnelleCriteria informationPersonnelleCriteria = new InformationPersonnelleCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//informationPersonnelleCriteria.ID.eq();
		informationPersonnelleCriteria.setMaxResults(ROW_COUNT);
		InformationPersonnelle[] informationPersonnelles = informationPersonnelleCriteria.listInformationPersonnelle();
		length =informationPersonnelles== null ? 0 : Math.min(informationPersonnelles.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(informationPersonnelles[i]);
		}
		System.out.println(length + " InformationPersonnelle record(s) retrieved."); 
		
		System.out.println("Listing Beneficiaire by Criteria...");
		BeneficiaireCriteria beneficiaireCriteria = new BeneficiaireCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//beneficiaireCriteria.ID.eq();
		beneficiaireCriteria.setMaxResults(ROW_COUNT);
		Beneficiaire[] beneficiaires = beneficiaireCriteria.listBeneficiaire();
		length =beneficiaires== null ? 0 : Math.min(beneficiaires.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(beneficiaires[i]);
		}
		System.out.println(length + " Beneficiaire record(s) retrieved."); 
		
		System.out.println("Listing ChangementBeneficiaire by Criteria...");
		ChangementBeneficiaireCriteria changementBeneficiaireCriteria = new ChangementBeneficiaireCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//changementBeneficiaireCriteria.ID.eq();
		changementBeneficiaireCriteria.setMaxResults(ROW_COUNT);
		ChangementBeneficiaire[] changementBeneficiaires = changementBeneficiaireCriteria.listChangementBeneficiaire();
		length =changementBeneficiaires== null ? 0 : Math.min(changementBeneficiaires.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(changementBeneficiaires[i]);
		}
		System.out.println(length + " ChangementBeneficiaire record(s) retrieved."); 
		
		System.out.println("Listing ConsultantRH by Criteria...");
		ConsultantRHCriteria consultantRHCriteria = new ConsultantRHCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//consultantRHCriteria.ID.eq();
		consultantRHCriteria.setMaxResults(ROW_COUNT);
		ConsultantRH[] consultantRHs = consultantRHCriteria.listConsultantRH();
		length =consultantRHs== null ? 0 : Math.min(consultantRHs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(consultantRHs[i]);
		}
		System.out.println(length + " ConsultantRH record(s) retrieved."); 
		
		System.out.println("Listing Compagniesuurance by Criteria...");
		CompagniesuuranceCriteria compagniesuuranceCriteria = new CompagniesuuranceCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//compagniesuuranceCriteria.ID.eq();
		compagniesuuranceCriteria.setMaxResults(ROW_COUNT);
		Compagniesuurance[] compagniesuurances = compagniesuuranceCriteria.listCompagniesuurance();
		length =compagniesuurances== null ? 0 : Math.min(compagniesuurances.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(compagniesuurances[i]);
		}
		System.out.println(length + " Compagniesuurance record(s) retrieved."); 
		
		System.out.println("Listing Notification by Criteria...");
		NotificationCriteria notificationCriteria = new NotificationCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//notificationCriteria.ID.eq();
		notificationCriteria.setMaxResults(ROW_COUNT);
		Notification[] notifications = notificationCriteria.listNotification();
		length =notifications== null ? 0 : Math.min(notifications.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(notifications[i]);
		}
		System.out.println(length + " Notification record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListClasseGestionRHData listClasseGestionRHData = new ListClasseGestionRHData();
			try {
				listClasseGestionRHData.listTestData();
				//listClasseGestionRHData.listByCriteria();
			}
			finally {
				ClasseGestionRHPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
