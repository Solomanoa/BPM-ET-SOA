/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class CreateClasseGestionRHDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(ClasseGestionRHPersistentManager.instance());
			ClasseGestionRHPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
