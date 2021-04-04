package com.example.restfuldemo.config;

import com.example.client.api.CommentsApi;
import com.example.client.api.PostsApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {

    @Bean
    public PostsApi getPostsApi() {
        return new PostsApi();
    }

    @Bean
    public CommentsApi getCommentsApi() {
        return new CommentsApi();
    }

}
