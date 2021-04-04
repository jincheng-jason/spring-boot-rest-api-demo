# CommentsApi

All URIs are relative to *https://jsonplaceholder.typicode.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getComment**](CommentsApi.md#getComment) | **GET** /comments/{id} | Get specific comment
[**getComments**](CommentsApi.md#getComments) | **GET** /comments | Get all available comments


<a name="getComment"></a>
# **getComment**
> Comment getComment(id)

Get specific comment

### Example
```java
// Import classes:
//import com.example.client.invoker.ApiException;
//import com.example.client.api.CommentsApi;


CommentsApi apiInstance = new CommentsApi();
Integer id = 56; // Integer | The ID of the comment to retrieve
try {
    Comment result = apiInstance.getComment(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#getComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The ID of the comment to retrieve |

### Return type

[**Comment**](Comment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getComments"></a>
# **getComments**
> List&lt;Comment&gt; getComments(id, postId)

Get all available comments

### Example
```java
// Import classes:
//import com.example.client.invoker.ApiException;
//import com.example.client.api.CommentsApi;


CommentsApi apiInstance = new CommentsApi();
Integer id = 56; // Integer | Filter by comment ID
Integer postId = 56; // Integer | Filter by post ID
try {
    List<Comment> result = apiInstance.getComments(id, postId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#getComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Filter by comment ID | [optional]
 **postId** | **Integer**| Filter by post ID | [optional]

### Return type

[**List&lt;Comment&gt;**](Comment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

