/*
 * Platform API
 * The [REST API specification](https://www.ably.io/documentation/rest-api) for Ably.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: support@ably.io
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.Error;
import com.konfigthis.client.model.Extras;
import com.konfigthis.client.model.Message;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PublishingApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PublishingApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public PublishingApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call publishMessagesToChannelCall(String channelId, String xAblyVersion, String format, Message message, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = message;

        // create path and map variables
        String localVarPath = "/channels/{channel_id}/messages"
            .replace("{" + "channel_id" + "}", localVarApiClient.escapeString(channelId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (format != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("format", format));
        }

        if (xAblyVersion != null) {
            localVarHeaderParams.put("X-Ably-Version", localVarApiClient.parameterToString(xAblyVersion));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/x-msgpack",
            "text/html"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json",
            "application/x-msgpack",
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call publishMessagesToChannelValidateBeforeCall(String channelId, String xAblyVersion, String format, Message message, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new ApiException("Missing the required parameter 'channelId' when calling publishMessagesToChannel(Async)");
        }

        return publishMessagesToChannelCall(channelId, xAblyVersion, format, message, _callback);

    }


    private ApiResponse<PublishMessagesToChannel2XXResponse> publishMessagesToChannelWithHttpInfo(String channelId, String xAblyVersion, String format, Message message) throws ApiException {
        okhttp3.Call localVarCall = publishMessagesToChannelValidateBeforeCall(channelId, xAblyVersion, format, message, null);
        Type localVarReturnType = new TypeToken<PublishMessagesToChannel2XXResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call publishMessagesToChannelAsync(String channelId, String xAblyVersion, String format, Message message, final ApiCallback<PublishMessagesToChannel2XXResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = publishMessagesToChannelValidateBeforeCall(channelId, xAblyVersion, format, message, _callback);
        Type localVarReturnType = new TypeToken<PublishMessagesToChannel2XXResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class PublishMessagesToChannelRequestBuilder {
        private final String channelId;
        private String clientId;
        private String connectionId;
        private String data;
        private String encoding;
        private Extras extras;
        private String id;
        private String name;
        private Long timestamp;
        private String xAblyVersion;
        private String format;

        private PublishMessagesToChannelRequestBuilder(String channelId) {
            this.channelId = channelId;
        }

        /**
         * Set clientId
         * @param clientId The [client ID](https://www.ably.io/documentation/core-features/authentication#identified-clients) of the publisher of this message. (optional)
         * @return PublishMessagesToChannelRequestBuilder
         */
        public PublishMessagesToChannelRequestBuilder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        
        /**
         * Set connectionId
         * @param connectionId The connection ID of the publisher of this message. (optional)
         * @return PublishMessagesToChannelRequestBuilder
         */
        public PublishMessagesToChannelRequestBuilder connectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        
        /**
         * Set data
         * @param data The string encoded payload, with the encoding specified below. (optional)
         * @return PublishMessagesToChannelRequestBuilder
         */
        public PublishMessagesToChannelRequestBuilder data(String data) {
            this.data = data;
            return this;
        }
        
        /**
         * Set encoding
         * @param encoding This will typically be empty as all messages received from Ably are automatically decoded client-side using this value. However, if the message encoding cannot be processed, this attribute will contain the remaining transformations not applied to the data payload. (optional)
         * @return PublishMessagesToChannelRequestBuilder
         */
        public PublishMessagesToChannelRequestBuilder encoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        
        /**
         * Set extras
         * @param extras  (optional)
         * @return PublishMessagesToChannelRequestBuilder
         */
        public PublishMessagesToChannelRequestBuilder extras(Extras extras) {
            this.extras = extras;
            return this;
        }
        
        /**
         * Set id
         * @param id A Unique ID that can be specified by the publisher for [idempotent publishing](https://www.ably.io/documentation/rest/messages#idempotent). (optional)
         * @return PublishMessagesToChannelRequestBuilder
         */
        public PublishMessagesToChannelRequestBuilder id(String id) {
            this.id = id;
            return this;
        }
        
        /**
         * Set name
         * @param name The event name, if provided. (optional)
         * @return PublishMessagesToChannelRequestBuilder
         */
        public PublishMessagesToChannelRequestBuilder name(String name) {
            this.name = name;
            return this;
        }
        
        /**
         * Set timestamp
         * @param timestamp Timestamp when the message was received by the Ably, as milliseconds since the epoch. (optional)
         * @return PublishMessagesToChannelRequestBuilder
         */
        public PublishMessagesToChannelRequestBuilder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        
        /**
         * Set xAblyVersion
         * @param xAblyVersion The version of the API you wish to use. (optional)
         * @return PublishMessagesToChannelRequestBuilder
         */
        public PublishMessagesToChannelRequestBuilder xAblyVersion(String xAblyVersion) {
            this.xAblyVersion = xAblyVersion;
            return this;
        }
        
        /**
         * Set format
         * @param format The response format you would like (optional)
         * @return PublishMessagesToChannelRequestBuilder
         */
        public PublishMessagesToChannelRequestBuilder format(String format) {
            this.format = format;
            return this;
        }
        
        /**
         * Build call for publishMessagesToChannel
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  * x-ably-errorcode -  <br>  * x-ably-errormessage -  <br>  * x-ably-serverid -  <br>  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            Message message = buildBodyParams();
            return publishMessagesToChannelCall(channelId, xAblyVersion, format, message, _callback);
        }

        private Message buildBodyParams() {
            Message message = new Message();
            message.clientId(this.clientId);
            message.connectionId(this.connectionId);
            message.data(this.data);
            message.encoding(this.encoding);
            message.extras(this.extras);
            message.id(this.id);
            message.name(this.name);
            message.timestamp(this.timestamp);
            return message;
        }

        /**
         * Execute publishMessagesToChannel request
         * @return PublishMessagesToChannel2XXResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  * x-ably-errorcode -  <br>  * x-ably-errormessage -  <br>  * x-ably-serverid -  <br>  </td></tr>
         </table>
         */
        public PublishMessagesToChannel2XXResponse execute() throws ApiException {
            Message message = buildBodyParams();
            ApiResponse<PublishMessagesToChannel2XXResponse> localVarResp = publishMessagesToChannelWithHttpInfo(channelId, xAblyVersion, format, message);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute publishMessagesToChannel request with HTTP info returned
         * @return ApiResponse&lt;PublishMessagesToChannel2XXResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  * x-ably-errorcode -  <br>  * x-ably-errormessage -  <br>  * x-ably-serverid -  <br>  </td></tr>
         </table>
         */
        public ApiResponse<PublishMessagesToChannel2XXResponse> executeWithHttpInfo() throws ApiException {
            Message message = buildBodyParams();
            return publishMessagesToChannelWithHttpInfo(channelId, xAblyVersion, format, message);
        }

        /**
         * Execute publishMessagesToChannel request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  * x-ably-errorcode -  <br>  * x-ably-errormessage -  <br>  * x-ably-serverid -  <br>  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PublishMessagesToChannel2XXResponse> _callback) throws ApiException {
            Message message = buildBodyParams();
            return publishMessagesToChannelAsync(channelId, xAblyVersion, format, message, _callback);
        }
    }

    /**
     * Publish a message to a channel
     * Publish a message to the specified channel
     * @param channelId The [Channel&#39;s ID](https://www.ably.io/documentation/rest/channels). (required)
     * @return PublishMessagesToChannelRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  * x-ably-errorcode -  <br>  * x-ably-errormessage -  <br>  * x-ably-serverid -  <br>  </td></tr>
     </table>
     */
    public PublishMessagesToChannelRequestBuilder publishMessagesToChannel(String channelId) throws IllegalArgumentException {
        if (channelId == null) throw new IllegalArgumentException("\"channelId\" is required but got null");
            

        return new PublishMessagesToChannelRequestBuilder(channelId);
    }
}