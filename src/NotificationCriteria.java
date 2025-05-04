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

public class NotificationCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression consultantRHId;
	public final AssociationExpression consultantRH;
	public final StringExpression notification;
	public final IntegerExpression compagniesuuranceId;
	public final AssociationExpression compagniesuurance;
	public final IntegerExpression employeId;
	public final AssociationExpression employe;
	
	public NotificationCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		consultantRHId = new IntegerExpression("consultantRH.ID", this);
		consultantRH = new AssociationExpression("consultantRH", this);
		notification = new StringExpression("notification", this);
		compagniesuuranceId = new IntegerExpression("compagniesuurance.ID", this);
		compagniesuurance = new AssociationExpression("compagniesuurance", this);
		employeId = new IntegerExpression("employe.ID", this);
		employe = new AssociationExpression("employe", this);
	}
	
	public NotificationCriteria(PersistentSession session) {
		this(session.createCriteria(Notification.class));
	}
	
	public NotificationCriteria() throws PersistentException {
		this(ClasseGestionRHPersistentManager.instance().getSession());
	}
	
	public ConsultantRHCriteria createConsultantRHCriteria() {
		return new ConsultantRHCriteria(createCriteria("consultantRH"));
	}
	
	public CompagniesuuranceCriteria createCompagniesuuranceCriteria() {
		return new CompagniesuuranceCriteria(createCriteria("compagniesuurance"));
	}
	
	public EmployeCriteria createEmployeCriteria() {
		return new EmployeCriteria(createCriteria("employe"));
	}
	
	public Notification uniqueNotification() {
		return (Notification) super.uniqueResult();
	}
	
	public Notification[] listNotification() {
		java.util.List list = super.list();
		return (Notification[]) list.toArray(new Notification[list.size()]);
	}
}

