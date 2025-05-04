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

public class InformationPersonnelleCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression addresse;
	public final StringExpression tel;
	public final StringExpression email;
	public final StringExpression cin;
	public final IntegerExpression employeId;
	public final AssociationExpression employe;
	
	public InformationPersonnelleCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		addresse = new StringExpression("addresse", this);
		tel = new StringExpression("tel", this);
		email = new StringExpression("email", this);
		cin = new StringExpression("cin", this);
		employeId = new IntegerExpression("employe.ID", this);
		employe = new AssociationExpression("employe", this);
	}
	
	public InformationPersonnelleCriteria(PersistentSession session) {
		this(session.createCriteria(InformationPersonnelle.class));
	}
	
	public InformationPersonnelleCriteria() throws PersistentException {
		this(ClasseGestionRHPersistentManager.instance().getSession());
	}
	
	public EmployeCriteria createEmployeCriteria() {
		return new EmployeCriteria(createCriteria("employe"));
	}
	
	public InformationPersonnelle uniqueInformationPersonnelle() {
		return (InformationPersonnelle) super.uniqueResult();
	}
	
	public InformationPersonnelle[] listInformationPersonnelle() {
		java.util.List list = super.list();
		return (InformationPersonnelle[]) list.toArray(new InformationPersonnelle[list.size()]);
	}
}

