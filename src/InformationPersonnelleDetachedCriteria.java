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

public class InformationPersonnelleDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression addresse;
	public final StringExpression tel;
	public final StringExpression email;
	public final StringExpression cin;
	public final IntegerExpression employeId;
	public final AssociationExpression employe;
	
	public InformationPersonnelleDetachedCriteria() {
		super(InformationPersonnelle.class, InformationPersonnelleCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		addresse = new StringExpression("addresse", this.getDetachedCriteria());
		tel = new StringExpression("tel", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		cin = new StringExpression("cin", this.getDetachedCriteria());
		employeId = new IntegerExpression("employe.ID", this.getDetachedCriteria());
		employe = new AssociationExpression("employe", this.getDetachedCriteria());
	}
	
	public InformationPersonnelleDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, InformationPersonnelleCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		addresse = new StringExpression("addresse", this.getDetachedCriteria());
		tel = new StringExpression("tel", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		cin = new StringExpression("cin", this.getDetachedCriteria());
		employeId = new IntegerExpression("employe.ID", this.getDetachedCriteria());
		employe = new AssociationExpression("employe", this.getDetachedCriteria());
	}
	
	public EmployeDetachedCriteria createEmployeCriteria() {
		return new EmployeDetachedCriteria(createCriteria("employe"));
	}
	
	public InformationPersonnelle uniqueInformationPersonnelle(PersistentSession session) {
		return (InformationPersonnelle) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public InformationPersonnelle[] listInformationPersonnelle(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (InformationPersonnelle[]) list.toArray(new InformationPersonnelle[list.size()]);
	}
}

