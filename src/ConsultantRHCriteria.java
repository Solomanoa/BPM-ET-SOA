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

public class ConsultantRHCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nom;
	public final IntegerExpression changementBeneficiaireId;
	public final AssociationExpression changementBeneficiaire;
	public final IntegerExpression notificationId;
	public final AssociationExpression notification;
	
	public ConsultantRHCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nom = new StringExpression("nom", this);
		changementBeneficiaireId = new IntegerExpression("changementBeneficiaire.ID", this);
		changementBeneficiaire = new AssociationExpression("changementBeneficiaire", this);
		notificationId = new IntegerExpression("notification.ID", this);
		notification = new AssociationExpression("notification", this);
	}
	
	public ConsultantRHCriteria(PersistentSession session) {
		this(session.createCriteria(ConsultantRH.class));
	}
	
	public ConsultantRHCriteria() throws PersistentException {
		this(ClasseGestionRHPersistentManager.instance().getSession());
	}
	
	public ChangementBeneficiaireCriteria createChangementBeneficiaireCriteria() {
		return new ChangementBeneficiaireCriteria(createCriteria("changementBeneficiaire"));
	}
	
	public NotificationCriteria createNotificationCriteria() {
		return new NotificationCriteria(createCriteria("notification"));
	}
	
	public ConsultantRH uniqueConsultantRH() {
		return (ConsultantRH) super.uniqueResult();
	}
	
	public ConsultantRH[] listConsultantRH() {
		java.util.List list = super.list();
		return (ConsultantRH[]) list.toArray(new ConsultantRH[list.size()]);
	}
}

