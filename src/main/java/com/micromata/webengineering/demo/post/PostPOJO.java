package com.micromata.webengineering.demo.post;

/**
 * POJO data structure to save posts
 * 
 * @author chris
 *
 */

public class PostPOJO {
	
	private int id;
	
	private String title;
	private String content;
	private String timeOfCreation;
	
	public PostPOJO (int id) {
		this.setId(id);
	}
	
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
