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

public class BeneficiaireCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression changementBeneficiaireId;
	public final AssociationExpression changementBeneficiaire;
	public final StringExpression nom;
	public final StringExpression lienParente;
	
	public BeneficiaireCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		changementBeneficiaireId = new IntegerExpression("changementBeneficiaire.ID", this);
		changementBeneficiaire = new AssociationExpression("changementBeneficiaire", this);
		nom = new StringExpression("nom", this);
		lienParente = new StringExpression("lienParente", this);
	}
	
	public BeneficiaireCriteria(PersistentSession session) {
		this(session.createCriteria(Beneficiaire.class));
	}
	
	public BeneficiaireCriteria() throws PersistentException {
		this(ClasseGestionRHPersistentManager.instance().getSession());
	}
	
	public ChangementBeneficiaireCriteria createChangementBeneficiaireCriteria() {
		return new ChangementBeneficiaireCriteria(createCriteria("changementBeneficiaire"));
	}
	
	public Beneficiaire uniqueBeneficiaire() {
		return (Beneficiaire) super.uniqueResult();
	}
	
	public Beneficiaire[] listBeneficiaire() {
		java.util.List list = super.list();
		return (Beneficiaire[]) list.toArray(new Beneficiaire[list.size()]);
	}
}

