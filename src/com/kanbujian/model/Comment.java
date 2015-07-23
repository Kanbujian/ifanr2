package com.kanbujian.model;

import java.util.Date;





public class Comment {
	private int CommentId;
	private int NewsId;
	private int UserId;
	private Date CommentTime;
	private String CommentInfo;
	
	public int getCommentId() {
		return CommentId;
	}
	public void setCommentId(int commentId) {
		CommentId = commentId;
	}
	public int getNewsId() {
		return NewsId;
	}
	public void setNewsId(int newsId) {
		NewsId = newsId;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public Date getCommentTime() {
		return CommentTime;
	}
	public void setCommentTime(Date commentTime) {
		CommentTime = commentTime;
	}
	public String getCommentInfo() {
		return CommentInfo;
	}
	public void setCommentInfo(String commentInfo) {
		CommentInfo = commentInfo;
	}
	

}
