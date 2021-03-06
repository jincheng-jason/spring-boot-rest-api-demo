/*
 * JSON Placeholder
 * Fake Online REST API for Testing and Prototyping
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.example.client.api;

import com.example.client.model.Album;
import com.example.client.model.NotFoundError;
import com.example.client.model.Photo;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AlbumsApi
 */
@Ignore
public class AlbumsApiTest {

    private final AlbumsApi api = new AlbumsApi();

    
    /**
     * Get specific album
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void albumsIdGetTest() {
        Integer id = null;
        Album response = api.albumsIdGet(id);

        // TODO: test validations
    }
    
    /**
     * Get photos for a specific album
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void albumsIdPhotosGetTest() {
        Integer id = null;
        List<Photo> response = api.albumsIdPhotosGet(id);

        // TODO: test validations
    }
    
    /**
     * Get all available albums
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAlbumsTest() {
        Integer id = null;
        Integer userId = null;
        List<Album> response = api.getAlbums(id, userId);

        // TODO: test validations
    }
    
}
