# PhotosApi

All URIs are relative to *https://jsonplaceholder.typicode.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPhoto**](PhotosApi.md#getPhoto) | **GET** /photos/{id} | Get specific photo
[**getPhotos**](PhotosApi.md#getPhotos) | **GET** /photos | Get all available photos


<a name="getPhoto"></a>
# **getPhoto**
> Photo getPhoto(id)

Get specific photo

### Example
```java
// Import classes:
//import com.example.client.invoker.ApiException;
//import com.example.client.api.PhotosApi;


PhotosApi apiInstance = new PhotosApi();
Integer id = 56; // Integer | The ID of the photo to retrieve
try {
    Photo result = apiInstance.getPhoto(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PhotosApi#getPhoto");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The ID of the photo to retrieve |

### Return type

[**Photo**](Photo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getPhotos"></a>
# **getPhotos**
> List&lt;Photo&gt; getPhotos(id, albumId)

Get all available photos

### Example
```java
// Import classes:
//import com.example.client.invoker.ApiException;
//import com.example.client.api.PhotosApi;


PhotosApi apiInstance = new PhotosApi();
Integer id = 56; // Integer | Filter by photo ID
Integer albumId = 56; // Integer | Filter by album ID
try {
    List<Photo> result = apiInstance.getPhotos(id, albumId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PhotosApi#getPhotos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Filter by photo ID | [optional]
 **albumId** | **Integer**| Filter by album ID | [optional]

### Return type

[**List&lt;Photo&gt;**](Photo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

