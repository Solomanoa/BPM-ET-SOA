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

public class ChangementBeneficiaireDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression consultantRHId;
	public final AssociationExpression consultantRH;
	public final IntegerExpression employeId;
	public final AssociationExpression employe;
	public final StringExpression ancien_beneficiare;
	public final StringExpression nouveau_beneficiaire;
	public final IntegerExpression beneficiaireId;
	public final AssociationExpression beneficiaire;
	
	public ChangementBeneficiaireDetachedCriteria() {
		super(ChangementBeneficiaire.class, ChangementBeneficiaireCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		consultantRHId = new IntegerExpression("consultantRH.ID", this.getDetachedCriteria());
		consultantRH = new AssociationExpression("consultantRH", this.getDetachedCriteria());
		employeId = new IntegerExpression("employe.ID", this.getDetachedCriteria());
		employe = new AssociationExpression("employe", this.getDetachedCriteria());
		ancien_beneficiare = new StringExpression("ancien_beneficiare", this.getDetachedCriteria());
		nouveau_beneficiaire = new StringExpression("nouveau_beneficiaire", this.getDetachedCriteria());
		beneficiaireId = new IntegerExpression("beneficiaire.ID", this.getDetachedCriteria());
		beneficiaire = new AssociationExpression("beneficiaire", this.getDetachedCriteria());
	}
	
	public ChangementBeneficiaireDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ChangementBeneficiaireCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		consultantRHId = new IntegerExpression("consultantRH.ID", this.getDetachedCriteria());
		consultantRH = new AssociationExpression("consultantRH", this.getDetachedCriteria());
		employeId = new IntegerExpression("employe.ID", this.getDetachedCriteria());
		employe = new AssociationExpression("employe", this.getDetachedCriteria());
		ancien_beneficiare = new StringExpression("ancien_beneficiare", this.getDetachedCriteria());
		nouveau_beneficiaire = new StringExpression("nouveau_beneficiaire", this.getDetachedCriteria());
		beneficiaireId = new IntegerExpression("beneficiaire.ID", this.getDetachedCriteria());
		beneficiaire = new AssociationExpression("beneficiaire", this.getDetachedCriteria());
	}
	
	public ConsultantRHDetachedCriteria createConsultantRHCriteria() {
		return new ConsultantRHDetachedCriteria(createCriteria("consultantRH"));
	}
	
	public EmployeDetachedCriteria createEmployeCriteria() {
		return new EmployeDetachedCriteria(createCriteria("employe"));
	}
	
	public BeneficiaireDetachedCriteria createBeneficiaireCriteria() {
		return new BeneficiaireDetachedCriteria(createCriteria("beneficiaire"));
	}
	
	public ChangementBeneficiaire uniqueChangementBeneficiaire(PersistentSession session) {
		return (ChangementBeneficiaire) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ChangementBeneficiaire[] listChangementBeneficiaire(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ChangementBeneficiaire[]) list.toArray(new ChangementBeneficiaire[list.size()]);
	}
}

