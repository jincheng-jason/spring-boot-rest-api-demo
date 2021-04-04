# UsersApi

All URIs are relative to *https://jsonplaceholder.typicode.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUser**](UsersApi.md#getUser) | **GET** /users/{id} | Get specific user
[**getUsers**](UsersApi.md#getUsers) | **GET** /users | Get all available users


<a name="getUser"></a>
# **getUser**
> User getUser(id)

Get specific user

### Example
```java
// Import classes:
//import com.example.client.invoker.ApiException;
//import com.example.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Integer id = 56; // Integer | The ID of the user to retrieve
try {
    User result = apiInstance.getUser(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The ID of the user to retrieve |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getUsers"></a>
# **getUsers**
> List&lt;User&gt; getUsers(id, email)

Get all available users

### Example
```java
// Import classes:
//import com.example.client.invoker.ApiException;
//import com.example.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Integer id = 56; // Integer | Filter by user ID
Integer email = 56; // Integer | Filter by user email address
try {
    List<User> result = apiInstance.getUsers(id, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Filter by user ID | [optional]
 **email** | **Integer**| Filter by user email address | [optional]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

