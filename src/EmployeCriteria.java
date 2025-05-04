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
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EmployeCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression notificationId;
	public final AssociationExpression notification;
	public final IntegerExpression informationPersonnelleId;
	public final AssociationExpression informationPersonnelle;
	public final StringExpression nom;
	public final StringExpression matricule;
	public final IntegerExpression changementBeneficiaireId;
	public final AssociationExpression changementBeneficiaire;
	
	public EmployeCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		notificationId = new IntegerExpression("notification.ID", this);
		notification = new AssociationExpression("notification", this);
		informationPersonnelleId = new IntegerExpression("informationPersonnelle.ID", this);
		informationPersonnelle = new AssociationExpression("informationPersonnelle", this);
		nom = new StringExpression("nom", this);
		matricule = new StringExpression("matricule", this);
		changementBeneficiaireId = new IntegerExpression("changementBeneficiaire.ID", this);
		changementBeneficiaire = new AssociationExpression("changementBeneficiaire", this);
	}
	
	public EmployeCriteria(PersistentSession session) {
		this(session.createCriteria(Employe.class));
	}
	
	public EmployeCriteria() throws PersistentException {
		this(ClasseGestionRHPersistentManager.instance().getSession());
	}
	
	public NotificationCriteria createNotificationCriteria() {
		return new NotificationCriteria(createCriteria("notification"));
	}
	
	public InformationPersonnelleCriteria createInformationPersonnelleCriteria() {
		return new InformationPersonnelleCriteria(createCriteria("informationPersonnelle"));
	}
	
	public ChangementBeneficiaireCriteria createChangementBeneficiaireCriteria() {
		return new ChangementBeneficiaireCriteria(createCriteria("changementBeneficiaire"));
	}
	
	public Employe uniqueEmploye() {
		return (Employe) super.uniqueResult();
	}
	
	public Employe[] listEmploye() {
		java.util.List list = super.list();
		return (Employe[]) list.toArray(new Employe[list.size()]);
	}
}

