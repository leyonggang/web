package cn.ayit.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import cn.ayit.bo.User;

public class TestHibernate {

	public static void main(String[] args) {
		User user=new User();
		user.setUsername("张三");
		user.setPassword("1");
		user.setAge(20);
		user.setBirth(new Date());
		
		//hibernate配置
		Configuration cfg=new Configuration();
		cfg.configure();
		
		//获取session工厂和session 实例
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();

		//调用session的api 方法 
		session.save(user);

		//关闭session
		session.close();
		
		
		
		

	}

}
