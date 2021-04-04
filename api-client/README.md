# swagger-api-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.example</groupId>
    <artifactId>swagger-api-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.example:swagger-api-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-api-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.example.client.invoker.*;
import com.example.client.invoker.auth.*;
import com.example.client.model.*;
import com.example.client.api.AlbumsApi;

import java.io.File;
import java.util.*;

public class AlbumsApiExample {

    public static void main(String[] args) {
        
        AlbumsApi apiInstance = new AlbumsApi();
        Integer id = 56; // Integer | The ID of the album to retrieve
        try {
            Album result = apiInstance.albumsIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumsApi#albumsIdGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://jsonplaceholder.typicode.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AlbumsApi* | [**albumsIdGet**](docs/AlbumsApi.md#albumsIdGet) | **GET** /albums/{id} | Get specific album
*AlbumsApi* | [**albumsIdPhotosGet**](docs/AlbumsApi.md#albumsIdPhotosGet) | **GET** /albums/{id}/photos | Get photos for a specific album
*AlbumsApi* | [**getAlbums**](docs/AlbumsApi.md#getAlbums) | **GET** /albums | Get all available albums
*CommentsApi* | [**getComment**](docs/CommentsApi.md#getComment) | **GET** /comments/{id} | Get specific comment
*CommentsApi* | [**getComments**](docs/CommentsApi.md#getComments) | **GET** /comments | Get all available comments
*PhotosApi* | [**getPhoto**](docs/PhotosApi.md#getPhoto) | **GET** /photos/{id} | Get specific photo
*PhotosApi* | [**getPhotos**](docs/PhotosApi.md#getPhotos) | **GET** /photos | Get all available photos
*PostsApi* | [**getPosts**](docs/PostsApi.md#getPosts) | **GET** /posts | Get all available posts
*PostsApi* | [**postsIdCommentsGet**](docs/PostsApi.md#postsIdCommentsGet) | **GET** /posts/{id}/comments | Get comments for a specific post
*PostsApi* | [**postsIdGet**](docs/PostsApi.md#postsIdGet) | **GET** /posts/{id} | Get specific post
*TodosApi* | [**getTodo**](docs/TodosApi.md#getTodo) | **GET** /todos/{id} | Get specific todo
*TodosApi* | [**getTodos**](docs/TodosApi.md#getTodos) | **GET** /todos | Get all available todos
*UsersApi* | [**getUser**](docs/UsersApi.md#getUser) | **GET** /users/{id} | Get specific user
*UsersApi* | [**getUsers**](docs/UsersApi.md#getUsers) | **GET** /users | Get all available users


## Documentation for Models

 - [Album](docs/Album.md)
 - [Comment](docs/Comment.md)
 - [NotFoundError](docs/NotFoundError.md)
 - [Photo](docs/Photo.md)
 - [Post](docs/Post.md)
 - [Todo](docs/Todo.md)
 - [User](docs/User.md)
 - [UserAddress](docs/UserAddress.md)
 - [UserAddressGeo](docs/UserAddressGeo.md)
 - [UserCompany](docs/UserCompany.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



