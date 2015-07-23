package com.kanbujian.service;

import java.util.Iterator;
import java.util.List;

import com.kanbujian.DAO.UserDAO;
import com.kanbujian.model.User;

public class UserService {
	public static UserDAO userDao=null;

	public UserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}
	
	public boolean checkLogin(String username,String password){
		User user=new User();
		user.setUsername(username);
		user.setUserPassWord(password);
		System.out.println(user.getUsername());
		System.out.println(user.getUserPassWord());
		//System.out.println(userDao);
		return userDao.checkLogin(user);
	
		
	}
	
	public List<User> list(){
			List<User> li=userDao.list();
			Iterator<User> it=li.iterator();
			while(it.hasNext()){
				User u=it.next();
				System.out.println(u.getUsername());
			}
			
			return li;
	}
	
	public User show(String username){
		 return userDao.show( username);
	}
	
	public User getUserByUsername(String username){
		return userDao.getUserByUsername(username);
	}
    
	
	public void add(User u){
		userDao.add(u);
	}
}
