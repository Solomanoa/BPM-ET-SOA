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

public class ChangementBeneficiaireDAO {
	public static ChangementBeneficiaire loadChangementBeneficiaireByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return loadChangementBeneficiaireByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChangementBeneficiaire getChangementBeneficiaireByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return getChangementBeneficiaireByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChangementBeneficiaire loadChangementBeneficiaireByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return loadChangementBeneficiaireByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChangementBeneficiaire getChangementBeneficiaireByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return getChangementBeneficiaireByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChangementBeneficiaire loadChangementBeneficiaireByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ChangementBeneficiaire) session.load(ChangementBeneficiaire.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChangementBeneficiaire getChangementBeneficiaireByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ChangementBeneficiaire) session.get(ChangementBeneficiaire.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChangementBeneficiaire loadChangementBeneficiaireByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ChangementBeneficiaire) session.load(ChangementBeneficiaire.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChangementBeneficiaire getChangementBeneficiaireByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ChangementBeneficiaire) session.get(ChangementBeneficiaire.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryChangementBeneficiaire(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return queryChangementBeneficiaire(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryChangementBeneficiaire(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return queryChangementBeneficiaire(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChangementBeneficiaire[] listChangementBeneficiaireByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return listChangementBeneficiaireByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChangementBeneficiaire[] listChangementBeneficiaireByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return listChangementBeneficiaireByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryChangementBeneficiaire(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ChangementBeneficiaire as ChangementBeneficiaire");
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
	
	public static List queryChangementBeneficiaire(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ChangementBeneficiaire as ChangementBeneficiaire");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ChangementBeneficiaire", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChangementBeneficiaire[] listChangementBeneficiaireByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryChangementBeneficiaire(session, condition, orderBy);
			return (ChangementBeneficiaire[]) list.toArray(new ChangementBeneficiaire[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChangementBeneficiaire[] listChangementBeneficiaireByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryChangementBeneficiaire(session, condition, orderBy, lockMode);
			return (ChangementBeneficiaire[]) list.toArray(new ChangementBeneficiaire[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChangementBeneficiaire loadChangementBeneficiaireByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return loadChangementBeneficiaireByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChangementBeneficiaire loadChangementBeneficiaireByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return loadChangementBeneficiaireByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChangementBeneficiaire loadChangementBeneficiaireByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ChangementBeneficiaire[] changementBeneficiaires = listChangementBeneficiaireByQuery(session, condition, orderBy);
		if (changementBeneficiaires != null && changementBeneficiaires.length > 0)
			return changementBeneficiaires[0];
		else
			return null;
	}
	
	public static ChangementBeneficiaire loadChangementBeneficiaireByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ChangementBeneficiaire[] changementBeneficiaires = listChangementBeneficiaireByQuery(session, condition, orderBy, lockMode);
		if (changementBeneficiaires != null && changementBeneficiaires.length > 0)
			return changementBeneficiaires[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateChangementBeneficiaireByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return iterateChangementBeneficiaireByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateChangementBeneficiaireByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return iterateChangementBeneficiaireByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateChangementBeneficiaireByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ChangementBeneficiaire as ChangementBeneficiaire");
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
	
	public static java.util.Iterator iterateChangementBeneficiaireByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ChangementBeneficiaire as ChangementBeneficiaire");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ChangementBeneficiaire", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChangementBeneficiaire createChangementBeneficiaire() {
		return new ChangementBeneficiaire();
	}
	
	public static boolean save(ChangementBeneficiaire changementBeneficiaire) throws PersistentException {
		try {
			ClasseGestionRHPersistentManager.instance().saveObject(changementBeneficiaire);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(ChangementBeneficiaire changementBeneficiaire) throws PersistentException {
		try {
			ClasseGestionRHPersistentManager.instance().deleteObject(changementBeneficiaire);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ChangementBeneficiaire changementBeneficiaire)throws PersistentException {
		try {
			if (changementBeneficiaire.getConsultantRH() != null) {
				changementBeneficiaire.getConsultantRH().setChangementBeneficiaire(null);
			}
			
			if (changementBeneficiaire.getEmploye() != null) {
				changementBeneficiaire.getEmploye().setChangementBeneficiaire(null);
			}
			
			if (changementBeneficiaire.getBeneficiaire() != null) {
				changementBeneficiaire.getBeneficiaire().setChangementBeneficiaire(null);
			}
			
			return delete(changementBeneficiaire);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ChangementBeneficiaire changementBeneficiaire, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (changementBeneficiaire.getConsultantRH() != null) {
				changementBeneficiaire.getConsultantRH().setChangementBeneficiaire(null);
			}
			
			if (changementBeneficiaire.getEmploye() != null) {
				changementBeneficiaire.getEmploye().setChangementBeneficiaire(null);
			}
			
			if (changementBeneficiaire.getBeneficiaire() != null) {
				changementBeneficiaire.getBeneficiaire().setChangementBeneficiaire(null);
			}
			
			try {
				session.delete(changementBeneficiaire);
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
	
	public static boolean refresh(ChangementBeneficiaire changementBeneficiaire) throws PersistentException {
		try {
			ClasseGestionRHPersistentManager.instance().getSession().refresh(changementBeneficiaire);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(ChangementBeneficiaire changementBeneficiaire) throws PersistentException {
		try {
			ClasseGestionRHPersistentManager.instance().getSession().evict(changementBeneficiaire);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChangementBeneficiaire loadChangementBeneficiaireByCriteria(ChangementBeneficiaireCriteria changementBeneficiaireCriteria) {
		ChangementBeneficiaire[] changementBeneficiaires = listChangementBeneficiaireByCriteria(changementBeneficiaireCriteria);
		if(changementBeneficiaires == null || changementBeneficiaires.length == 0) {
			return null;
		}
		return changementBeneficiaires[0];
	}
	
	public static ChangementBeneficiaire[] listChangementBeneficiaireByCriteria(ChangementBeneficiaireCriteria changementBeneficiaireCriteria) {
		return changementBeneficiaireCriteria.listChangementBeneficiaire();
	}
}
