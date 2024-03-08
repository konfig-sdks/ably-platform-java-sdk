# PublishingApi

All URIs are relative to *https://rest.ably.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**publishMessagesToChannel**](PublishingApi.md#publishMessagesToChannel) | **POST** /channels/{channel_id}/messages | Publish a message to a channel |


<a name="publishMessagesToChannel"></a>
# **publishMessagesToChannel**
> PublishMessagesToChannel2XXResponse publishMessagesToChannel(channelId).xAblyVersion(xAblyVersion).format(format).message(message).execute();

Publish a message to a channel

Publish a message to the specified channel

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ably;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublishingApi;
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
    String clientId = "clientId_example"; // The [client ID](https://www.ably.io/documentation/core-features/authentication#identified-clients) of the publisher of this message.
    String connectionId = "connectionId_example"; // The connection ID of the publisher of this message.
    String data = "data_example"; // The string encoded payload, with the encoding specified below.
    String encoding = "encoding_example"; // This will typically be empty as all messages received from Ably are automatically decoded client-side using this value. However, if the message encoding cannot be processed, this attribute will contain the remaining transformations not applied to the data payload.
    Extras extras = new Extras();
    String id = "id_example"; // A Unique ID that can be specified by the publisher for [idempotent publishing](https://www.ably.io/documentation/rest/messages#idempotent).
    String name = "name_example"; // The event name, if provided.
    Long timestamp = 56L; // Timestamp when the message was received by the Ably, as milliseconds since the epoch.
    String xAblyVersion = "xAblyVersion_example"; // The version of the API you wish to use.
    String format = "json"; // The response format you would like
    try {
      PublishMessagesToChannel2XXResponse result = client
              .publishing
              .publishMessagesToChannel(channelId)
              .clientId(clientId)
              .connectionId(connectionId)
              .data(data)
              .encoding(encoding)
              .extras(extras)
              .id(id)
              .name(name)
              .timestamp(timestamp)
              .xAblyVersion(xAblyVersion)
              .format(format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PublishingApi#publishMessagesToChannel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublishMessagesToChannel2XXResponse> response = client
              .publishing
              .publishMessagesToChannel(channelId)
              .clientId(clientId)
              .connectionId(connectionId)
              .data(data)
              .encoding(encoding)
              .extras(extras)
              .id(id)
              .name(name)
              .timestamp(timestamp)
              .xAblyVersion(xAblyVersion)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublishingApi#publishMessagesToChannel");
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
| **message** | [**Message**](Message.md)|  | [optional] |

### Return type

[**PublishMessagesToChannel2XXResponse**](PublishMessagesToChannel2XXResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-msgpack, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-msgpack, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Error |  * x-ably-errorcode -  <br>  * x-ably-errormessage -  <br>  * x-ably-serverid -  <br>  |

