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

public class CompagniesuuranceCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression notificationId;
	public final AssociationExpression notification;
	public final StringExpression id_compagnie;
	public final StringExpression nom_compagnie;
	public final StringExpression adresse_compagnie;
	
	public CompagniesuuranceCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		notificationId = new IntegerExpression("notification.ID", this);
		notification = new AssociationExpression("notification", this);
		id_compagnie = new StringExpression("id_compagnie", this);
		nom_compagnie = new StringExpression("nom_compagnie", this);
		adresse_compagnie = new StringExpression("adresse_compagnie", this);
	}
	
	public CompagniesuuranceCriteria(PersistentSession session) {
		this(session.createCriteria(Compagniesuurance.class));
	}
	
	public CompagniesuuranceCriteria() throws PersistentException {
		this(ClasseGestionRHPersistentManager.instance().getSession());
	}
	
	public NotificationCriteria createNotificationCriteria() {
		return new NotificationCriteria(createCriteria("notification"));
	}
	
	public Compagniesuurance uniqueCompagniesuurance() {
		return (Compagniesuurance) super.uniqueResult();
	}
	
	public Compagniesuurance[] listCompagniesuurance() {
		java.util.List list = super.list();
		return (Compagniesuurance[]) list.toArray(new Compagniesuurance[list.size()]);
	}
}

