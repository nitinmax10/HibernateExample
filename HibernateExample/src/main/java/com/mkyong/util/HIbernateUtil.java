package com.mkyong.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HIbernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private static final SessionFactory buildSessionFactory(){
		
		return new Configuration().configure().buildSessionFactory();
	}
}
