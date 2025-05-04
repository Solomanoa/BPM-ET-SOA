/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class CreateClasseGestionRHData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = ClasseGestionRHPersistentManager.instance().getSession().beginTransaction();
		try {
			Employe employe = EmployeDAO.createEmploye();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : changementBeneficiaire, informationPersonnelle, notification
			EmployeDAO.save(employe);
			InformationPersonnelle informationPersonnelle = InformationPersonnelleDAO.createInformationPersonnelle();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : employe
			InformationPersonnelleDAO.save(informationPersonnelle);
			Beneficiaire beneficiaire = BeneficiaireDAO.createBeneficiaire();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : changementBeneficiaire
			BeneficiaireDAO.save(beneficiaire);
			ChangementBeneficiaire changementBeneficiaire = ChangementBeneficiaireDAO.createChangementBeneficiaire();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : beneficiaire, employe, consultantRH
			ChangementBeneficiaireDAO.save(changementBeneficiaire);
			ConsultantRH consultantRH = ConsultantRHDAO.createConsultantRH();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : notification, changementBeneficiaire
			ConsultantRHDAO.save(consultantRH);
			Compagniesuurance compagniesuurance = CompagniesuuranceDAO.createCompagniesuurance();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : notification
			CompagniesuuranceDAO.save(compagniesuurance);
			Notification notification = NotificationDAO.createNotification();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : employe, compagniesuurance, consultantRH
			NotificationDAO.save(notification);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateClasseGestionRHData createClasseGestionRHData = new CreateClasseGestionRHData();
			try {
				createClasseGestionRHData.createTestData();
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
