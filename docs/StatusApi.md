# StatusApi

All URIs are relative to *https://rest.ably.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMetadataOfAllChannels**](StatusApi.md#getMetadataOfAllChannels) | **GET** /channels | Enumerate all active channels of the application |
| [**getMetadataOfChannel**](StatusApi.md#getMetadataOfChannel) | **GET** /channels/{channel_id} | Get metadata of a channel |
| [**getPresenceOfChannel**](StatusApi.md#getPresenceOfChannel) | **GET** /channels/{channel_id}/presence | Get presence of a channel |


<a name="getMetadataOfAllChannels"></a>
# **getMetadataOfAllChannels**
> Object getMetadataOfAllChannels().xAblyVersion(xAblyVersion).format(format).limit(limit).prefix(prefix).by(by).execute();

Enumerate all active channels of the application

Enumerate all active channels of the application

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ably;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatusApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://rest.ably.io";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    Ably client = new Ably(configuration);
    String xAblyVersion = "xAblyVersion_example"; // The version of the API you wish to use.
    String format = "json"; // The response format you would like
    Integer limit = 100;
    String prefix = "prefix_example"; // Optionally limits the query to only those channels whose name starts with the given prefix
    String by = "value"; // optionally specifies whether to return just channel names (by=id) or ChannelDetails (by=value)
    try {
      Object result = client
              .status
              .getMetadataOfAllChannels()
              .xAblyVersion(xAblyVersion)
              .format(format)
              .limit(limit)
              .prefix(prefix)
              .by(by)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#getMetadataOfAllChannels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .status
              .getMetadataOfAllChannels()
              .xAblyVersion(xAblyVersion)
              .format(format)
              .limit(limit)
              .prefix(prefix)
              .by(by)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#getMetadataOfAllChannels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xAblyVersion** | **String**| The version of the API you wish to use. | [optional] |
| **format** | **String**| The response format you would like | [optional] [enum: json, jsonp, msgpack, html] |
| **limit** | **Integer**|  | [optional] [default to 100] |
| **prefix** | **String**| Optionally limits the query to only those channels whose name starts with the given prefix | [optional] |
| **by** | **String**| optionally specifies whether to return just channel names (by&#x3D;id) or ChannelDetails (by&#x3D;value) | [optional] [enum: value, id] |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-msgpack, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Error |  * x-ably-errorcode -  <br>  * x-ably-errormessage -  <br>  * x-ably-serverid -  <br>  |

<a name="getMetadataOfChannel"></a>
# **getMetadataOfChannel**
> ChannelDetails getMetadataOfChannel(channelId).xAblyVersion(xAblyVersion).format(format).execute();

Get metadata of a channel

Get metadata of a channel

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ably;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatusApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://rest.ably.io";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    Ably client = new Ably(configuration);
    String channelId = "channelId_example"; // The [Channel's ID](https://www.ably.io/documentation/rest/channels).
    String xAblyVersion = "xAblyVersion_example"; // The version of the API you wish to use.
    String format = "json"; // The response format you would like
    try {
      ChannelDetails result = client
              .status
              .getMetadataOfChannel(channelId)
              .xAblyVersion(xAblyVersion)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getChannelId());
      System.out.println(result.getIsGlobalMaster());
      System.out.println(result.getRegion());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#getMetadataOfChannel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChannelDetails> response = client
              .status
              .getMetadataOfChannel(channelId)
              .xAblyVersion(xAblyVersion)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#getMetadataOfChannel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **channelId** | **String**| The [Channel&#39;s ID](https://www.ably.io/documentation/rest/channels). | |
| **xAblyVersion** | **String**| The version of the API you wish to use. | [optional] |
| **format** | **String**| The response format you would like | [optional] [enum: json, jsonp, msgpack, html] |

### Return type

[**ChannelDetails**](ChannelDetails.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-msgpack, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * x-ably-serverid -  <br>  |
| **0** | Error |  * x-ably-errorcode -  <br>  * x-ably-errormessage -  <br>  * x-ably-serverid -  <br>  |

<a name="getPresenceOfChannel"></a>
# **getPresenceOfChannel**
> List&lt;PresenceMessage&gt; getPresenceOfChannel(channelId).xAblyVersion(xAblyVersion).format(format).clientId(clientId).connectionId(connectionId).limit(limit).execute();

Get presence of a channel

Get presence on a channel

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ably;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatusApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://rest.ably.io";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    Ably client = new Ably(configuration);
    String channelId = "channelId_example"; // The [Channel's ID](https://www.ably.io/documentation/rest/channels).
    String xAblyVersion = "xAblyVersion_example"; // The version of the API you wish to use.
    String format = "json"; // The response format you would like
    String clientId = "clientId_example";
    String connectionId = "connectionId_example";
    Integer limit = 100;
    try {
      List<PresenceMessage> result = client
              .status
              .getPresenceOfChannel(channelId)
              .xAblyVersion(xAblyVersion)
              .format(format)
              .clientId(clientId)
              .connectionId(connectionId)
              .limit(limit)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#getPresenceOfChannel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PresenceMessage>> response = client
              .status
              .getPresenceOfChannel(channelId)
              .xAblyVersion(xAblyVersion)
              .format(format)
              .clientId(clientId)
              .connectionId(connectionId)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#getPresenceOfChannel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **channelId** | **String**| The [Channel&#39;s ID](https://www.ably.io/documentation/rest/channels). | |
| **xAblyVersion** | **String**| The version of the API you wish to use. | [optional] |
| **format** | **String**| The response format you would like | [optional] [enum: json, jsonp, msgpack, html] |
| **clientId** | **String**|  | [optional] |
| **connectionId** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 100] |

### Return type

[**List&lt;PresenceMessage&gt;**](PresenceMessage.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-msgpack, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * link -  <br>  * x-ably-serverid -  <br>  |
| **0** | Error |  * x-ably-errorcode -  <br>  * x-ably-errormessage -  <br>  * x-ably-serverid -  <br>  |

