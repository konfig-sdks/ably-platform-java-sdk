# StatsApi

All URIs are relative to *https://rest.ably.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getStats**](StatsApi.md#getStats) | **GET** /stats | Retrieve usage statistics for an application |
| [**getTime**](StatsApi.md#getTime) | **GET** /time | Get the service time |


<a name="getStats"></a>
# **getStats**
> Object getStats().xAblyVersion(xAblyVersion).format(format).start(start).limit(limit).end(end).direction(direction).unit(unit).execute();

Retrieve usage statistics for an application

The Ably system can be queried to obtain usage statistics for a given application, and results are provided aggregated across all channels in use in the application in the specified period. Stats may be used to track usage against account quotas.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ably;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatsApi;
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
    String start = "start_example";
    Integer limit = 100;
    String end = "now";
    String direction = "forwards";
    String unit = "minute"; // Specifies the unit of aggregation in the returned results.
    try {
      Object result = client
              .stats
              .getStats()
              .xAblyVersion(xAblyVersion)
              .format(format)
              .start(start)
              .limit(limit)
              .end(end)
              .direction(direction)
              .unit(unit)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApi#getStats");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .stats
              .getStats()
              .xAblyVersion(xAblyVersion)
              .format(format)
              .start(start)
              .limit(limit)
              .end(end)
              .direction(direction)
              .unit(unit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApi#getStats");
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
| **start** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |
| **end** | **String**|  | [optional] [default to now] |
| **direction** | **String**|  | [optional] [default to backwards] [enum: forwards, backwards] |
| **unit** | **String**| Specifies the unit of aggregation in the returned results. | [optional] [default to minute] [enum: minute, hour, day, month] |

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

<a name="getTime"></a>
# **getTime**
> List&lt;Integer&gt; getTime().xAblyVersion(xAblyVersion).format(format).execute();

Get the service time

This returns the service time in milliseconds since the epoch.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ably;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://rest.ably.io";
    Ably client = new Ably(configuration);
    String xAblyVersion = "xAblyVersion_example"; // The version of the API you wish to use.
    String format = "json"; // The response format you would like
    try {
      List<Integer> result = client
              .stats
              .getTime()
              .xAblyVersion(xAblyVersion)
              .format(format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApi#getTime");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Integer>> response = client
              .stats
              .getTime()
              .xAblyVersion(xAblyVersion)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApi#getTime");
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

### Return type

**List&lt;Integer&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-msgpack, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Error |  * x-ably-errorcode -  <br>  * x-ably-errormessage -  <br>  * x-ably-serverid -  <br>  |

