/*
Copyright 2024 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * ParentReference describes a reference to a parent object.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T19:37:38.574271Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1beta1ParentReference {
  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private String resource;

  public V1beta1ParentReference() {
  }

  public V1beta1ParentReference group(String group) {
    this.group = group;
    return this;
  }

   /**
   * Group is the group of the object being referenced.
   * @return group
  **/
  @jakarta.annotation.Nullable
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }


  public V1beta1ParentReference name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name is the name of the object being referenced.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public V1beta1ParentReference namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace is the namespace of the object being referenced.
   * @return namespace
  **/
  @jakarta.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public V1beta1ParentReference resource(String resource) {
    this.resource = resource;
    return this;
  }

   /**
   * Resource is the resource of the object being referenced.
   * @return resource
  **/
  @jakarta.annotation.Nonnull
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1ParentReference v1beta1ParentReference = (V1beta1ParentReference) o;
    return Objects.equals(this.group, v1beta1ParentReference.group) &&
        Objects.equals(this.name, v1beta1ParentReference.name) &&
        Objects.equals(this.namespace, v1beta1ParentReference.namespace) &&
        Objects.equals(this.resource, v1beta1ParentReference.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, name, namespace, resource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1ParentReference {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
    openapiFields.add("group");
    openapiFields.add("name");
    openapiFields.add("namespace");
    openapiFields.add("resource");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("resource");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1beta1ParentReference
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1beta1ParentReference.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1beta1ParentReference is not found in the empty JSON string", V1beta1ParentReference.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1beta1ParentReference.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1beta1ParentReference` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1beta1ParentReference.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("group") != null && !jsonObj.get("group").isJsonNull()) && !jsonObj.get("group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if (!jsonObj.get("resource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta1ParentReference.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta1ParentReference' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta1ParentReference> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta1ParentReference.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta1ParentReference>() {
           @Override
           public void write(JsonWriter out, V1beta1ParentReference value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta1ParentReference read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1beta1ParentReference given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1beta1ParentReference
  * @throws IOException if the JSON string is invalid with respect to V1beta1ParentReference
  */
  public static V1beta1ParentReference fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta1ParentReference.class);
  }

 /**
  * Convert an instance of V1beta1ParentReference to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
