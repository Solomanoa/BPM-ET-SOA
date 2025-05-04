/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class DeleteClasseGestionRHData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = ClasseGestionRHPersistentManager.instance().getSession().beginTransaction();
		try {
			Employe employe = EmployeDAO.loadEmployeByQuery(null, null);
			// Delete the persistent object
			EmployeDAO.delete(employe);
			InformationPersonnelle informationPersonnelle = InformationPersonnelleDAO.loadInformationPersonnelleByQuery(null, null);
			// Delete the persistent object
			InformationPersonnelleDAO.delete(informationPersonnelle);
			Beneficiaire beneficiaire = BeneficiaireDAO.loadBeneficiaireByQuery(null, null);
			// Delete the persistent object
			BeneficiaireDAO.delete(beneficiaire);
			ChangementBeneficiaire changementBeneficiaire = ChangementBeneficiaireDAO.loadChangementBeneficiaireByQuery(null, null);
			// Delete the persistent object
			ChangementBeneficiaireDAO.delete(changementBeneficiaire);
			ConsultantRH consultantRH = ConsultantRHDAO.loadConsultantRHByQuery(null, null);
			// Delete the persistent object
			ConsultantRHDAO.delete(consultantRH);
			Compagniesuurance compagniesuurance = CompagniesuuranceDAO.loadCompagniesuuranceByQuery(null, null);
			// Delete the persistent object
			CompagniesuuranceDAO.delete(compagniesuurance);
			Notification notification = NotificationDAO.loadNotificationByQuery(null, null);
			// Delete the persistent object
			NotificationDAO.delete(notification);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteClasseGestionRHData deleteClasseGestionRHData = new DeleteClasseGestionRHData();
			try {
				deleteClasseGestionRHData.deleteTestData();
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
