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

public class BeneficiaireDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression changementBeneficiaireId;
	public final AssociationExpression changementBeneficiaire;
	public final StringExpression nom;
	public final StringExpression lienParente;
	
	public BeneficiaireDetachedCriteria() {
		super(Beneficiaire.class, BeneficiaireCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		changementBeneficiaireId = new IntegerExpression("changementBeneficiaire.ID", this.getDetachedCriteria());
		changementBeneficiaire = new AssociationExpression("changementBeneficiaire", this.getDetachedCriteria());
		nom = new StringExpression("nom", this.getDetachedCriteria());
		lienParente = new StringExpression("lienParente", this.getDetachedCriteria());
	}
	
	public BeneficiaireDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, BeneficiaireCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		changementBeneficiaireId = new IntegerExpression("changementBeneficiaire.ID", this.getDetachedCriteria());
		changementBeneficiaire = new AssociationExpression("changementBeneficiaire", this.getDetachedCriteria());
		nom = new StringExpression("nom", this.getDetachedCriteria());
		lienParente = new StringExpression("lienParente", this.getDetachedCriteria());
	}
	
	public ChangementBeneficiaireDetachedCriteria createChangementBeneficiaireCriteria() {
		return new ChangementBeneficiaireDetachedCriteria(createCriteria("changementBeneficiaire"));
	}
	
	public Beneficiaire uniqueBeneficiaire(PersistentSession session) {
		return (Beneficiaire) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Beneficiaire[] listBeneficiaire(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Beneficiaire[]) list.toArray(new Beneficiaire[list.size()]);
	}
}

