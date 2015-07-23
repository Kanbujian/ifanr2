package com.kanbujian.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kanbujian.exception.UserException;
import com.kanbujian.model.User;
import com.kanbujian.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    private static UserService us;

    public UserService getUs() {
		return us;
	}
    @Resource(name="userService")
	public void setUs(UserService us) {
		this.us = us;
	}
	
   /*  //展示用户信息
     
	
	 public String list(Model model){
		 List<User> Users=us.list();
		 Map<String,User> UserMap=new HashMap<String,User>();
		// model.addAttribute("Users",Users);
		 Iterator<User> it=Users.iterator();
		 while(it.hasNext()){
			 User u=it.next();
			 System.out.println(u.getUsername()+"  "+u.getUserPassWord());
			 UserMap.put(u.getUsername(), u);
		 }
	     //map形式 
		// model.addAttribute("UserMap", UserMap);
		 //直接list形式
		 model.addAttribute("UserMap", Users);
		 
		//--just for testing 测试addAllAttributes（list） jsp遍历-->
		 List<String> strList=new ArrayList<String>();
		 strList.add("hsuhsush1");
		 strList.add("shdushdiu2");
		 strList.add("ahsiasui3");
		 model.addAllAttributes(strList);
		 
		 model.addAttribute("PageTitle", "心系");
	
		 
    	 return "/User/list";
	 }
	
	 // 添加用户信息
	 
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String add(Model model){
		model.addAttribute("User1",new User());
		return "/User/add";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(@Validated User u,BindingResult br){
		if(br.hasErrors())
			return "redirect:/User/add";
		us.add(u);
		return "redirect:/User/Users";
		
	}*/
	
	/**
	 * 展示用户信息
	 * @param Username  用户名
	 * @param model
	 * @param session
	 * @return
	 */
	 
	@RequestMapping(value="/{Username}/show",method=RequestMethod.GET)
	public String show(@PathVariable String Username,Model model,HttpSession session){
		/*如果session中不存在登陆信息，则不允许进入用户信息查看页面，转到登陆页面*/
		if(session.getAttribute("LoginUser")==null){
			//System.out.println(session.getAttribute("LoginUser"));
			model.addAttribute("errorMessqge", "请您先登陆");			
			return "redirect:/login";
		}
		/*如果session存的LoginUser与Url中请求的用户名不相同，返回错误请求信息*/
		User u=(User)session.getAttribute("LoginUser");
		if(!u.getUsername().equals(Username)){
			throw new UserException("用户未登陆，无信息查看权限");
			
			/*return "redirect:/error";*/
		}
		User user=us.show(Username);
		model.addAttribute(user);
		model.addAttribute("PageTitile",user.getUsername());
		return "/user/show";		
		
	}
	@RequestMapping(value="/{Username}/show",method=RequestMethod.GET,params="json")
	public String show(@PathVariable String Username){
		
		return "/user/show";		
		
	}
	
	
	/* // 修改用户信息
	 
	@RequestMapping(value="/{Username}/update",method=RequestMethod.GET)
	public String update(@PathVariable String Username,Model model){
		model.addAttribute("User",new User());
		System.out.println("dao zhe mei ?");
		return "/User/update";
	}
	
	@RequestMapping(value="/{Username}/update",method=RequestMethod.POST)
	public String update(@Validated User u,BindingResult br,Model model){
		if(br.hasErrors())
				return "/User/update";
		us.update(u);
		
		return "redirect:/User/Users";
	}
	
	@RequestMapping(value="{Username}/delete",method=RequestMethod.GET)
	public String delete(@PathVariable String Username,Model model){
        us.delete(Username); 
        return "redirect:/User/Users";
	}
	*/
}