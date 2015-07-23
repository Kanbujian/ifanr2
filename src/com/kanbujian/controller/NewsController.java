package com.kanbujian.controller;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kanbujian.model.News;
import com.kanbujian.service.NewsService;

@Controller
@RequestMapping("/news")
public class NewsController {
	/*用spring就不要随便new对象，全部都基于依赖注入，要不然可能会引起混乱*/
	
	private NewsService newsService;

	
    
    @RequestMapping("/show")
    public String show(Model model){
    	
    	List<News> news= newsService.show();
    	
    	/*System.out.println(news.size());
    	Iterator<News> it=news.iterator();
    	while(it.hasNext()){
    		News n=(News)it.next();
    		System.out.println(n.getNewsId()+" "+n.getTitle());
    	}*/
    	
		model.addAttribute("newsMap", news);
		
		return "news/show";
    }
    
    @RequestMapping("/test")
    public String test(Model model){
    	
    	System.out.println("测试页面");
		return "news/test";
    }
    @RequestMapping(value="/{newsId}/detail",method=RequestMethod.GET)
    public String detail(@PathVariable String newsId,Model model){
    	System.out.println("文章展示页面 ");
    	return "news/detail";
    }
	
	
    public NewsService getNewsService() {
		return newsService;
	}
    @Resource
	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}
}
