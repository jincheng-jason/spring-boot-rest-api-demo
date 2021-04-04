package com.example.restfuldemo.controller;

import com.example.client.api.CommentsApi;
import com.example.client.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1.0/api/comments")
public class CommentsController {

    private final CommentsApi commentsApi;

    @Autowired
    public CommentsController(CommentsApi commentsApi) {
        this.commentsApi = commentsApi;
    }

    @GetMapping("")
    public List<Comment> getComments(@RequestParam Optional<Integer> postId) {
        return commentsApi.getComments(null, postId.orElse(null));
    }

}
