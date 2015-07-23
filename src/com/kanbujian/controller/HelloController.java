package com.kanbujian.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kanbujian.model.User;
import com.kanbujian.service.UserService;


@Controller
public class HelloController {
	
	@RequestMapping("index")
	public String hello(Model model){
		
		return "redirect:news/show";
	}
	
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String login(){
		
		return "login";
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String login(String username,String password,HttpSession session){
		
		UserService us=new UserController().getUs();
		boolean Logined=us.checkLogin(username, password);		
		 User u=new User();
		 u.setUsername(username);
		 u.setUserPassWord(password);
		if(Logined){
			session.setAttribute("LoginUser", u);
			return "redirect:user/"+u.getUsername()+"/show";
			
		}else{
			System.out.println("用户名不存在或者密码不正确");
			return "login";
		}
		
	}
	/**
	 * 注册页面
	 * @return  访问signUp.jsp
	 */
	@RequestMapping(value="signup",method=RequestMethod.GET)
    public  String signUp(){
		
		return "signUp";
	}
	/**
	 * 接受注册页面提交的数据，post方式，进行注册处理
	 * @param username
	 * @param gender
	 * @param password
	 * @param email
	 * @return
	 */
	@RequestMapping(value="signup",method=RequestMethod.POST)
	public  String signUp(String username,String gender,String password,String email){
		UserService us=new UserController().getUs();
		User u=new User();
		u.setUsername(username);
		u.setUserGender(gender);
		u.setUserPassWord(password);
        u.setUserMail(email);
        
        us.add(u);
        
        return "redirect:user/"+u.getUsername()+"/show";
	}
    
	@RequestMapping("error")
	public String error(Model model){
	  
		return "/error";
	}
	
}
