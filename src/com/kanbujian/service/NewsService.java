package com.kanbujian.service;

import java.util.List;

import com.kanbujian.DAO.NewsDAO;
import com.kanbujian.model.News;

public class NewsService {
	private NewsDAO newsDao;

	public NewsDAO getNewsDao() {
		return newsDao;
	}

	public void setNewsDao(NewsDAO newsDao) {
		this.newsDao = newsDao;
	}
	
	public List<News> show(){
		return newsDao.show();
	}
	

}
