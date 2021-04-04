# TodosApi

All URIs are relative to *https://jsonplaceholder.typicode.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTodo**](TodosApi.md#getTodo) | **GET** /todos/{id} | Get specific todo
[**getTodos**](TodosApi.md#getTodos) | **GET** /todos | Get all available todos


<a name="getTodo"></a>
# **getTodo**
> Todo getTodo(id)

Get specific todo

### Example
```java
// Import classes:
//import com.example.client.invoker.ApiException;
//import com.example.client.api.TodosApi;


TodosApi apiInstance = new TodosApi();
Integer id = 56; // Integer | The ID of the todo to retrieve
try {
    Todo result = apiInstance.getTodo(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TodosApi#getTodo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The ID of the todo to retrieve |

### Return type

[**Todo**](Todo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getTodos"></a>
# **getTodos**
> List&lt;Todo&gt; getTodos(id, userId)

Get all available todos

### Example
```java
// Import classes:
//import com.example.client.invoker.ApiException;
//import com.example.client.api.TodosApi;


TodosApi apiInstance = new TodosApi();
Integer id = 56; // Integer | Filter by todo ID
Integer userId = 56; // Integer | Filter by user ID
try {
    List<Todo> result = apiInstance.getTodos(id, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TodosApi#getTodos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Filter by todo ID | [optional]
 **userId** | **Integer**| Filter by user ID | [optional]

### Return type

[**List&lt;Todo&gt;**](Todo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

