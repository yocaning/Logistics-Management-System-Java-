package com.workit.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hibernateUtil {
		public static Session session;
		public static SessionFactory sf;
			static
			{
				Configuration cfg = new Configuration().configure();
				sf = cfg.buildSessionFactory();
			}
		public static Session getSession()
		{
			session = sf.openSession();
			return session;
		}
}		
