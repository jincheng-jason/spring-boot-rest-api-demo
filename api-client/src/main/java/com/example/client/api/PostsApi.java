package com.example.client.api;

import com.example.client.invoker.ApiClient;

import com.example.client.model.Comment;
import com.example.client.model.NotFoundError;
import com.example.client.model.Post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-03T22:13:09.964+13:00")
@Component("com.example.client.api.PostsApi")
public class PostsApi {
    private ApiClient apiClient;

    public PostsApi() {
        this(new ApiClient());
    }

    @Autowired
    public PostsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get all available posts
     * 
     * <p><b>200</b> - successful operation
     * @param id Filter by post ID (optional)
     * @param userId Filter by user ID (optional)
     * @return List&lt;Post&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Post> getPosts(Integer id, Integer userId) throws RestClientException {
        return getPostsWithHttpInfo(id, userId).getBody();
    }

    /**
     * Get all available posts
     * 
     * <p><b>200</b> - successful operation
     * @param id Filter by post ID (optional)
     * @param userId Filter by user ID (optional)
     * @return ResponseEntity&lt;List&lt;Post&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Post>> getPostsWithHttpInfo(Integer id, Integer userId) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/posts").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<Post>> returnType = new ParameterizedTypeReference<List<Post>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get comments for a specific post
     * 
     * <p><b>200</b> - successful operation
     * <p><b>404</b> - not found
     * @param id post id (required)
     * @return List&lt;Comment&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Comment> postsIdCommentsGet(Integer id) throws RestClientException {
        return postsIdCommentsGetWithHttpInfo(id).getBody();
    }

    /**
     * Get comments for a specific post
     * 
     * <p><b>200</b> - successful operation
     * <p><b>404</b> - not found
     * @param id post id (required)
     * @return ResponseEntity&lt;List&lt;Comment&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Comment>> postsIdCommentsGetWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling postsIdCommentsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/posts/{id}/comments").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<Comment>> returnType = new ParameterizedTypeReference<List<Comment>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get specific post
     * 
     * <p><b>200</b> - successful operation
     * <p><b>404</b> - not found
     * @param id The ID of the post to retrieve (required)
     * @return Post
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Post postsIdGet(Integer id) throws RestClientException {
        return postsIdGetWithHttpInfo(id).getBody();
    }

    /**
     * Get specific post
     * 
     * <p><b>200</b> - successful operation
     * <p><b>404</b> - not found
     * @param id The ID of the post to retrieve (required)
     * @return ResponseEntity&lt;Post&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Post> postsIdGetWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling postsIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/posts/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Post> returnType = new ParameterizedTypeReference<Post>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
