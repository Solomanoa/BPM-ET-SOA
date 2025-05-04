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

public class ChangementBeneficiaireCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression consultantRHId;
	public final AssociationExpression consultantRH;
	public final IntegerExpression employeId;
	public final AssociationExpression employe;
	public final StringExpression ancien_beneficiare;
	public final StringExpression nouveau_beneficiaire;
	public final IntegerExpression beneficiaireId;
	public final AssociationExpression beneficiaire;
	
	public ChangementBeneficiaireCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		consultantRHId = new IntegerExpression("consultantRH.ID", this);
		consultantRH = new AssociationExpression("consultantRH", this);
		employeId = new IntegerExpression("employe.ID", this);
		employe = new AssociationExpression("employe", this);
		ancien_beneficiare = new StringExpression("ancien_beneficiare", this);
		nouveau_beneficiaire = new StringExpression("nouveau_beneficiaire", this);
		beneficiaireId = new IntegerExpression("beneficiaire.ID", this);
		beneficiaire = new AssociationExpression("beneficiaire", this);
	}
	
	public ChangementBeneficiaireCriteria(PersistentSession session) {
		this(session.createCriteria(ChangementBeneficiaire.class));
	}
	
	public ChangementBeneficiaireCriteria() throws PersistentException {
		this(ClasseGestionRHPersistentManager.instance().getSession());
	}
	
	public ConsultantRHCriteria createConsultantRHCriteria() {
		return new ConsultantRHCriteria(createCriteria("consultantRH"));
	}
	
	public EmployeCriteria createEmployeCriteria() {
		return new EmployeCriteria(createCriteria("employe"));
	}
	
	public BeneficiaireCriteria createBeneficiaireCriteria() {
		return new BeneficiaireCriteria(createCriteria("beneficiaire"));
	}
	
	public ChangementBeneficiaire uniqueChangementBeneficiaire() {
		return (ChangementBeneficiaire) super.uniqueResult();
	}
	
	public ChangementBeneficiaire[] listChangementBeneficiaire() {
		java.util.List list = super.list();
		return (ChangementBeneficiaire[]) list.toArray(new ChangementBeneficiaire[list.size()]);
	}
}

