# PushApi

All URIs are relative to *https://rest.ably.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deletePushDeviceDetails**](PushApi.md#deletePushDeviceDetails) | **DELETE** /push/channelSubscriptions | Delete a registered device&#39;s update token |
| [**getChannelsWithPushSubscribers**](PushApi.md#getChannelsWithPushSubscribers) | **GET** /push/channels | List all channels with at least one subscribed device |
| [**getPushDeviceDetails**](PushApi.md#getPushDeviceDetails) | **GET** /push/deviceRegistrations/{device_id} | Get a device registration |
| [**getPushSubscriptionsOnChannels**](PushApi.md#getPushSubscriptionsOnChannels) | **GET** /push/channelSubscriptions | List channel subscriptions |
| [**getRegisteredPushDevices**](PushApi.md#getRegisteredPushDevices) | **GET** /push/deviceRegistrations | List devices registered for receiving push notifications |
| [**patchPushDeviceDetails**](PushApi.md#patchPushDeviceDetails) | **PATCH** /push/deviceRegistrations/{device_id} | Update a device registration |
| [**publishPushNotificationToDevices**](PushApi.md#publishPushNotificationToDevices) | **POST** /push/publish | Publish a push notification to device(s) |
| [**putPushDeviceDetails**](PushApi.md#putPushDeviceDetails) | **PUT** /push/deviceRegistrations/{device_id} | Update a device registration |
| [**registerPushDevice**](PushApi.md#registerPushDevice) | **POST** /push/deviceRegistrations | Register a device for receiving push notifications |
| [**subscribePushDeviceToChannel**](PushApi.md#subscribePushDeviceToChannel) | **POST** /push/channelSubscriptions | Subscribe a device to a channel |
| [**unregisterAllPushDevices**](PushApi.md#unregisterAllPushDevices) | **DELETE** /push/deviceRegistrations | Unregister matching devices for push notifications |
| [**unregisterPushDevice**](PushApi.md#unregisterPushDevice) | **DELETE** /push/deviceRegistrations/{device_id} | Unregister a single device for push notifications |
| [**updatePushDeviceDetails**](PushApi.md#updatePushDeviceDetails) | **GET** /push/deviceRegistrations/{device_id}/resetUpdateToken | Reset a registered device&#39;s update token |


<a name="deletePushDeviceDetails"></a>
# **deletePushDeviceDetails**
> deletePushDeviceDetails().xAblyVersion(xAblyVersion).format(format).channel(channel).deviceId(deviceId).clientId(clientId).execute();

Delete a registered device&#39;s update token

Delete a device details object.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ably;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PushApi;
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
    String channel = "channel_example"; // Filter to restrict to subscriptions associated with that channel.
    String deviceId = "deviceId_example"; // Must be set when clientId is empty, cannot be used with clientId.
    String clientId = "clientId_example"; // Must be set when deviceId is empty, cannot be used with deviceId.
    try {
      client
              .push
              .deletePushDeviceDetails()
              .xAblyVersion(xAblyVersion)
              .format(format)
              .channel(channel)
              .deviceId(deviceId)
              .clientId(clientId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#deletePushDeviceDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .push
              .deletePushDeviceDetails()
              .xAblyVersion(xAblyVersion)
              .format(format)
              .channel(channel)
              .deviceId(deviceId)
              .clientId(clientId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#deletePushDeviceDetails");
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
| **channel** | **String**| Filter to restrict to subscriptions associated with that channel. | [optional] |
| **deviceId** | **String**| Must be set when clientId is empty, cannot be used with clientId. | [optional] |
| **clientId** | **String**| Must be set when deviceId is empty, cannot be used with deviceId. | [optional] |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-msgpack, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **2XX** | OK |  -  |
| **0** | Error |  * x-ably-errorcode -  <br>  * x-ably-errormessage -  <br>  * x-ably-serverid -  <br>  |

<a name="getChannelsWithPushSubscribers"></a>
# **getChannelsWithPushSubscribers**
> List&lt;String&gt; getChannelsWithPushSubscribers().xAblyVersion(xAblyVersion).format(format).execute();

List all channels with at least one subscribed device

Returns a paginated response of channel names.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ably;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PushApi;
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
    try {
      List<String> result = client
              .push
              .getChannelsWithPushSubscribers()
              .xAblyVersion(xAblyVersion)
              .format(format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#getChannelsWithPushSubscribers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<String>> response = client
              .push
              .getChannelsWithPushSubscribers()
              .xAblyVersion(xAblyVersion)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#getChannelsWithPushSubscribers");
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

**List&lt;String&gt;**

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-msgpack, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Error |  * x-ably-errorcode -  <br>  * x-ably-errormessage -  <br>  * x-ably-serverid -  <br>  |

<a name="getPushDeviceDetails"></a>
# **getPushDeviceDetails**
> DeviceDetails getPushDeviceDetails(deviceId).xAblyVersion(xAblyVersion).format(format).execute();

Get a device registration

Get the full details of a device.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ably;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PushApi;
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
    String deviceId = "deviceId_example"; // Device's ID.
    String xAblyVersion = "xAblyVersion_example"; // The version of the API you wish to use.
    String format = "json"; // The response format you would like
    try {
      DeviceDetails result = client
              .push
              .getPushDeviceDetails(deviceId)
              .xAblyVersion(xAblyVersion)
              .format(format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#getPushDeviceDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceDetails> response = client
              .push
              .getPushDeviceDetails(deviceId)
              .xAblyVersion(xAblyVersion)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#getPushDeviceDetails");
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
| **deviceId** | **String**| Device&#39;s ID. | |
| **xAblyVersion** | **String**| The version of the API you wish to use. | [optional] |
| **format** | **String**| The response format you would like | [optional] [enum: json, jsonp, msgpack, html] |

### Return type

[**DeviceDetails**](DeviceDetails.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-msgpack, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Error |  * x-ably-errorcode -  <br>  * x-ably-errormessage -  <br>  * x-ably-serverid -  <br>  |

<a name="getPushSubscriptionsOnChannels"></a>
# **getPushSubscriptionsOnChannels**
> DeviceDetails getPushSubscriptionsOnChannels().xAblyVersion(xAblyVersion).format(format).channel(channel).deviceId(deviceId).clientId(clientId).limit(limit).execute();

List channel subscriptions

Get a list of push notification subscriptions to channels.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ably;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PushApi;
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
    String channel = "channel_example"; // Filter to restrict to subscriptions associated with that channel.
    String deviceId = "deviceId_example"; // Optional filter to restrict to devices associated with that deviceId. Cannot be used with clientId.
    String clientId = "clientId_example"; // Optional filter to restrict to devices associated with that clientId. Cannot be used with deviceId.
    Integer limit = 100; // The maximum number of records to return.
    try {
      DeviceDetails result = client
              .push
              .getPushSubscriptionsOnChannels()
              .xAblyVersion(xAblyVersion)
              .format(format)
              .channel(channel)
              .deviceId(deviceId)
              .clientId(clientId)
              .limit(limit)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#getPushSubscriptionsOnChannels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceDetails> response = client
              .push
              .getPushSubscriptionsOnChannels()
              .xAblyVersion(xAblyVersion)
              .format(format)
              .channel(channel)
              .deviceId(deviceId)
              .clientId(clientId)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#getPushSubscriptionsOnChannels");
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
| **channel** | **String**| Filter to restrict to subscriptions associated with that channel. | [optional] |
| **deviceId** | **String**| Optional filter to restrict to devices associated with that deviceId. Cannot be used with clientId. | [optional] |
| **clientId** | **String**| Optional filter to restrict to devices associated with that clientId. Cannot be used with deviceId. | [optional] |
| **limit** | **Integer**| The maximum number of records to return. | [optional] [default to 100] |

### Return type

[**DeviceDetails**](DeviceDetails.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-msgpack, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Error |  * x-ably-errorcode -  <br>  * x-ably-errormessage -  <br>  * x-ably-serverid -  <br>  |

<a name="getRegisteredPushDevices"></a>
# **getRegisteredPushDevices**
> DeviceDetails getRegisteredPushDevices().xAblyVersion(xAblyVersion).format(format).deviceId(deviceId).clientId(clientId).limit(limit).execute();

List devices registered for receiving push notifications

List of device details of devices registed for push notifications.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ably;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PushApi;
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
    String deviceId = "deviceId_example"; // Optional filter to restrict to devices associated with that deviceId.
    String clientId = "clientId_example"; // Optional filter to restrict to devices associated with that clientId.
    Integer limit = 100; // The maximum number of records to return.
    try {
      DeviceDetails result = client
              .push
              .getRegisteredPushDevices()
              .xAblyVersion(xAblyVersion)
              .format(format)
              .deviceId(deviceId)
              .clientId(clientId)
              .limit(limit)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#getRegisteredPushDevices");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceDetails> response = client
              .push
              .getRegisteredPushDevices()
              .xAblyVersion(xAblyVersion)
              .format(format)
              .deviceId(deviceId)
              .clientId(clientId)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#getRegisteredPushDevices");
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
| **deviceId** | **String**| Optional filter to restrict to devices associated with that deviceId. | [optional] |
| **clientId** | **String**| Optional filter to restrict to devices associated with that clientId. | [optional] |
| **limit** | **Integer**| The maximum number of records to return. | [optional] [default to 100] |

### Return type

[**DeviceDetails**](DeviceDetails.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-msgpack, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Error |  * x-ably-errorcode -  <br>  * x-ably-errormessage -  <br>  * x-ably-serverid -  <br>  |

<a name="patchPushDeviceDetails"></a>
# **patchPushDeviceDetails**
> DeviceDetails patchPushDeviceDetails(deviceId).xAblyVersion(xAblyVersion).format(format).deviceDetails(deviceDetails).execute();

Update a device registration

Specific attributes of an existing registration can be updated. Only clientId, metadata and push.recipient are mutable.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ably;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PushApi;
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
    String deviceId = "deviceId_example"; // Device's ID.
    String clientId = "clientId_example"; // Optional trusted client identifier for the device.
    String deviceSecret = "deviceSecret_example"; // Secret value for the device.
    String formFactor = "phone"; // Form factor of the push device.
    String id = "id_example"; // Unique identifier for the device generated by the device itself.
    Object metadata = null; // Optional metadata object for this device. The metadata for a device may only be set by clients with push-admin privileges and will be used more extensively in the future with smart notifications.
    String platform = "ios"; // Platform of the push device.
    Recipient pushRecipient = new Recipient();
    String pushState = "Active"; // the current state of the push device.
    String xAblyVersion = "xAblyVersion_example"; // The version of the API you wish to use.
    String format = "json"; // The response format you would like
    try {
      DeviceDetails result = client
              .push
              .patchPushDeviceDetails(deviceId)
              .clientId(clientId)
              .deviceSecret(deviceSecret)
              .formFactor(formFactor)
              .id(id)
              .metadata(metadata)
              .platform(platform)
              .pushRecipient(pushRecipient)
              .pushState(pushState)
              .xAblyVersion(xAblyVersion)
              .format(format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#patchPushDeviceDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceDetails> response = client
              .push
              .patchPushDeviceDetails(deviceId)
              .clientId(clientId)
              .deviceSecret(deviceSecret)
              .formFactor(formFactor)
              .id(id)
              .metadata(metadata)
              .platform(platform)
              .pushRecipient(pushRecipient)
              .pushState(pushState)
              .xAblyVersion(xAblyVersion)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#patchPushDeviceDetails");
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
| **deviceId** | **String**| Device&#39;s ID. | |
| **xAblyVersion** | **String**| The version of the API you wish to use. | [optional] |
| **format** | **String**| The response format you would like | [optional] [enum: json, jsonp, msgpack, html] |
| **deviceDetails** | [**DeviceDetails**](DeviceDetails.md)|  | [optional] |

### Return type

[**DeviceDetails**](DeviceDetails.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-msgpack, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-msgpack, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Error |  * x-ably-errorcode -  <br>  * x-ably-errormessage -  <br>  * x-ably-serverid -  <br>  |

<a name="publishPushNotificationToDevices"></a>
# **publishPushNotificationToDevices**
> publishPushNotificationToDevices().xAblyVersion(xAblyVersion).format(format).publishPushNotificationToDevicesRequest(publishPushNotificationToDevicesRequest).execute();

Publish a push notification to device(s)

A convenience endpoint to deliver a push notification payload to a single device or set of devices identified by their client identifier.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ably;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PushApi;
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
    Recipient recipient = new Recipient();
    Push push = new Push();
    String xAblyVersion = "xAblyVersion_example"; // The version of the API you wish to use.
    String format = "json"; // The response format you would like
    try {
      client
              .push
              .publishPushNotificationToDevices(recipient)
              .push(push)
              .xAblyVersion(xAblyVersion)
              .format(format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#publishPushNotificationToDevices");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .push
              .publishPushNotificationToDevices(recipient)
              .push(push)
              .xAblyVersion(xAblyVersion)
              .format(format)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#publishPushNotificationToDevices");
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
| **publishPushNotificationToDevicesRequest** | [**PublishPushNotificationToDevicesRequest**](PublishPushNotificationToDevicesRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-msgpack, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-msgpack, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **2XX** | OK |  -  |
| **0** | Error |  * x-ably-errorcode -  <br>  * x-ably-errormessage -  <br>  * x-ably-serverid -  <br>  |

<a name="putPushDeviceDetails"></a>
# **putPushDeviceDetails**
> DeviceDetails putPushDeviceDetails(deviceId).xAblyVersion(xAblyVersion).format(format).deviceDetails(deviceDetails).execute();

Update a device registration

Device registrations can be upserted (the existing registration is replaced entirely) with a PUT operation. Only clientId, metadata and push.recipient are mutable.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ably;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PushApi;
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
    String deviceId = "deviceId_example"; // Device's ID.
    String clientId = "clientId_example"; // Optional trusted client identifier for the device.
    String deviceSecret = "deviceSecret_example"; // Secret value for the device.
    String formFactor = "phone"; // Form factor of the push device.
    String id = "id_example"; // Unique identifier for the device generated by the device itself.
    Object metadata = null; // Optional metadata object for this device. The metadata for a device may only be set by clients with push-admin privileges and will be used more extensively in the future with smart notifications.
    String platform = "ios"; // Platform of the push device.
    Recipient pushRecipient = new Recipient();
    String pushState = "Active"; // the current state of the push device.
    String xAblyVersion = "xAblyVersion_example"; // The version of the API you wish to use.
    String format = "json"; // The response format you would like
    try {
      DeviceDetails result = client
              .push
              .putPushDeviceDetails(deviceId)
              .clientId(clientId)
              .deviceSecret(deviceSecret)
              .formFactor(formFactor)
              .id(id)
              .metadata(metadata)
              .platform(platform)
              .pushRecipient(pushRecipient)
              .pushState(pushState)
              .xAblyVersion(xAblyVersion)
              .format(format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#putPushDeviceDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceDetails> response = client
              .push
              .putPushDeviceDetails(deviceId)
              .clientId(clientId)
              .deviceSecret(deviceSecret)
              .formFactor(formFactor)
              .id(id)
              .metadata(metadata)
              .platform(platform)
              .pushRecipient(pushRecipient)
              .pushState(pushState)
              .xAblyVersion(xAblyVersion)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#putPushDeviceDetails");
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
| **deviceId** | **String**| Device&#39;s ID. | |
| **xAblyVersion** | **String**| The version of the API you wish to use. | [optional] |
| **format** | **String**| The response format you would like | [optional] [enum: json, jsonp, msgpack, html] |
| **deviceDetails** | [**DeviceDetails**](DeviceDetails.md)|  | [optional] |

### Return type

[**DeviceDetails**](DeviceDetails.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-msgpack, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-msgpack, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Error |  * x-ably-errorcode -  <br>  * x-ably-errormessage -  <br>  * x-ably-serverid -  <br>  |

<a name="registerPushDevice"></a>
# **registerPushDevice**
> DeviceDetails registerPushDevice().xAblyVersion(xAblyVersion).format(format).deviceDetails(deviceDetails).execute();

Register a device for receiving push notifications

Register a device’s details, including the information necessary to deliver push notifications to it. Requires \&quot;push-admin\&quot; capability.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ably;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PushApi;
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
    String clientId = "clientId_example"; // Optional trusted client identifier for the device.
    String deviceSecret = "deviceSecret_example"; // Secret value for the device.
    String formFactor = "phone"; // Form factor of the push device.
    String id = "id_example"; // Unique identifier for the device generated by the device itself.
    Object metadata = null; // Optional metadata object for this device. The metadata for a device may only be set by clients with push-admin privileges and will be used more extensively in the future with smart notifications.
    String platform = "ios"; // Platform of the push device.
    Recipient pushRecipient = new Recipient();
    String pushState = "Active"; // the current state of the push device.
    String xAblyVersion = "xAblyVersion_example"; // The version of the API you wish to use.
    String format = "json"; // The response format you would like
    try {
      DeviceDetails result = client
              .push
              .registerPushDevice()
              .clientId(clientId)
              .deviceSecret(deviceSecret)
              .formFactor(formFactor)
              .id(id)
              .metadata(metadata)
              .platform(platform)
              .pushRecipient(pushRecipient)
              .pushState(pushState)
              .xAblyVersion(xAblyVersion)
              .format(format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#registerPushDevice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceDetails> response = client
              .push
              .registerPushDevice()
              .clientId(clientId)
              .deviceSecret(deviceSecret)
              .formFactor(formFactor)
              .id(id)
              .metadata(metadata)
              .platform(platform)
              .pushRecipient(pushRecipient)
              .pushState(pushState)
              .xAblyVersion(xAblyVersion)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#registerPushDevice");
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
| **deviceDetails** | [**DeviceDetails**](DeviceDetails.md)|  | [optional] |

### Return type

[**DeviceDetails**](DeviceDetails.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-msgpack
 - **Accept**: application/json, application/x-msgpack, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Error |  * x-ably-errorcode -  <br>  * x-ably-errormessage -  <br>  * x-ably-serverid -  <br>  |

<a name="subscribePushDeviceToChannel"></a>
# **subscribePushDeviceToChannel**
> subscribePushDeviceToChannel().xAblyVersion(xAblyVersion).format(format).body(body).execute();

Subscribe a device to a channel

Subscribe either a single device or all devices associated with a client ID to receive push notifications from messages sent to a channel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ably;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PushApi;
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
    try {
      client
              .push
              .subscribePushDeviceToChannel()
              .xAblyVersion(xAblyVersion)
              .format(format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#subscribePushDeviceToChannel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .push
              .subscribePushDeviceToChannel()
              .xAblyVersion(xAblyVersion)
              .format(format)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#subscribePushDeviceToChannel");
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
| **body** | **Object**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-msgpack, application/x-www-form-urlencoded
 - **Accept**: application/json, application/x-msgpack, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **2XX** | OK |  -  |
| **0** | Error |  * x-ably-errorcode -  <br>  * x-ably-errormessage -  <br>  * x-ably-serverid -  <br>  |

<a name="unregisterAllPushDevices"></a>
# **unregisterAllPushDevices**
> unregisterAllPushDevices().xAblyVersion(xAblyVersion).format(format).deviceId(deviceId).clientId(clientId).execute();

Unregister matching devices for push notifications

Unregisters devices. All their subscriptions for receiving push notifications through channels will also be deleted.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ably;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PushApi;
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
    String deviceId = "deviceId_example"; // Optional filter to restrict to devices associated with that deviceId. Cannot be used with clientId.
    String clientId = "clientId_example"; // Optional filter to restrict to devices associated with that clientId. Cannot be used with deviceId.
    try {
      client
              .push
              .unregisterAllPushDevices()
              .xAblyVersion(xAblyVersion)
              .format(format)
              .deviceId(deviceId)
              .clientId(clientId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#unregisterAllPushDevices");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .push
              .unregisterAllPushDevices()
              .xAblyVersion(xAblyVersion)
              .format(format)
              .deviceId(deviceId)
              .clientId(clientId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#unregisterAllPushDevices");
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
| **deviceId** | **String**| Optional filter to restrict to devices associated with that deviceId. Cannot be used with clientId. | [optional] |
| **clientId** | **String**| Optional filter to restrict to devices associated with that clientId. Cannot be used with deviceId. | [optional] |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-msgpack, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **2XX** | OK |  -  |
| **0** | Error |  * x-ably-errorcode -  <br>  * x-ably-errormessage -  <br>  * x-ably-serverid -  <br>  |

<a name="unregisterPushDevice"></a>
# **unregisterPushDevice**
> unregisterPushDevice(deviceId).xAblyVersion(xAblyVersion).format(format).execute();

Unregister a single device for push notifications

Unregisters a single device by its device ID. All its subscriptions for receiving push notifications through channels will also be deleted.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ably;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PushApi;
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
    String deviceId = "deviceId_example"; // Device's ID.
    String xAblyVersion = "xAblyVersion_example"; // The version of the API you wish to use.
    String format = "json"; // The response format you would like
    try {
      client
              .push
              .unregisterPushDevice(deviceId)
              .xAblyVersion(xAblyVersion)
              .format(format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#unregisterPushDevice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .push
              .unregisterPushDevice(deviceId)
              .xAblyVersion(xAblyVersion)
              .format(format)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#unregisterPushDevice");
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
| **deviceId** | **String**| Device&#39;s ID. | |
| **xAblyVersion** | **String**| The version of the API you wish to use. | [optional] |
| **format** | **String**| The response format you would like | [optional] [enum: json, jsonp, msgpack, html] |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-msgpack, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **2XX** | OK |  -  |
| **0** | Error |  * x-ably-errorcode -  <br>  * x-ably-errormessage -  <br>  * x-ably-serverid -  <br>  |

<a name="updatePushDeviceDetails"></a>
# **updatePushDeviceDetails**
> DeviceDetails updatePushDeviceDetails(deviceId).xAblyVersion(xAblyVersion).format(format).execute();

Reset a registered device&#39;s update token

Gets an updated device details object.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ably;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PushApi;
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
    String deviceId = "deviceId_example"; // Device's ID.
    String xAblyVersion = "xAblyVersion_example"; // The version of the API you wish to use.
    String format = "json"; // The response format you would like
    try {
      DeviceDetails result = client
              .push
              .updatePushDeviceDetails(deviceId)
              .xAblyVersion(xAblyVersion)
              .format(format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#updatePushDeviceDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeviceDetails> response = client
              .push
              .updatePushDeviceDetails(deviceId)
              .xAblyVersion(xAblyVersion)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#updatePushDeviceDetails");
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
| **deviceId** | **String**| Device&#39;s ID. | |
| **xAblyVersion** | **String**| The version of the API you wish to use. | [optional] |
| **format** | **String**| The response format you would like | [optional] [enum: json, jsonp, msgpack, html] |

### Return type

[**DeviceDetails**](DeviceDetails.md)

### Authorization

[basicAuth](../README.md#basicAuth), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-msgpack, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Error |  * x-ably-errorcode -  <br>  * x-ably-errormessage -  <br>  * x-ably-serverid -  <br>  |

