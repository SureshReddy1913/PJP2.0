package com.sapient.cal;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class Database_interact {

	Session session;
	Database_interact(){
		Configuration config = new Configuration().configure().addAnnotatedClass(SessionClass.class);
		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties())
				.buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(registry);
		session = sf.openSession();
	}
	void savetoDB(SessionClass sess) {

		session.beginTransaction();
		session.save(sess);
		session.getTransaction().commit();
		
	}
	
	public void retrieveFromDB_sessions(int sessionnum) {
		Query query=session.createQuery("from SessionClass");
		
		ArrayList<SessionClass> s;
		s=new ArrayList<>();
		
		s=(ArrayList<SessionClass>) query.list();
		
		int i=0;
		while(i<s.size()) {
			if(s.get(i).getSession_num()==sessionnum)
			System.out.println(s.get(i).toString());
			i++;
		}
	}
	public int getSessionNum() {
		Query query=session.createQuery("from SessionClass");
		
		ArrayList<SessionClass> s;
		s=new ArrayList<>();
		
		s=(ArrayList<SessionClass>) query.list();
		
		
		return s.get(s.size()-1).getSession_num();
	}
	public void retrieveFromDB_operations(int operation) {
		Query query=session.createQuery("from SessionClass");
		
		ArrayList<SessionClass> s;
		s=new ArrayList<>();
		
		s=(ArrayList<SessionClass>) query.list();
		String option = new Question_class().menu.get(operation);
		System.out.println("opted for->"+option);
		int i=0;
		while(i<s.size()) {
			if(s.get(i).operation.equals(option))
			System.out.println(s.get(i).toString());
			i++;
		}
		
	}
}
