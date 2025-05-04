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

public class CompagniesuuranceDAO {
	public static Compagniesuurance loadCompagniesuuranceByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return loadCompagniesuuranceByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compagniesuurance getCompagniesuuranceByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return getCompagniesuuranceByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compagniesuurance loadCompagniesuuranceByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return loadCompagniesuuranceByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compagniesuurance getCompagniesuuranceByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return getCompagniesuuranceByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compagniesuurance loadCompagniesuuranceByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Compagniesuurance) session.load(Compagniesuurance.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compagniesuurance getCompagniesuuranceByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Compagniesuurance) session.get(Compagniesuurance.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compagniesuurance loadCompagniesuuranceByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Compagniesuurance) session.load(Compagniesuurance.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compagniesuurance getCompagniesuuranceByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Compagniesuurance) session.get(Compagniesuurance.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompagniesuurance(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return queryCompagniesuurance(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompagniesuurance(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return queryCompagniesuurance(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compagniesuurance[] listCompagniesuuranceByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return listCompagniesuuranceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compagniesuurance[] listCompagniesuuranceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return listCompagniesuuranceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompagniesuurance(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Compagniesuurance as Compagniesuurance");
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
	
	public static List queryCompagniesuurance(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Compagniesuurance as Compagniesuurance");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Compagniesuurance", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compagniesuurance[] listCompagniesuuranceByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCompagniesuurance(session, condition, orderBy);
			return (Compagniesuurance[]) list.toArray(new Compagniesuurance[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compagniesuurance[] listCompagniesuuranceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCompagniesuurance(session, condition, orderBy, lockMode);
			return (Compagniesuurance[]) list.toArray(new Compagniesuurance[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compagniesuurance loadCompagniesuuranceByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return loadCompagniesuuranceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compagniesuurance loadCompagniesuuranceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return loadCompagniesuuranceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compagniesuurance loadCompagniesuuranceByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Compagniesuurance[] compagniesuurances = listCompagniesuuranceByQuery(session, condition, orderBy);
		if (compagniesuurances != null && compagniesuurances.length > 0)
			return compagniesuurances[0];
		else
			return null;
	}
	
	public static Compagniesuurance loadCompagniesuuranceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Compagniesuurance[] compagniesuurances = listCompagniesuuranceByQuery(session, condition, orderBy, lockMode);
		if (compagniesuurances != null && compagniesuurances.length > 0)
			return compagniesuurances[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCompagniesuuranceByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return iterateCompagniesuuranceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCompagniesuuranceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return iterateCompagniesuuranceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCompagniesuuranceByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Compagniesuurance as Compagniesuurance");
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
	
	public static java.util.Iterator iterateCompagniesuuranceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Compagniesuurance as Compagniesuurance");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Compagniesuurance", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compagniesuurance createCompagniesuurance() {
		return new Compagniesuurance();
	}
	
	public static boolean save(Compagniesuurance compagniesuurance) throws PersistentException {
		try {
			ClasseGestionRHPersistentManager.instance().saveObject(compagniesuurance);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Compagniesuurance compagniesuurance) throws PersistentException {
		try {
			ClasseGestionRHPersistentManager.instance().deleteObject(compagniesuurance);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Compagniesuurance compagniesuurance)throws PersistentException {
		try {
			if (compagniesuurance.getNotification() != null) {
				compagniesuurance.getNotification().setCompagniesuurance(null);
			}
			
			return delete(compagniesuurance);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Compagniesuurance compagniesuurance, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (compagniesuurance.getNotification() != null) {
				compagniesuurance.getNotification().setCompagniesuurance(null);
			}
			
			try {
				session.delete(compagniesuurance);
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
	
	public static boolean refresh(Compagniesuurance compagniesuurance) throws PersistentException {
		try {
			ClasseGestionRHPersistentManager.instance().getSession().refresh(compagniesuurance);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Compagniesuurance compagniesuurance) throws PersistentException {
		try {
			ClasseGestionRHPersistentManager.instance().getSession().evict(compagniesuurance);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compagniesuurance loadCompagniesuuranceByCriteria(CompagniesuuranceCriteria compagniesuuranceCriteria) {
		Compagniesuurance[] compagniesuurances = listCompagniesuuranceByCriteria(compagniesuuranceCriteria);
		if(compagniesuurances == null || compagniesuurances.length == 0) {
			return null;
		}
		return compagniesuurances[0];
	}
	
	public static Compagniesuurance[] listCompagniesuuranceByCriteria(CompagniesuuranceCriteria compagniesuuranceCriteria) {
		return compagniesuuranceCriteria.listCompagniesuurance();
	}
}
