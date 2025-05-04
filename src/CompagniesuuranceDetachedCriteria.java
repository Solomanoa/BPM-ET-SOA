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

public class CompagniesuuranceDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression notificationId;
	public final AssociationExpression notification;
	public final StringExpression id_compagnie;
	public final StringExpression nom_compagnie;
	public final StringExpression adresse_compagnie;
	
	public CompagniesuuranceDetachedCriteria() {
		super(Compagniesuurance.class, CompagniesuuranceCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		notificationId = new IntegerExpression("notification.ID", this.getDetachedCriteria());
		notification = new AssociationExpression("notification", this.getDetachedCriteria());
		id_compagnie = new StringExpression("id_compagnie", this.getDetachedCriteria());
		nom_compagnie = new StringExpression("nom_compagnie", this.getDetachedCriteria());
		adresse_compagnie = new StringExpression("adresse_compagnie", this.getDetachedCriteria());
	}
	
	public CompagniesuuranceDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, CompagniesuuranceCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		notificationId = new IntegerExpression("notification.ID", this.getDetachedCriteria());
		notification = new AssociationExpression("notification", this.getDetachedCriteria());
		id_compagnie = new StringExpression("id_compagnie", this.getDetachedCriteria());
		nom_compagnie = new StringExpression("nom_compagnie", this.getDetachedCriteria());
		adresse_compagnie = new StringExpression("adresse_compagnie", this.getDetachedCriteria());
	}
	
	public NotificationDetachedCriteria createNotificationCriteria() {
		return new NotificationDetachedCriteria(createCriteria("notification"));
	}
	
	public Compagniesuurance uniqueCompagniesuurance(PersistentSession session) {
		return (Compagniesuurance) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Compagniesuurance[] listCompagniesuurance(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Compagniesuurance[]) list.toArray(new Compagniesuurance[list.size()]);
	}
}

