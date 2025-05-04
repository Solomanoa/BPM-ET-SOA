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
import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class BeneficiaireDAO {
	public static Beneficiaire loadBeneficiaireByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return loadBeneficiaireByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Beneficiaire getBeneficiaireByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return getBeneficiaireByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Beneficiaire loadBeneficiaireByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return loadBeneficiaireByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Beneficiaire getBeneficiaireByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return getBeneficiaireByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Beneficiaire loadBeneficiaireByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Beneficiaire) session.load(Beneficiaire.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Beneficiaire getBeneficiaireByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Beneficiaire) session.get(Beneficiaire.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Beneficiaire loadBeneficiaireByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Beneficiaire) session.load(Beneficiaire.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Beneficiaire getBeneficiaireByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Beneficiaire) session.get(Beneficiaire.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBeneficiaire(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return queryBeneficiaire(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBeneficiaire(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return queryBeneficiaire(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Beneficiaire[] listBeneficiaireByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return listBeneficiaireByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Beneficiaire[] listBeneficiaireByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return listBeneficiaireByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBeneficiaire(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Beneficiaire as Beneficiaire");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBeneficiaire(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Beneficiaire as Beneficiaire");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Beneficiaire", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Beneficiaire[] listBeneficiaireByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryBeneficiaire(session, condition, orderBy);
			return (Beneficiaire[]) list.toArray(new Beneficiaire[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Beneficiaire[] listBeneficiaireByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryBeneficiaire(session, condition, orderBy, lockMode);
			return (Beneficiaire[]) list.toArray(new Beneficiaire[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Beneficiaire loadBeneficiaireByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return loadBeneficiaireByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Beneficiaire loadBeneficiaireByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return loadBeneficiaireByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Beneficiaire loadBeneficiaireByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Beneficiaire[] beneficiaires = listBeneficiaireByQuery(session, condition, orderBy);
		if (beneficiaires != null && beneficiaires.length > 0)
			return beneficiaires[0];
		else
			return null;
	}
	
	public static Beneficiaire loadBeneficiaireByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Beneficiaire[] beneficiaires = listBeneficiaireByQuery(session, condition, orderBy, lockMode);
		if (beneficiaires != null && beneficiaires.length > 0)
			return beneficiaires[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateBeneficiaireByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return iterateBeneficiaireByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBeneficiaireByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return iterateBeneficiaireByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBeneficiaireByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Beneficiaire as Beneficiaire");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBeneficiaireByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Beneficiaire as Beneficiaire");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Beneficiaire", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Beneficiaire createBeneficiaire() {
		return new Beneficiaire();
	}
	
	public static boolean save(Beneficiaire beneficiaire) throws PersistentException {
		try {
			ClasseGestionRHPersistentManager.instance().saveObject(beneficiaire);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Beneficiaire beneficiaire) throws PersistentException {
		try {
			ClasseGestionRHPersistentManager.instance().deleteObject(beneficiaire);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Beneficiaire beneficiaire)throws PersistentException {
		try {
			if (beneficiaire.getChangementBeneficiaire() != null) {
				beneficiaire.getChangementBeneficiaire().setBeneficiaire(null);
			}
			
			return delete(beneficiaire);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Beneficiaire beneficiaire, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (beneficiaire.getChangementBeneficiaire() != null) {
				beneficiaire.getChangementBeneficiaire().setBeneficiaire(null);
			}
			
			try {
				session.delete(beneficiaire);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Beneficiaire beneficiaire) throws PersistentException {
		try {
			ClasseGestionRHPersistentManager.instance().getSession().refresh(beneficiaire);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Beneficiaire beneficiaire) throws PersistentException {
		try {
			ClasseGestionRHPersistentManager.instance().getSession().evict(beneficiaire);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Beneficiaire loadBeneficiaireByCriteria(BeneficiaireCriteria beneficiaireCriteria) {
		Beneficiaire[] beneficiaires = listBeneficiaireByCriteria(beneficiaireCriteria);
		if(beneficiaires == null || beneficiaires.length == 0) {
			return null;
		}
		return beneficiaires[0];
	}
	
	public static Beneficiaire[] listBeneficiaireByCriteria(BeneficiaireCriteria beneficiaireCriteria) {
		return beneficiaireCriteria.listBeneficiaire();
	}
}
