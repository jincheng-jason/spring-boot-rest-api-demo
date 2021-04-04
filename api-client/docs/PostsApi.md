# PostsApi

All URIs are relative to *https://jsonplaceholder.typicode.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPosts**](PostsApi.md#getPosts) | **GET** /posts | Get all available posts
[**postsIdCommentsGet**](PostsApi.md#postsIdCommentsGet) | **GET** /posts/{id}/comments | Get comments for a specific post
[**postsIdGet**](PostsApi.md#postsIdGet) | **GET** /posts/{id} | Get specific post


<a name="getPosts"></a>
# **getPosts**
> List&lt;Post&gt; getPosts(id, userId)

Get all available posts

### Example
```java
// Import classes:
//import com.example.client.invoker.ApiException;
//import com.example.client.api.PostsApi;


PostsApi apiInstance = new PostsApi();
Integer id = 56; // Integer | Filter by post ID
Integer userId = 56; // Integer | Filter by user ID
try {
    List<Post> result = apiInstance.getPosts(id, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostsApi#getPosts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Filter by post ID | [optional]
 **userId** | **Integer**| Filter by user ID | [optional]

### Return type

[**List&lt;Post&gt;**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postsIdCommentsGet"></a>
# **postsIdCommentsGet**
> List&lt;Comment&gt; postsIdCommentsGet(id)

Get comments for a specific post

### Example
```java
// Import classes:
//import com.example.client.invoker.ApiException;
//import com.example.client.api.PostsApi;


PostsApi apiInstance = new PostsApi();
Integer id = 56; // Integer | post id
try {
    List<Comment> result = apiInstance.postsIdCommentsGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostsApi#postsIdCommentsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| post id |

### Return type

[**List&lt;Comment&gt;**](Comment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="postsIdGet"></a>
# **postsIdGet**
> Post postsIdGet(id)

Get specific post

### Example
```java
// Import classes:
//import com.example.client.invoker.ApiException;
//import com.example.client.api.PostsApi;


PostsApi apiInstance = new PostsApi();
Integer id = 56; // Integer | The ID of the post to retrieve
try {
    Post result = apiInstance.postsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostsApi#postsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The ID of the post to retrieve |

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

