package com.rs.db;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 * manager for the table level and steps
 * @author Sapir Markel and Roee Sisso
 *
 */
public class LevelAndStepsManager {
	private SessionFactory factory;

	public LevelAndStepsManager() {
		Configuration configuration = new Configuration();
		configuration.configure();
		factory = configuration.buildSessionFactory();

	}
	/**
	 * add the solution  
	 * @param solution
	 */
	public void addSolution(LevelAndSteps solution) {
		Session session = null;
		Transaction tx = null;
		
		try {
			session = factory.openSession();
			tx = session.beginTransaction();
			//System.out.println(solution.getLevelName() +"this is the level name "+solution.getMoves() );
			session.save(solution);
			tx.commit();			
		}
		catch (HibernateException ex) {
			if (tx != null)
				tx.rollback();
			System.out.println(ex.getMessage());
		}
		finally {
			if (session != null)
				session.close();
		}		
	}
	
	public String getSolution(String name) {
		Session session = null;		
		
		try {
			session = factory.openSession();			
			
			LevelAndSteps sol = session.get(LevelAndSteps.class, name);
			
			if (sol != null) {
				return sol.getSolution();
			}			
		}
		catch (HibernateException ex) {			
			System.out.println(ex.getMessage());
		}
		finally {
			if (session != null)
				session.close();
		}
		return null;
	}

}