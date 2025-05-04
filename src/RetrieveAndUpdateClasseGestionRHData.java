/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class RetrieveAndUpdateClasseGestionRHData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = ClasseGestionRHPersistentManager.instance().getSession().beginTransaction();
		try {
			Employe employe = EmployeDAO.loadEmployeByQuery(null, null);
			// Update the properties of the persistent object
			EmployeDAO.save(employe);
			InformationPersonnelle informationPersonnelle = InformationPersonnelleDAO.loadInformationPersonnelleByQuery(null, null);
			// Update the properties of the persistent object
			InformationPersonnelleDAO.save(informationPersonnelle);
			Beneficiaire beneficiaire = BeneficiaireDAO.loadBeneficiaireByQuery(null, null);
			// Update the properties of the persistent object
			BeneficiaireDAO.save(beneficiaire);
			ChangementBeneficiaire changementBeneficiaire = ChangementBeneficiaireDAO.loadChangementBeneficiaireByQuery(null, null);
			// Update the properties of the persistent object
			ChangementBeneficiaireDAO.save(changementBeneficiaire);
			ConsultantRH consultantRH = ConsultantRHDAO.loadConsultantRHByQuery(null, null);
			// Update the properties of the persistent object
			ConsultantRHDAO.save(consultantRH);
			Compagniesuurance compagniesuurance = CompagniesuuranceDAO.loadCompagniesuuranceByQuery(null, null);
			// Update the properties of the persistent object
			CompagniesuuranceDAO.save(compagniesuurance);
			Notification notification = NotificationDAO.loadNotificationByQuery(null, null);
			// Update the properties of the persistent object
			NotificationDAO.save(notification);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Employe by EmployeCriteria");
		EmployeCriteria employeCriteria = new EmployeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//employeCriteria.ID.eq();
		System.out.println(employeCriteria.uniqueEmploye());
		
		System.out.println("Retrieving InformationPersonnelle by InformationPersonnelleCriteria");
		InformationPersonnelleCriteria informationPersonnelleCriteria = new InformationPersonnelleCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//informationPersonnelleCriteria.ID.eq();
		System.out.println(informationPersonnelleCriteria.uniqueInformationPersonnelle());
		
		System.out.println("Retrieving Beneficiaire by BeneficiaireCriteria");
		BeneficiaireCriteria beneficiaireCriteria = new BeneficiaireCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//beneficiaireCriteria.ID.eq();
		System.out.println(beneficiaireCriteria.uniqueBeneficiaire());
		
		System.out.println("Retrieving ChangementBeneficiaire by ChangementBeneficiaireCriteria");
		ChangementBeneficiaireCriteria changementBeneficiaireCriteria = new ChangementBeneficiaireCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//changementBeneficiaireCriteria.ID.eq();
		System.out.println(changementBeneficiaireCriteria.uniqueChangementBeneficiaire());
		
		System.out.println("Retrieving ConsultantRH by ConsultantRHCriteria");
		ConsultantRHCriteria consultantRHCriteria = new ConsultantRHCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//consultantRHCriteria.ID.eq();
		System.out.println(consultantRHCriteria.uniqueConsultantRH());
		
		System.out.println("Retrieving Compagniesuurance by CompagniesuuranceCriteria");
		CompagniesuuranceCriteria compagniesuuranceCriteria = new CompagniesuuranceCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//compagniesuuranceCriteria.ID.eq();
		System.out.println(compagniesuuranceCriteria.uniqueCompagniesuurance());
		
		System.out.println("Retrieving Notification by NotificationCriteria");
		NotificationCriteria notificationCriteria = new NotificationCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//notificationCriteria.ID.eq();
		System.out.println(notificationCriteria.uniqueNotification());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateClasseGestionRHData retrieveAndUpdateClasseGestionRHData = new RetrieveAndUpdateClasseGestionRHData();
			try {
				retrieveAndUpdateClasseGestionRHData.retrieveAndUpdateTestData();
				//retrieveAndUpdateClasseGestionRHData.retrieveByCriteria();
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
