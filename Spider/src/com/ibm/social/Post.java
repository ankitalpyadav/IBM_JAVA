package com.ibm.social;

import java.time.LocalDate;

public class Post {
	
	private String content;
	private LocalDate postDate;
	private int likes;
	private int dislikes;
	private String [] comments;
	
	public Post() {
	}
	
	public Post(User u, String content, LocalDate postDate, int likes, int dislikes, String[] comments) {
		super();
		this.content = content;
		this.postDate = postDate;
		this.likes = likes;
		this.dislikes = dislikes;
		this.comments = comments;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDate getPostDate() {
		return postDate;
	}

	public void setPostDate(LocalDate postDate) {
		this.postDate = postDate;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getDislikes() {
		return dislikes;
	}

	public void setDislikes(int dislikes) {
		this.dislikes = dislikes;
	}

	public String[] getComments() {
		return comments;
	}

	public void setComments(String[] comments) {
		this.comments = comments;
	}

}
