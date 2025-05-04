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

public class EmployeDAO {
	public static Employe loadEmployeByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return loadEmployeByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employe getEmployeByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return getEmployeByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employe loadEmployeByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return loadEmployeByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employe getEmployeByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return getEmployeByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employe loadEmployeByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Employe) session.load(Employe.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employe getEmployeByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Employe) session.get(Employe.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employe loadEmployeByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Employe) session.load(Employe.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employe getEmployeByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Employe) session.get(Employe.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmploye(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return queryEmploye(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmploye(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return queryEmploye(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employe[] listEmployeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return listEmployeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employe[] listEmployeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return listEmployeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmploye(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Employe as Employe");
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
	
	public static List queryEmploye(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Employe as Employe");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Employe", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employe[] listEmployeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEmploye(session, condition, orderBy);
			return (Employe[]) list.toArray(new Employe[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employe[] listEmployeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEmploye(session, condition, orderBy, lockMode);
			return (Employe[]) list.toArray(new Employe[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employe loadEmployeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return loadEmployeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employe loadEmployeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return loadEmployeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employe loadEmployeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Employe[] employes = listEmployeByQuery(session, condition, orderBy);
		if (employes != null && employes.length > 0)
			return employes[0];
		else
			return null;
	}
	
	public static Employe loadEmployeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Employe[] employes = listEmployeByQuery(session, condition, orderBy, lockMode);
		if (employes != null && employes.length > 0)
			return employes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEmployeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return iterateEmployeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEmployeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return iterateEmployeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEmployeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Employe as Employe");
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
	
	public static java.util.Iterator iterateEmployeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Employe as Employe");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Employe", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employe createEmploye() {
		return new Employe();
	}
	
	public static boolean save(Employe employe) throws PersistentException {
		try {
			ClasseGestionRHPersistentManager.instance().saveObject(employe);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Employe employe) throws PersistentException {
		try {
			ClasseGestionRHPersistentManager.instance().deleteObject(employe);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Employe employe)throws PersistentException {
		try {
			if (employe.getNotification() != null) {
				employe.getNotification().setEmploye(null);
			}
			
			if (employe.getInformationPersonnelle() != null) {
				employe.getInformationPersonnelle().setEmploye(null);
			}
			
			if (employe.getChangementBeneficiaire() != null) {
				employe.getChangementBeneficiaire().setEmploye(null);
			}
			
			return delete(employe);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Employe employe, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (employe.getNotification() != null) {
				employe.getNotification().setEmploye(null);
			}
			
			if (employe.getInformationPersonnelle() != null) {
				employe.getInformationPersonnelle().setEmploye(null);
			}
			
			if (employe.getChangementBeneficiaire() != null) {
				employe.getChangementBeneficiaire().setEmploye(null);
			}
			
			try {
				session.delete(employe);
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
	
	public static boolean refresh(Employe employe) throws PersistentException {
		try {
			ClasseGestionRHPersistentManager.instance().getSession().refresh(employe);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Employe employe) throws PersistentException {
		try {
			ClasseGestionRHPersistentManager.instance().getSession().evict(employe);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employe loadEmployeByCriteria(EmployeCriteria employeCriteria) {
		Employe[] employes = listEmployeByCriteria(employeCriteria);
		if(employes == null || employes.length == 0) {
			return null;
		}
		return employes[0];
	}
	
	public static Employe[] listEmployeByCriteria(EmployeCriteria employeCriteria) {
		return employeCriteria.listEmploye();
	}
}
