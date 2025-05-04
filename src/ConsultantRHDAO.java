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

public class ConsultantRHDAO {
	public static ConsultantRH loadConsultantRHByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return loadConsultantRHByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ConsultantRH getConsultantRHByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return getConsultantRHByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ConsultantRH loadConsultantRHByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return loadConsultantRHByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ConsultantRH getConsultantRHByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return getConsultantRHByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ConsultantRH loadConsultantRHByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ConsultantRH) session.load(ConsultantRH.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ConsultantRH getConsultantRHByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ConsultantRH) session.get(ConsultantRH.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ConsultantRH loadConsultantRHByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ConsultantRH) session.load(ConsultantRH.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ConsultantRH getConsultantRHByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ConsultantRH) session.get(ConsultantRH.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryConsultantRH(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return queryConsultantRH(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryConsultantRH(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return queryConsultantRH(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ConsultantRH[] listConsultantRHByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return listConsultantRHByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ConsultantRH[] listConsultantRHByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return listConsultantRHByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryConsultantRH(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ConsultantRH as ConsultantRH");
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
	
	public static List queryConsultantRH(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ConsultantRH as ConsultantRH");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ConsultantRH", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ConsultantRH[] listConsultantRHByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryConsultantRH(session, condition, orderBy);
			return (ConsultantRH[]) list.toArray(new ConsultantRH[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ConsultantRH[] listConsultantRHByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryConsultantRH(session, condition, orderBy, lockMode);
			return (ConsultantRH[]) list.toArray(new ConsultantRH[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ConsultantRH loadConsultantRHByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return loadConsultantRHByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ConsultantRH loadConsultantRHByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return loadConsultantRHByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ConsultantRH loadConsultantRHByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ConsultantRH[] consultantRHs = listConsultantRHByQuery(session, condition, orderBy);
		if (consultantRHs != null && consultantRHs.length > 0)
			return consultantRHs[0];
		else
			return null;
	}
	
	public static ConsultantRH loadConsultantRHByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ConsultantRH[] consultantRHs = listConsultantRHByQuery(session, condition, orderBy, lockMode);
		if (consultantRHs != null && consultantRHs.length > 0)
			return consultantRHs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateConsultantRHByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return iterateConsultantRHByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateConsultantRHByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ClasseGestionRHPersistentManager.instance().getSession();
			return iterateConsultantRHByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateConsultantRHByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ConsultantRH as ConsultantRH");
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
	
	public static java.util.Iterator iterateConsultantRHByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ConsultantRH as ConsultantRH");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ConsultantRH", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ConsultantRH createConsultantRH() {
		return new ConsultantRH();
	}
	
	public static boolean save(ConsultantRH consultantRH) throws PersistentException {
		try {
			ClasseGestionRHPersistentManager.instance().saveObject(consultantRH);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(ConsultantRH consultantRH) throws PersistentException {
		try {
			ClasseGestionRHPersistentManager.instance().deleteObject(consultantRH);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ConsultantRH consultantRH)throws PersistentException {
		try {
			if (consultantRH.getChangementBeneficiaire() != null) {
				consultantRH.getChangementBeneficiaire().setConsultantRH(null);
			}
			
			if (consultantRH.getNotification() != null) {
				consultantRH.getNotification().setConsultantRH(null);
			}
			
			return delete(consultantRH);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ConsultantRH consultantRH, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (consultantRH.getChangementBeneficiaire() != null) {
				consultantRH.getChangementBeneficiaire().setConsultantRH(null);
			}
			
			if (consultantRH.getNotification() != null) {
				consultantRH.getNotification().setConsultantRH(null);
			}
			
			try {
				session.delete(consultantRH);
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
	
	public static boolean refresh(ConsultantRH consultantRH) throws PersistentException {
		try {
			ClasseGestionRHPersistentManager.instance().getSession().refresh(consultantRH);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(ConsultantRH consultantRH) throws PersistentException {
		try {
			ClasseGestionRHPersistentManager.instance().getSession().evict(consultantRH);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ConsultantRH loadConsultantRHByCriteria(ConsultantRHCriteria consultantRHCriteria) {
		ConsultantRH[] consultantRHs = listConsultantRHByCriteria(consultantRHCriteria);
		if(consultantRHs == null || consultantRHs.length == 0) {
			return null;
		}
		return consultantRHs[0];
	}
	
	public static ConsultantRH[] listConsultantRHByCriteria(ConsultantRHCriteria consultantRHCriteria) {
		return consultantRHCriteria.listConsultantRH();
	}
}
