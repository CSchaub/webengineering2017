package com.micromata.webengineering.demo.post;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Handle all CRUD operations for posts.
 */
@Service
public class PostService {
	
    private List<PostPOJO> posts = new LinkedList<>();
    private int postCounter = 0;
    

    /**
     * Retrieve the list of all posts.
     *
     * @return post list
     */
    public List<PostPOJO> getPosts() {
        return posts;
    } 


    /**
     * Add a new post.
     *
     * @param title the post title.
     */
    public void addPost(String title) {
       	PostPOJO tmp = new PostPOJO(postCounter);
    	tmp.setTitle(title);
    	tmp.setTimeOfCreation(new Date().toString());
    	tmp.setContent("dummycontent");
        posts.add(tmp);
        postCounter++;
    }

    /**
     * Del a post form the postList by id
     * @param id
     */
	public void delPost(int id) {
		if (posts.size() >= id) {
			for (PostPOJO post : posts) {
				if (post.getId() == id) {
					posts.remove(post);
					break;
				}
			}
		} 
	}
}
