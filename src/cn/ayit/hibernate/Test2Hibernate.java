package cn.ayit.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.ayit.bo.User;
import cn.ayit.util.HibernateSessionFactory;

public class Test2Hibernate {

	public static void main(String[] args) throws Exception {
		User user=new User();
		user.setUsername("赵六1");
		user.setPassword("2");
		user.setAge(28);
		user.setBirth(new Date());
	 Session session=null;Transaction tx = null;
	 try{
			session = HibernateSessionFactory.getSession();
			tx = session.beginTransaction();
			session.save(user);
			user.setAge(20);
			user.setPassword("1");
			//User u=(User)session.get(User.class, "王五");
			//session.delete(u);
			//session.saveOrUpdate(user);
			tx.commit();
			
		}catch(Exception e){
			throw e;
		}finally{
			if(session != null)session.close();
		} 


	}

}
