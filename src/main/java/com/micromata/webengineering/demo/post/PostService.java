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
       	PostPOJO tmp = new PostPOJO();
    	tmp.setTitle(title);
    	tmp.setTimeOfCreation(new Date().toString());
    	tmp.setContent("dummycontent");
    	//tmp.setTimeOfCreation(new Date(2017,5,1,21,7));
        posts.add(tmp);
    }
}
