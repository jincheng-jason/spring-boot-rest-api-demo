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

import com.example.client.model.NotFoundError;
import com.example.client.model.Todo;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TodosApi
 */
@Ignore
public class TodosApiTest {

    private final TodosApi api = new TodosApi();

    
    /**
     * Get specific todo
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTodoTest() {
        Integer id = null;
        Todo response = api.getTodo(id);

        // TODO: test validations
    }
    
    /**
     * Get all available todos
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTodosTest() {
        Integer id = null;
        Integer userId = null;
        List<Todo> response = api.getTodos(id, userId);

        // TODO: test validations
    }
    
}