package com.example.client.api;

import com.example.client.invoker.ApiClient;

import com.example.client.model.Album;
import com.example.client.model.NotFoundError;
import com.example.client.model.Photo;

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
@Component("com.example.client.api.AlbumsApi")
public class AlbumsApi {
    private ApiClient apiClient;

    public AlbumsApi() {
        this(new ApiClient());
    }

    @Autowired
    public AlbumsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get specific album
     * 
     * <p><b>200</b> - successful operation
     * <p><b>404</b> - not found
     * @param id The ID of the album to retrieve (required)
     * @return Album
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Album albumsIdGet(Integer id) throws RestClientException {
        return albumsIdGetWithHttpInfo(id).getBody();
    }

    /**
     * Get specific album
     * 
     * <p><b>200</b> - successful operation
     * <p><b>404</b> - not found
     * @param id The ID of the album to retrieve (required)
     * @return ResponseEntity&lt;Album&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Album> albumsIdGetWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling albumsIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/albums/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Album> returnType = new ParameterizedTypeReference<Album>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get photos for a specific album
     * 
     * <p><b>200</b> - successful operation
     * <p><b>404</b> - not found
     * @param id post id (required)
     * @return List&lt;Photo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Photo> albumsIdPhotosGet(Integer id) throws RestClientException {
        return albumsIdPhotosGetWithHttpInfo(id).getBody();
    }

    /**
     * Get photos for a specific album
     * 
     * <p><b>200</b> - successful operation
     * <p><b>404</b> - not found
     * @param id post id (required)
     * @return ResponseEntity&lt;List&lt;Photo&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Photo>> albumsIdPhotosGetWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling albumsIdPhotosGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/albums/{id}/photos").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<Photo>> returnType = new ParameterizedTypeReference<List<Photo>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get all available albums
     * 
     * <p><b>200</b> - successful operation
     * @param id Filter by album ID (optional)
     * @param userId Filter by user ID (optional)
     * @return List&lt;Album&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Album> getAlbums(Integer id, Integer userId) throws RestClientException {
        return getAlbumsWithHttpInfo(id, userId).getBody();
    }

    /**
     * Get all available albums
     * 
     * <p><b>200</b> - successful operation
     * @param id Filter by album ID (optional)
     * @param userId Filter by user ID (optional)
     * @return ResponseEntity&lt;List&lt;Album&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Album>> getAlbumsWithHttpInfo(Integer id, Integer userId) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/albums").build().toUriString();

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

        ParameterizedTypeReference<List<Album>> returnType = new ParameterizedTypeReference<List<Album>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
