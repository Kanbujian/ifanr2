package com.kanbujian.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.kanbujian.model.News;

public class NewsDAO {
	SessionFactory sessionFactory;
	Session session;
	
    public List<News> show(){
    	System.out.println("News 数据库操作开始");
    	session=sessionFactory.getCurrentSession();
    	System.out.println("嵌套事务001");
    	session.beginTransaction();
    	/*session.createQuery()使用HQL,返回的是映射对象
    	session.craeteSQLQuery()使用sql，返回的是Object对象集合
    	会发生转换错误[Ljava.lang.Object; cannot be cast to com.kanbujian.model.News
    	可以在craeteSQLQuery().addEntity()返回相应对象
    	*/
    	System.out.println("嵌套事务002");
    	List<News> li=(List<News>)session.createSQLQuery(" select * from news  order by publishTime desc limit 0,3;").addEntity(News.class).list();
    	/*List<News> li=(List<News>)session.createQuery("from news order by publishTime desc ");*/
    	session.getTransaction().commit();
    	System.out.println("News 数据库遍历完成");
    	return li;
    	
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
