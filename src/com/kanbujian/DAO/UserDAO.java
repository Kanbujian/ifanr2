package com.kanbujian.DAO;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.kanbujian.model.User;

public class UserDAO {
	SessionFactory sessionFactory;
	Session session;
	
	public boolean checkLogin(User user){
   	 session=sessionFactory.getCurrentSession();
   	 
   	 List<User> list=list();
   	 boolean flag=list.contains(user);
   	
   	 return flag;
   	 
   	 
    }
	
	public List<User> list() {
		// TODO Auto-generated method stub
		session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		/* from User 后面跟的和类名对应，不是数据库中的表名*/
		List<User> result=(List<User>) session.createQuery("from User").list();
		
		/*list.contain() 与 hibernate中封装session.contains()的区别
		 * User u=new User();
		u.setUsername("jay");
		u.setUserPassWord("12345");
		System.out.println(result.contains(u));
		*/
	    System.out.println("User 数据库遍历成功！");
		session.getTransaction().commit();
		
	
		return result;
	}
	
	public User show(String username){
		/*session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		报could not initialize proxy - no Session异常, load生成的是代理对象
		//user u=(user)session.load(user.class,username);
		User u=(User)session.get(User.class,username);
		session.getTransaction().commit();
		
		return u;*/
		
		return getUserByUsername(username);
	}
	
	public User getUserByUsername(String username){
		List<User> li=list();
		User u=new User();
		
		Iterator<User> it=li.iterator();
		while(it.hasNext()){
			User temp=it.next();
			if(temp.getUsername().endsWith(username))
				return temp;
		}
		System.out.println("未根据用户名找到给定用户");
		return u;
	}
	
	public void add(User u){
		session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(u);
		session.getTransaction().commit();
	}
	
     public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	
}
