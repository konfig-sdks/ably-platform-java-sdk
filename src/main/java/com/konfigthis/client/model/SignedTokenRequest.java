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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * SignedTokenRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SignedTokenRequest {
  public static final String SERIALIZED_NAME_CAPABILITY = "capability";
  @SerializedName(SERIALIZED_NAME_CAPABILITY)
  private Object capability;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_KEY_NAME = "keyName";
  @SerializedName(SERIALIZED_NAME_KEY_NAME)
  private String keyName;

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private String nonce;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_MAC = "mac";
  @SerializedName(SERIALIZED_NAME_MAC)
  private String mac;

  public SignedTokenRequest() {
  }

  public SignedTokenRequest capability(Object capability) {
    
    
    
    
    this.capability = capability;
    return this;
  }

   /**
   * The [capabilities](https://www.ably.io/documentation/core-features/authentication#capabilities-explained) (i.e. a set of channel names/namespaces and, for each, a set of operations) which should be a subset of the set of capabilities associated with the key specified in keyName.
   * @return capability
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "{\"channel1\":[\"publish\",\"subscribe\"]}", required = true, value = "The [capabilities](https://www.ably.io/documentation/core-features/authentication#capabilities-explained) (i.e. a set of channel names/namespaces and, for each, a set of operations) which should be a subset of the set of capabilities associated with the key specified in keyName.")

  public Object getCapability() {
    return capability;
  }


  public void setCapability(Object capability) {
    
    
    
    this.capability = capability;
  }


  public SignedTokenRequest clientId(String clientId) {
    
    
    
    
    this.clientId = clientId;
    return this;
  }

   /**
   * The [client ID](https://www.ably.io/documentation/core-features/authentication#identified-clients) to be assosciated with the token. Can be set to * to allow for any client ID to be used.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The [client ID](https://www.ably.io/documentation/core-features/authentication#identified-clients) to be assosciated with the token. Can be set to * to allow for any client ID to be used.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    
    
    
    this.clientId = clientId;
  }


  public SignedTokenRequest keyName(String keyName) {
    
    
    
    
    this.keyName = keyName;
    return this;
  }

   /**
   * Name of the key used for the TokenRequest. The keyName comprises of the app ID and key ID on an API Key.
   * @return keyName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "xVLyHw.LMJZxw", required = true, value = "Name of the key used for the TokenRequest. The keyName comprises of the app ID and key ID on an API Key.")

  public String getKeyName() {
    return keyName;
  }


  public void setKeyName(String keyName) {
    
    
    
    this.keyName = keyName;
  }


  public SignedTokenRequest nonce(String nonce) {
    
    
    
    
    this.nonce = nonce;
    return this;
  }

   /**
   * An unquoted, un-escaped random string of at least 16 characters. Used to ensure the Ably TokenRequest cannot be reused.
   * @return nonce
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An unquoted, un-escaped random string of at least 16 characters. Used to ensure the Ably TokenRequest cannot be reused.")

  public String getNonce() {
    return nonce;
  }


  public void setNonce(String nonce) {
    
    
    
    this.nonce = nonce;
  }


  public SignedTokenRequest timestamp(Integer timestamp) {
    
    
    
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Time of creation of the Ably TokenRequest.
   * @return timestamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Time of creation of the Ably TokenRequest.")

  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    
    
    
    this.timestamp = timestamp;
  }


  public SignedTokenRequest mac(String mac) {
    
    
    
    
    this.mac = mac;
    return this;
  }

   /**
   * A signature, generated as an HMAC of each of the above components, using the key secret value.
   * @return mac
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A signature, generated as an HMAC of each of the above components, using the key secret value.")

  public String getMac() {
    return mac;
  }


  public void setMac(String mac) {
    
    
    
    this.mac = mac;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the SignedTokenRequest instance itself
   */
  public SignedTokenRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignedTokenRequest signedTokenRequest = (SignedTokenRequest) o;
    return Objects.equals(this.capability, signedTokenRequest.capability) &&
        Objects.equals(this.clientId, signedTokenRequest.clientId) &&
        Objects.equals(this.keyName, signedTokenRequest.keyName) &&
        Objects.equals(this.nonce, signedTokenRequest.nonce) &&
        Objects.equals(this.timestamp, signedTokenRequest.timestamp) &&
        Objects.equals(this.mac, signedTokenRequest.mac)&&
        Objects.equals(this.additionalProperties, signedTokenRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capability, clientId, keyName, nonce, timestamp, mac, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignedTokenRequest {\n");
    sb.append("    capability: ").append(toIndentedString(capability)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("capability");
    openapiFields.add("clientId");
    openapiFields.add("keyName");
    openapiFields.add("nonce");
    openapiFields.add("timestamp");
    openapiFields.add("mac");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("capability");
    openapiRequiredFields.add("keyName");
    openapiRequiredFields.add("nonce");
    openapiRequiredFields.add("timestamp");
    openapiRequiredFields.add("mac");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SignedTokenRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SignedTokenRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SignedTokenRequest is not found in the empty JSON string", SignedTokenRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SignedTokenRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("clientId") != null && !jsonObj.get("clientId").isJsonNull()) && !jsonObj.get("clientId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientId").toString()));
      }
      if (!jsonObj.get("keyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyName").toString()));
      }
      if (!jsonObj.get("nonce").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nonce` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nonce").toString()));
      }
      if (!jsonObj.get("mac").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mac` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mac").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SignedTokenRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SignedTokenRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SignedTokenRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SignedTokenRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SignedTokenRequest>() {
           @Override
           public void write(JsonWriter out, SignedTokenRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public SignedTokenRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SignedTokenRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SignedTokenRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SignedTokenRequest
  * @throws IOException if the JSON string is invalid with respect to SignedTokenRequest
  */
  public static SignedTokenRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SignedTokenRequest.class);
  }

 /**
  * Convert an instance of SignedTokenRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

