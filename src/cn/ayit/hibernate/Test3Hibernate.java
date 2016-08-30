package cn.ayit.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.ayit.bo.User;
import cn.ayit.util.HibernateSessionFactory;

public class Test3Hibernate {

	public static void main(String[] args) throws Exception {
		User user=new User();
		user.setUsername("赵六2");
		user.setPassword("2");
		user.setAge(28);
		user.setBirth(new Date());
		
		
		Session session= HibernateSessionFactory.getSession();
		//session.save(user);
		//User user=(User)session.get(User.class, 6);
		
		String hql="select count(*) from User u where u.username=:name and age=:age";
		Query q=session.createQuery(hql);
		q.setParameter("age",28);
		q.setParameter("name","赵六1");
		/*List<User> users= q.list();
		for (User u : users) {
			System.out.println(u);
		}*/
		System.out.println(q.uniqueResult());
		
		
		
		
		
	}
}
