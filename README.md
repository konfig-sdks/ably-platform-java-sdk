<div align="center">

[![Visit Ably](./header.png)](https://ably.com)

# [Ably](https://ably.com)

The [REST API specification](https://www.ably.io/documentation/rest-api) for Ably.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Ably&%20serviceName=Platform%20&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>ably-platform-java-sdk</artifactId>
  <version>1.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:ably-platform-java-sdk:1.1.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/ably-platform-java-sdk-1.1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ably;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationApi;
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
    String keyName = "keyName_example"; // The [key name](https://www.ably.io/documentation/rest-api/token-request-spec#api-key-format) comprises of the app ID and key ID of an API key.
    String xAblyVersion = "xAblyVersion_example"; // The version of the API you wish to use.
    String format = "json"; // The response format you would like
    try {
      TokenDetails result = client
              .authentication
              .requestAccessToken(keyName)
              .xAblyVersion(xAblyVersion)
              .format(format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#requestAccessToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TokenDetails> response = client
              .authentication
              .requestAccessToken(keyName)
              .xAblyVersion(xAblyVersion)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#requestAccessToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://rest.ably.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticationApi* | [**requestAccessToken**](docs/AuthenticationApi.md#requestAccessToken) | **POST** /keys/{keyName}/requestToken | Request an access token
*HistoryApi* | [**getMessagesByChannel**](docs/HistoryApi.md#getMessagesByChannel) | **GET** /channels/{channel_id}/messages | Get message history for a channel
*HistoryApi* | [**getPresenceHistoryOfChannel**](docs/HistoryApi.md#getPresenceHistoryOfChannel) | **GET** /channels/{channel_id}/presence/history | Get presence history of a channel
*PublishingApi* | [**publishMessagesToChannel**](docs/PublishingApi.md#publishMessagesToChannel) | **POST** /channels/{channel_id}/messages | Publish a message to a channel
*PushApi* | [**deletePushDeviceDetails**](docs/PushApi.md#deletePushDeviceDetails) | **DELETE** /push/channelSubscriptions | Delete a registered device&#39;s update token
*PushApi* | [**getChannelsWithPushSubscribers**](docs/PushApi.md#getChannelsWithPushSubscribers) | **GET** /push/channels | List all channels with at least one subscribed device
*PushApi* | [**getPushDeviceDetails**](docs/PushApi.md#getPushDeviceDetails) | **GET** /push/deviceRegistrations/{device_id} | Get a device registration
*PushApi* | [**getPushSubscriptionsOnChannels**](docs/PushApi.md#getPushSubscriptionsOnChannels) | **GET** /push/channelSubscriptions | List channel subscriptions
*PushApi* | [**getRegisteredPushDevices**](docs/PushApi.md#getRegisteredPushDevices) | **GET** /push/deviceRegistrations | List devices registered for receiving push notifications
*PushApi* | [**patchPushDeviceDetails**](docs/PushApi.md#patchPushDeviceDetails) | **PATCH** /push/deviceRegistrations/{device_id} | Update a device registration
*PushApi* | [**publishPushNotificationToDevices**](docs/PushApi.md#publishPushNotificationToDevices) | **POST** /push/publish | Publish a push notification to device(s)
*PushApi* | [**putPushDeviceDetails**](docs/PushApi.md#putPushDeviceDetails) | **PUT** /push/deviceRegistrations/{device_id} | Update a device registration
*PushApi* | [**registerPushDevice**](docs/PushApi.md#registerPushDevice) | **POST** /push/deviceRegistrations | Register a device for receiving push notifications
*PushApi* | [**subscribePushDeviceToChannel**](docs/PushApi.md#subscribePushDeviceToChannel) | **POST** /push/channelSubscriptions | Subscribe a device to a channel
*PushApi* | [**unregisterAllPushDevices**](docs/PushApi.md#unregisterAllPushDevices) | **DELETE** /push/deviceRegistrations | Unregister matching devices for push notifications
*PushApi* | [**unregisterPushDevice**](docs/PushApi.md#unregisterPushDevice) | **DELETE** /push/deviceRegistrations/{device_id} | Unregister a single device for push notifications
*PushApi* | [**updatePushDeviceDetails**](docs/PushApi.md#updatePushDeviceDetails) | **GET** /push/deviceRegistrations/{device_id}/resetUpdateToken | Reset a registered device&#39;s update token
*StatsApi* | [**getStats**](docs/StatsApi.md#getStats) | **GET** /stats | Retrieve usage statistics for an application
*StatsApi* | [**getTime**](docs/StatsApi.md#getTime) | **GET** /time | Get the service time
*StatusApi* | [**getMetadataOfAllChannels**](docs/StatusApi.md#getMetadataOfAllChannels) | **GET** /channels | Enumerate all active channels of the application
*StatusApi* | [**getMetadataOfChannel**](docs/StatusApi.md#getMetadataOfChannel) | **GET** /channels/{channel_id} | Get metadata of a channel
*StatusApi* | [**getPresenceOfChannel**](docs/StatusApi.md#getPresenceOfChannel) | **GET** /channels/{channel_id}/presence | Get presence of a channel


## Documentation for Models

 - [ChannelDetails](docs/ChannelDetails.md)
 - [ChannelStatus](docs/ChannelStatus.md)
 - [Error](docs/Error.md)
 - [Extras](docs/Extras.md)
 - [Message](docs/Message.md)
 - [Notification](docs/Notification.md)
 - [Occupancy](docs/Occupancy.md)
 - [PresenceMessage](docs/PresenceMessage.md)
 - [PublishPushNotificationToDevicesRequest](docs/PublishPushNotificationToDevicesRequest.md)
 - [Push](docs/Push.md)
 - [PushApns](docs/PushApns.md)
 - [PushFcm](docs/PushFcm.md)
 - [PushWeb](docs/PushWeb.md)
 - [Recipient](docs/Recipient.md)
 - [SignedTokenRequest](docs/SignedTokenRequest.md)
 - [SignedTokenRequestAllOf](docs/SignedTokenRequestAllOf.md)
 - [TokenRequest](docs/TokenRequest.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
