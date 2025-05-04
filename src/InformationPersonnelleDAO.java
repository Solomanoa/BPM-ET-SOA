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

public class InformationPersonnelleDAO {
	public static InformationPersonnelle loadInformationPersonnelleByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return loadInformationPersonnelleByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationPersonnelle getInformationPersonnelleByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return getInformationPersonnelleByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationPersonnelle loadInformationPersonnelleByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return loadInformationPersonnelleByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationPersonnelle getInformationPersonnelleByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return getInformationPersonnelleByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationPersonnelle loadInformationPersonnelleByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (InformationPersonnelle) session.load(InformationPersonnelle.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationPersonnelle getInformationPersonnelleByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (InformationPersonnelle) session.get(InformationPersonnelle.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationPersonnelle loadInformationPersonnelleByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (InformationPersonnelle) session.load(InformationPersonnelle.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationPersonnelle getInformationPersonnelleByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (InformationPersonnelle) session.get(InformationPersonnelle.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryInformationPersonnelle(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return queryInformationPersonnelle(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryInformationPersonnelle(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return queryInformationPersonnelle(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationPersonnelle[] listInformationPersonnelleByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return listInformationPersonnelleByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationPersonnelle[] listInformationPersonnelleByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return listInformationPersonnelleByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryInformationPersonnelle(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From InformationPersonnelle as InformationPersonnelle");
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
	
	public static List queryInformationPersonnelle(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From InformationPersonnelle as InformationPersonnelle");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("InformationPersonnelle", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationPersonnelle[] listInformationPersonnelleByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryInformationPersonnelle(session, condition, orderBy);
			return (InformationPersonnelle[]) list.toArray(new InformationPersonnelle[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationPersonnelle[] listInformationPersonnelleByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryInformationPersonnelle(session, condition, orderBy, lockMode);
			return (InformationPersonnelle[]) list.toArray(new InformationPersonnelle[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationPersonnelle loadInformationPersonnelleByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return loadInformationPersonnelleByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationPersonnelle loadInformationPersonnelleByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return loadInformationPersonnelleByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationPersonnelle loadInformationPersonnelleByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		InformationPersonnelle[] informationPersonnelles = listInformationPersonnelleByQuery(session, condition, orderBy);
		if (informationPersonnelles != null && informationPersonnelles.length > 0)
			return informationPersonnelles[0];
		else
			return null;
	}
	
	public static InformationPersonnelle loadInformationPersonnelleByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		InformationPersonnelle[] informationPersonnelles = listInformationPersonnelleByQuery(session, condition, orderBy, lockMode);
		if (informationPersonnelles != null && informationPersonnelles.length > 0)
			return informationPersonnelles[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateInformationPersonnelleByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return iterateInformationPersonnelleByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateInformationPersonnelleByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return iterateInformationPersonnelleByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateInformationPersonnelleByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From InformationPersonnelle as InformationPersonnelle");
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
	
	public static java.util.Iterator iterateInformationPersonnelleByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From InformationPersonnelle as InformationPersonnelle");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("InformationPersonnelle", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationPersonnelle createInformationPersonnelle() {
		return new InformationPersonnelle();
	}
	
	public static boolean save(InformationPersonnelle informationPersonnelle) throws PersistentException {
		try {
			ClasseGestionRHPersistentManager.instance().saveObject(informationPersonnelle);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(InformationPersonnelle informationPersonnelle) throws PersistentException {
		try {
			ClasseGestionRHPersistentManager.instance().deleteObject(informationPersonnelle);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(InformationPersonnelle informationPersonnelle)throws PersistentException {
		try {
			if (informationPersonnelle.getEmploye() != null) {
				informationPersonnelle.getEmploye().setInformationPersonnelle(null);
			}
			
			return delete(informationPersonnelle);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(InformationPersonnelle informationPersonnelle, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (informationPersonnelle.getEmploye() != null) {
				informationPersonnelle.getEmploye().setInformationPersonnelle(null);
			}
			
			try {
				session.delete(informationPersonnelle);
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
	
	public static boolean refresh(InformationPersonnelle informationPersonnelle) throws PersistentException {
		try {
			ClasseGestionRHPersistentManager.instance().getSession().refresh(informationPersonnelle);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(InformationPersonnelle informationPersonnelle) throws PersistentException {
		try {
			ClasseGestionRHPersistentManager.instance().getSession().evict(informationPersonnelle);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static InformationPersonnelle loadInformationPersonnelleByCriteria(InformationPersonnelleCriteria informationPersonnelleCriteria) {
		InformationPersonnelle[] informationPersonnelles = listInformationPersonnelleByCriteria(informationPersonnelleCriteria);
		if(informationPersonnelles == null || informationPersonnelles.length == 0) {
			return null;
		}
		return informationPersonnelles[0];
	}
	
	public static InformationPersonnelle[] listInformationPersonnelleByCriteria(InformationPersonnelleCriteria informationPersonnelleCriteria) {
		return informationPersonnelleCriteria.listInformationPersonnelle();
	}
}
