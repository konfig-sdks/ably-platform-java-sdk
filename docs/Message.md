

# Message

Message object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | The [client ID](https://www.ably.io/documentation/core-features/authentication#identified-clients) of the publisher of this message. |  [optional] |
|**connectionId** | **String** | The connection ID of the publisher of this message. |  [optional] |
|**data** | **String** | The string encoded payload, with the encoding specified below. |  [optional] |
|**encoding** | **String** | This will typically be empty as all messages received from Ably are automatically decoded client-side using this value. However, if the message encoding cannot be processed, this attribute will contain the remaining transformations not applied to the data payload. |  [optional] |
|**extras** | [**Extras**](Extras.md) |  |  [optional] |
|**id** | **String** | A Unique ID that can be specified by the publisher for [idempotent publishing](https://www.ably.io/documentation/rest/messages#idempotent). |  [optional] [readonly] |
|**name** | **String** | The event name, if provided. |  [optional] |
|**timestamp** | **Long** | Timestamp when the message was received by the Ably, as milliseconds since the epoch. |  [optional] [readonly] |



