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

public class NotificationDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression consultantRHId;
	public final AssociationExpression consultantRH;
	public final StringExpression notification;
	public final IntegerExpression compagniesuuranceId;
	public final AssociationExpression compagniesuurance;
	public final IntegerExpression employeId;
	public final AssociationExpression employe;
	
	public NotificationDetachedCriteria() {
		super(Notification.class, NotificationCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		consultantRHId = new IntegerExpression("consultantRH.ID", this.getDetachedCriteria());
		consultantRH = new AssociationExpression("consultantRH", this.getDetachedCriteria());
		notification = new StringExpression("notification", this.getDetachedCriteria());
		compagniesuuranceId = new IntegerExpression("compagniesuurance.ID", this.getDetachedCriteria());
		compagniesuurance = new AssociationExpression("compagniesuurance", this.getDetachedCriteria());
		employeId = new IntegerExpression("employe.ID", this.getDetachedCriteria());
		employe = new AssociationExpression("employe", this.getDetachedCriteria());
	}
	
	public NotificationDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, NotificationCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		consultantRHId = new IntegerExpression("consultantRH.ID", this.getDetachedCriteria());
		consultantRH = new AssociationExpression("consultantRH", this.getDetachedCriteria());
		notification = new StringExpression("notification", this.getDetachedCriteria());
		compagniesuuranceId = new IntegerExpression("compagniesuurance.ID", this.getDetachedCriteria());
		compagniesuurance = new AssociationExpression("compagniesuurance", this.getDetachedCriteria());
		employeId = new IntegerExpression("employe.ID", this.getDetachedCriteria());
		employe = new AssociationExpression("employe", this.getDetachedCriteria());
	}
	
	public ConsultantRHDetachedCriteria createConsultantRHCriteria() {
		return new ConsultantRHDetachedCriteria(createCriteria("consultantRH"));
	}
	
	public CompagniesuuranceDetachedCriteria createCompagniesuuranceCriteria() {
		return new CompagniesuuranceDetachedCriteria(createCriteria("compagniesuurance"));
	}
	
	public EmployeDetachedCriteria createEmployeCriteria() {
		return new EmployeDetachedCriteria(createCriteria("employe"));
	}
	
	public Notification uniqueNotification(PersistentSession session) {
		return (Notification) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Notification[] listNotification(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Notification[]) list.toArray(new Notification[list.size()]);
	}
}

