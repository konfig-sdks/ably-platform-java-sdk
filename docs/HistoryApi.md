# HistoryApi

All URIs are relative to *https://rest.ably.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMessagesByChannel**](HistoryApi.md#getMessagesByChannel) | **GET** /channels/{channel_id}/messages | Get message history for a channel |
| [**getPresenceHistoryOfChannel**](HistoryApi.md#getPresenceHistoryOfChannel) | **GET** /channels/{channel_id}/presence/history | Get presence history of a channel |


<a name="getMessagesByChannel"></a>
# **getMessagesByChannel**
> List&lt;Message&gt; getMessagesByChannel(channelId).xAblyVersion(xAblyVersion).format(format).start(start).limit(limit).end(end).direction(direction).execute();

Get message history for a channel

Get message history for a channel

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ably;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HistoryApi;
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
    String start = "start_example";
    Integer limit = 100;
    String end = "now";
    String direction = "forwards";
    try {
      List<Message> result = client
              .history
              .getMessagesByChannel(channelId)
              .xAblyVersion(xAblyVersion)
              .format(format)
              .start(start)
              .limit(limit)
              .end(end)
              .direction(direction)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HistoryApi#getMessagesByChannel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Message>> response = client
              .history
              .getMessagesByChannel(channelId)
              .xAblyVersion(xAblyVersion)
              .format(format)
              .start(start)
              .limit(limit)
              .end(end)
              .direction(direction)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HistoryApi#getMessagesByChannel");
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
| **start** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |
| **end** | **String**|  | [optional] [default to now] |
| **direction** | **String**|  | [optional] [default to backwards] [enum: forwards, backwards] |

### Return type

[**List&lt;Message&gt;**](Message.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-msgpack, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Error |  * x-ably-errorcode -  <br>  * x-ably-errormessage -  <br>  * x-ably-serverid -  <br>  |

<a name="getPresenceHistoryOfChannel"></a>
# **getPresenceHistoryOfChannel**
> List&lt;PresenceMessage&gt; getPresenceHistoryOfChannel(channelId).xAblyVersion(xAblyVersion).format(format).start(start).limit(limit).end(end).direction(direction).execute();

Get presence history of a channel

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
import com.konfigthis.client.api.HistoryApi;
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
    String start = "start_example";
    Integer limit = 100;
    String end = "now";
    String direction = "forwards";
    try {
      List<PresenceMessage> result = client
              .history
              .getPresenceHistoryOfChannel(channelId)
              .xAblyVersion(xAblyVersion)
              .format(format)
              .start(start)
              .limit(limit)
              .end(end)
              .direction(direction)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HistoryApi#getPresenceHistoryOfChannel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PresenceMessage>> response = client
              .history
              .getPresenceHistoryOfChannel(channelId)
              .xAblyVersion(xAblyVersion)
              .format(format)
              .start(start)
              .limit(limit)
              .end(end)
              .direction(direction)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HistoryApi#getPresenceHistoryOfChannel");
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
| **start** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |
| **end** | **String**|  | [optional] [default to now] |
| **direction** | **String**|  | [optional] [default to backwards] [enum: forwards, backwards] |

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
| **0** | Error |  * x-ably-errorcode -  <br>  * x-ably-errormessage -  <br>  * x-ably-serverid -  <br>  |

