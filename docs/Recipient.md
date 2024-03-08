

# Recipient

Push recipient details for a device.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | Client ID of recipient |  [optional] |
|**deviceId** | **String** | Client ID of recipient |  [optional] |
|**deviceToken** | **String** | when using APNs, specifies the required device token. |  [optional] |
|**registrationToken** | **String** | when using GCM or FCM, specifies the required registration token. |  [optional] |
|**transportType** | [**TransportTypeEnum**](#TransportTypeEnum) | Defines which push platform is being used. |  [optional] |



## Enum: TransportTypeEnum

| Name | Value |
|---- | -----|
| APNS | &quot;apns&quot; |
| FCM | &quot;fcm&quot; |
| GCM | &quot;gcm&quot; |



