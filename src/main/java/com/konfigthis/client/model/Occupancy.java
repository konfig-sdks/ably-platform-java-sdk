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
 * An Occupancy instance indicating the occupancy of a channel. For events indicating regional activity of a channel this indicates activity in that region, not global activity.
 */
@ApiModel(description = "An Occupancy instance indicating the occupancy of a channel. For events indicating regional activity of a channel this indicates activity in that region, not global activity.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Occupancy {
  public static final String SERIALIZED_NAME_PRESENCE_CONNECTIONS = "presenceConnections";
  @SerializedName(SERIALIZED_NAME_PRESENCE_CONNECTIONS)
  private Integer presenceConnections;

  public static final String SERIALIZED_NAME_PRESENCE_MEMBERS = "presenceMembers";
  @SerializedName(SERIALIZED_NAME_PRESENCE_MEMBERS)
  private Integer presenceMembers;

  public static final String SERIALIZED_NAME_PRESENCE_SUBSCRIBERS = "presenceSubscribers";
  @SerializedName(SERIALIZED_NAME_PRESENCE_SUBSCRIBERS)
  private Integer presenceSubscribers;

  public static final String SERIALIZED_NAME_PUBLISHERS = "publishers";
  @SerializedName(SERIALIZED_NAME_PUBLISHERS)
  private Integer publishers;

  public static final String SERIALIZED_NAME_SUBSCRIBERS = "subscribers";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBERS)
  private Integer subscribers;

  public Occupancy() {
  }

  public Occupancy presenceConnections(Integer presenceConnections) {
    
    
    
    
    this.presenceConnections = presenceConnections;
    return this;
  }

   /**
   * The number of connections that are authorised to enter members into the presence channel.
   * @return presenceConnections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of connections that are authorised to enter members into the presence channel.")

  public Integer getPresenceConnections() {
    return presenceConnections;
  }


  public void setPresenceConnections(Integer presenceConnections) {
    
    
    
    this.presenceConnections = presenceConnections;
  }


  public Occupancy presenceMembers(Integer presenceMembers) {
    
    
    
    
    this.presenceMembers = presenceMembers;
    return this;
  }

   /**
   * The number of members currently entered into the presence channel.
   * @return presenceMembers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of members currently entered into the presence channel.")

  public Integer getPresenceMembers() {
    return presenceMembers;
  }


  public void setPresenceMembers(Integer presenceMembers) {
    
    
    
    this.presenceMembers = presenceMembers;
  }


  public Occupancy presenceSubscribers(Integer presenceSubscribers) {
    
    
    
    
    this.presenceSubscribers = presenceSubscribers;
    return this;
  }

   /**
   * The number of connections that are authorised to subscribe to presence messages.
   * @return presenceSubscribers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of connections that are authorised to subscribe to presence messages.")

  public Integer getPresenceSubscribers() {
    return presenceSubscribers;
  }


  public void setPresenceSubscribers(Integer presenceSubscribers) {
    
    
    
    this.presenceSubscribers = presenceSubscribers;
  }


  public Occupancy publishers(Integer publishers) {
    
    
    
    
    this.publishers = publishers;
    return this;
  }

   /**
   * The number of connections attached to the channel that are authorised to publish.
   * @return publishers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of connections attached to the channel that are authorised to publish.")

  public Integer getPublishers() {
    return publishers;
  }


  public void setPublishers(Integer publishers) {
    
    
    
    this.publishers = publishers;
  }


  public Occupancy subscribers(Integer subscribers) {
    
    
    
    
    this.subscribers = subscribers;
    return this;
  }

   /**
   * The number of connections attached that are authorised to subscribe to messages.
   * @return subscribers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of connections attached that are authorised to subscribe to messages.")

  public Integer getSubscribers() {
    return subscribers;
  }


  public void setSubscribers(Integer subscribers) {
    
    
    
    this.subscribers = subscribers;
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
   * @return the Occupancy instance itself
   */
  public Occupancy putAdditionalProperty(String key, Object value) {
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
    Occupancy occupancy = (Occupancy) o;
    return Objects.equals(this.presenceConnections, occupancy.presenceConnections) &&
        Objects.equals(this.presenceMembers, occupancy.presenceMembers) &&
        Objects.equals(this.presenceSubscribers, occupancy.presenceSubscribers) &&
        Objects.equals(this.publishers, occupancy.publishers) &&
        Objects.equals(this.subscribers, occupancy.subscribers)&&
        Objects.equals(this.additionalProperties, occupancy.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presenceConnections, presenceMembers, presenceSubscribers, publishers, subscribers, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Occupancy {\n");
    sb.append("    presenceConnections: ").append(toIndentedString(presenceConnections)).append("\n");
    sb.append("    presenceMembers: ").append(toIndentedString(presenceMembers)).append("\n");
    sb.append("    presenceSubscribers: ").append(toIndentedString(presenceSubscribers)).append("\n");
    sb.append("    publishers: ").append(toIndentedString(publishers)).append("\n");
    sb.append("    subscribers: ").append(toIndentedString(subscribers)).append("\n");
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
    openapiFields.add("presenceConnections");
    openapiFields.add("presenceMembers");
    openapiFields.add("presenceSubscribers");
    openapiFields.add("publishers");
    openapiFields.add("subscribers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Occupancy
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Occupancy.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Occupancy is not found in the empty JSON string", Occupancy.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Occupancy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Occupancy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Occupancy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Occupancy.class));

       return (TypeAdapter<T>) new TypeAdapter<Occupancy>() {
           @Override
           public void write(JsonWriter out, Occupancy value) throws IOException {
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
           public Occupancy read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Occupancy instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Occupancy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Occupancy
  * @throws IOException if the JSON string is invalid with respect to Occupancy
  */
  public static Occupancy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Occupancy.class);
  }

 /**
  * Convert an instance of Occupancy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

