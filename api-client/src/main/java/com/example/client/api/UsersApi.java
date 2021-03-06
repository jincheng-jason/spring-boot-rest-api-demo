package com.example.client.api;

import com.example.client.invoker.ApiClient;

import com.example.client.model.NotFoundError;
import com.example.client.model.User;

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
@Component("com.example.client.api.UsersApi")
public class UsersApi {
    private ApiClient apiClient;

    public UsersApi() {
        this(new ApiClient());
    }

    @Autowired
    public UsersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get specific user
     * 
     * <p><b>200</b> - successful operation
     * <p><b>404</b> - not found
     * @param id The ID of the user to retrieve (required)
     * @return User
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public User getUser(Integer id) throws RestClientException {
        return getUserWithHttpInfo(id).getBody();
    }

    /**
     * Get specific user
     * 
     * <p><b>200</b> - successful operation
     * <p><b>404</b> - not found
     * @param id The ID of the user to retrieve (required)
     * @return ResponseEntity&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<User> getUserWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/users/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<User> returnType = new ParameterizedTypeReference<User>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get all available users
     * 
     * <p><b>200</b> - successful operation
     * @param id Filter by user ID (optional)
     * @param email Filter by user email address (optional)
     * @return List&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<User> getUsers(Integer id, Integer email) throws RestClientException {
        return getUsersWithHttpInfo(id, email).getBody();
    }

    /**
     * Get all available users
     * 
     * <p><b>200</b> - successful operation
     * @param id Filter by user ID (optional)
     * @param email Filter by user email address (optional)
     * @return ResponseEntity&lt;List&lt;User&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<User>> getUsersWithHttpInfo(Integer id, Integer email) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/users").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "email", email));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<User>> returnType = new ParameterizedTypeReference<List<User>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
