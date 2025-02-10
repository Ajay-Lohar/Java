package com.ajay.springwithhibernate1;

import com.ajay.springwithhibernate1.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class SpringWithHibernate1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringWithHibernate1Application.class, args);

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();

//		Transaction transaction =session.beginTransaction();

		User user =session.get(User.class, 1L);
		System.out.println(user.getName());
		System.out.println(user.getEmail());



	}

}
