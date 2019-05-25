package ca.sheridancollege.models;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	SessionFactory sessionFactory;
	Session session;
	public Session getSession(){
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		//SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		session = sessionFactory.openSession();	
		session.beginTransaction();
		return session;
	}
	
	public void commitTransaction(){
		session.getTransaction().commit();
	}
	
	public void closeSession(){
		session.close();
	}
	
	public void closeSessionFactory(){
		sessionFactory.close();
	}

}
