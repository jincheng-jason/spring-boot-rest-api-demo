# AlbumsApi

All URIs are relative to *https://jsonplaceholder.typicode.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**albumsIdGet**](AlbumsApi.md#albumsIdGet) | **GET** /albums/{id} | Get specific album
[**albumsIdPhotosGet**](AlbumsApi.md#albumsIdPhotosGet) | **GET** /albums/{id}/photos | Get photos for a specific album
[**getAlbums**](AlbumsApi.md#getAlbums) | **GET** /albums | Get all available albums


<a name="albumsIdGet"></a>
# **albumsIdGet**
> Album albumsIdGet(id)

Get specific album

### Example
```java
// Import classes:
//import com.example.client.invoker.ApiException;
//import com.example.client.api.AlbumsApi;


AlbumsApi apiInstance = new AlbumsApi();
Integer id = 56; // Integer | The ID of the album to retrieve
try {
    Album result = apiInstance.albumsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlbumsApi#albumsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The ID of the album to retrieve |

### Return type

[**Album**](Album.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="albumsIdPhotosGet"></a>
# **albumsIdPhotosGet**
> List&lt;Photo&gt; albumsIdPhotosGet(id)

Get photos for a specific album

### Example
```java
// Import classes:
//import com.example.client.invoker.ApiException;
//import com.example.client.api.AlbumsApi;


AlbumsApi apiInstance = new AlbumsApi();
Integer id = 56; // Integer | post id
try {
    List<Photo> result = apiInstance.albumsIdPhotosGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlbumsApi#albumsIdPhotosGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| post id |

### Return type

[**List&lt;Photo&gt;**](Photo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAlbums"></a>
# **getAlbums**
> List&lt;Album&gt; getAlbums(id, userId)

Get all available albums

### Example
```java
// Import classes:
//import com.example.client.invoker.ApiException;
//import com.example.client.api.AlbumsApi;


AlbumsApi apiInstance = new AlbumsApi();
Integer id = 56; // Integer | Filter by album ID
Integer userId = 56; // Integer | Filter by user ID
try {
    List<Album> result = apiInstance.getAlbums(id, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlbumsApi#getAlbums");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Filter by album ID | [optional]
 **userId** | **Integer**| Filter by user ID | [optional]

### Return type

[**List&lt;Album&gt;**](Album.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

