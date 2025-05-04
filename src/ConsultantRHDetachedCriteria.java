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

public class ConsultantRHDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nom;
	public final IntegerExpression changementBeneficiaireId;
	public final AssociationExpression changementBeneficiaire;
	public final IntegerExpression notificationId;
	public final AssociationExpression notification;
	
	public ConsultantRHDetachedCriteria() {
		super(ConsultantRH.class, ConsultantRHCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nom = new StringExpression("nom", this.getDetachedCriteria());
		changementBeneficiaireId = new IntegerExpression("changementBeneficiaire.ID", this.getDetachedCriteria());
		changementBeneficiaire = new AssociationExpression("changementBeneficiaire", this.getDetachedCriteria());
		notificationId = new IntegerExpression("notification.ID", this.getDetachedCriteria());
		notification = new AssociationExpression("notification", this.getDetachedCriteria());
	}
	
	public ConsultantRHDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ConsultantRHCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nom = new StringExpression("nom", this.getDetachedCriteria());
		changementBeneficiaireId = new IntegerExpression("changementBeneficiaire.ID", this.getDetachedCriteria());
		changementBeneficiaire = new AssociationExpression("changementBeneficiaire", this.getDetachedCriteria());
		notificationId = new IntegerExpression("notification.ID", this.getDetachedCriteria());
		notification = new AssociationExpression("notification", this.getDetachedCriteria());
	}
	
	public ChangementBeneficiaireDetachedCriteria createChangementBeneficiaireCriteria() {
		return new ChangementBeneficiaireDetachedCriteria(createCriteria("changementBeneficiaire"));
	}
	
	public NotificationDetachedCriteria createNotificationCriteria() {
		return new NotificationDetachedCriteria(createCriteria("notification"));
	}
	
	public ConsultantRH uniqueConsultantRH(PersistentSession session) {
		return (ConsultantRH) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ConsultantRH[] listConsultantRH(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ConsultantRH[]) list.toArray(new ConsultantRH[list.size()]);
	}
}

