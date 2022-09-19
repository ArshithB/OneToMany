package com.one.many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Map {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
	    cfg.configure("config.xml");
	    SessionFactory factory = cfg.buildSessionFactory();
	    
	    AccountM am = new AccountM();
	    am.setAcId(3);
	    am.setAcName("SBI BAank");
	    
	    UserM um = new UserM();
	    um.setUsId(33);
	    um.setUsName("Suriya");
	    um.setQuestion(am);
	    
	    UserM uum = new UserM();
	    uum.setUsId(333);
	    uum.setUsName("Dhanush");
	    uum.setQuestion(am);
	    
	    List <UserM> list = new ArrayList<UserM>();	  
	    list.add(um);
	    list.add(uum);
	    
	    Session s = factory.openSession();
	    Transaction tx = s.beginTransaction();
	    
	    s.save(am);
	    s.save(um);
	    s.save(uum);
	    tx.commit();
	    s.close();
	  

	}

}
