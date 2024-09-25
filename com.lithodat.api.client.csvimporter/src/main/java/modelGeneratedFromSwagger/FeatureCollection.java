/*
 * Lithosurfer API: Geochem model
 * Please have a look at the <a href=\"https://docs.google.com/presentation/d/1XcjHiopwNzasUvwC_7UZlkou82tfstEdqGZxqXITV3s/edit?usp=sharing\">High Level Docs</a> for getting the whole picture.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@lithosurfer.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package modelGeneratedFromSwagger;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import modelGeneratedFromSwagger.GeojsonLocation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FeatureCollection
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-07T06:47:05.458Z")
public class FeatureCollection {
  @SerializedName("features")
  private List<GeojsonLocation> features = null;

  @SerializedName("type")
  private String type = null;

  public FeatureCollection features(List<GeojsonLocation> features) {
    this.features = features;
    return this;
  }

  public FeatureCollection addFeaturesItem(GeojsonLocation featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<GeojsonLocation>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @ApiModelProperty(value = "")
  public List<GeojsonLocation> getFeatures() {
    return features;
  }

  public void setFeatures(List<GeojsonLocation> features) {
    this.features = features;
  }

  public FeatureCollection type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureCollection featureCollection = (FeatureCollection) o;
    return Objects.equals(this.features, featureCollection.features) &&
        Objects.equals(this.type, featureCollection.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(features, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureCollection {\n");
    
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
