package com.micromata.webengineering.demo.post;

import java.util.Date;

public class PostPOJO {
	
	private String title;
	private String content;
	private String timeOfCreation;
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTimeOfCreation() {
		return timeOfCreation;
	}
	public void setTimeOfCreation(String timeOfCreation) {
		this.timeOfCreation = timeOfCreation;
	}
}
