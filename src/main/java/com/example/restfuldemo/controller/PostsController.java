package com.example.restfuldemo.controller;

import com.example.client.api.PostsApi;
import com.example.client.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * PostsController
 * @author Jason Li
 */
@RestController
@RequestMapping("/v1.0/api/posts")
public class PostsController {

    private final PostsApi postsApi;

    @Autowired
    public PostsController(PostsApi postsApi) {
        this.postsApi = postsApi;
    }

    @GetMapping("")
    public List<Post> getPosts() {
        return postsApi.getPosts(null, null);
    }

}
