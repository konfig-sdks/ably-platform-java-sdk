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
 * Notification
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Notification {
  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_COLLAPSE_KEY = "collapseKey";
  @SerializedName(SERIALIZED_NAME_COLLAPSE_KEY)
  private String collapseKey;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon;

  public static final String SERIALIZED_NAME_SOUND = "sound";
  @SerializedName(SERIALIZED_NAME_SOUND)
  private String sound;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public Notification() {
  }

  public Notification body(String body) {
    
    
    
    
    this.body = body;
    return this;
  }

   /**
   * Text below title on the expanded notification.
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text below title on the expanded notification.")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    
    
    
    this.body = body;
  }


  public Notification collapseKey(String collapseKey) {
    
    
    
    
    this.collapseKey = collapseKey;
    return this;
  }

   /**
   * Platform-specific, used to group notifications together.
   * @return collapseKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Platform-specific, used to group notifications together.")

  public String getCollapseKey() {
    return collapseKey;
  }


  public void setCollapseKey(String collapseKey) {
    
    
    
    this.collapseKey = collapseKey;
  }


  public Notification icon(String icon) {
    
    
    
    
    this.icon = icon;
    return this;
  }

   /**
   * Platform-specific icon for the notification.
   * @return icon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Platform-specific icon for the notification.")

  public String getIcon() {
    return icon;
  }


  public void setIcon(String icon) {
    
    
    
    this.icon = icon;
  }


  public Notification sound(String sound) {
    
    
    
    
    this.sound = sound;
    return this;
  }

   /**
   * Platform-specific sound for the notification.
   * @return sound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Platform-specific sound for the notification.")

  public String getSound() {
    return sound;
  }


  public void setSound(String sound) {
    
    
    
    this.sound = sound;
  }


  public Notification title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * Title to display at the notification.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title to display at the notification.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
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
   * @return the Notification instance itself
   */
  public Notification putAdditionalProperty(String key, Object value) {
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
    Notification notification = (Notification) o;
    return Objects.equals(this.body, notification.body) &&
        Objects.equals(this.collapseKey, notification.collapseKey) &&
        Objects.equals(this.icon, notification.icon) &&
        Objects.equals(this.sound, notification.sound) &&
        Objects.equals(this.title, notification.title)&&
        Objects.equals(this.additionalProperties, notification.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, collapseKey, icon, sound, title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    collapseKey: ").append(toIndentedString(collapseKey)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    sound: ").append(toIndentedString(sound)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("body");
    openapiFields.add("collapseKey");
    openapiFields.add("icon");
    openapiFields.add("sound");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Notification
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Notification.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Notification is not found in the empty JSON string", Notification.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("body") != null && !jsonObj.get("body").isJsonNull()) && !jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if ((jsonObj.get("collapseKey") != null && !jsonObj.get("collapseKey").isJsonNull()) && !jsonObj.get("collapseKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collapseKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collapseKey").toString()));
      }
      if ((jsonObj.get("icon") != null && !jsonObj.get("icon").isJsonNull()) && !jsonObj.get("icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon").toString()));
      }
      if ((jsonObj.get("sound") != null && !jsonObj.get("sound").isJsonNull()) && !jsonObj.get("sound").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sound` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sound").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Notification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Notification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Notification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Notification.class));

       return (TypeAdapter<T>) new TypeAdapter<Notification>() {
           @Override
           public void write(JsonWriter out, Notification value) throws IOException {
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
           public Notification read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Notification instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Notification given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Notification
  * @throws IOException if the JSON string is invalid with respect to Notification
  */
  public static Notification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Notification.class);
  }

 /**
  * Convert an instance of Notification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
