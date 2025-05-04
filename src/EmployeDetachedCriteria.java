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
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EmployeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression notificationId;
	public final AssociationExpression notification;
	public final IntegerExpression informationPersonnelleId;
	public final AssociationExpression informationPersonnelle;
	public final StringExpression nom;
	public final StringExpression matricule;
	public final IntegerExpression changementBeneficiaireId;
	public final AssociationExpression changementBeneficiaire;
	
	public EmployeDetachedCriteria() {
		super(Employe.class, EmployeCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		notificationId = new IntegerExpression("notification.ID", this.getDetachedCriteria());
		notification = new AssociationExpression("notification", this.getDetachedCriteria());
		informationPersonnelleId = new IntegerExpression("informationPersonnelle.ID", this.getDetachedCriteria());
		informationPersonnelle = new AssociationExpression("informationPersonnelle", this.getDetachedCriteria());
		nom = new StringExpression("nom", this.getDetachedCriteria());
		matricule = new StringExpression("matricule", this.getDetachedCriteria());
		changementBeneficiaireId = new IntegerExpression("changementBeneficiaire.ID", this.getDetachedCriteria());
		changementBeneficiaire = new AssociationExpression("changementBeneficiaire", this.getDetachedCriteria());
	}
	
	public EmployeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, EmployeCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		notificationId = new IntegerExpression("notification.ID", this.getDetachedCriteria());
		notification = new AssociationExpression("notification", this.getDetachedCriteria());
		informationPersonnelleId = new IntegerExpression("informationPersonnelle.ID", this.getDetachedCriteria());
		informationPersonnelle = new AssociationExpression("informationPersonnelle", this.getDetachedCriteria());
		nom = new StringExpression("nom", this.getDetachedCriteria());
		matricule = new StringExpression("matricule", this.getDetachedCriteria());
		changementBeneficiaireId = new IntegerExpression("changementBeneficiaire.ID", this.getDetachedCriteria());
		changementBeneficiaire = new AssociationExpression("changementBeneficiaire", this.getDetachedCriteria());
	}
	
	public NotificationDetachedCriteria createNotificationCriteria() {
		return new NotificationDetachedCriteria(createCriteria("notification"));
	}
	
	public InformationPersonnelleDetachedCriteria createInformationPersonnelleCriteria() {
		return new InformationPersonnelleDetachedCriteria(createCriteria("informationPersonnelle"));
	}
	
	public ChangementBeneficiaireDetachedCriteria createChangementBeneficiaireCriteria() {
		return new ChangementBeneficiaireDetachedCriteria(createCriteria("changementBeneficiaire"));
	}
	
	public Employe uniqueEmploye(PersistentSession session) {
		return (Employe) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Employe[] listEmploye(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Employe[]) list.toArray(new Employe[list.size()]);
	}
}

