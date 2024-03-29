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
import java.io.IOException;

/**
 * DataPointMetaDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-07T06:47:05.458Z")
public class DataPointMetaDTO {
  @SerializedName("createdByName")
  private String createdByName = null;

  @SerializedName("lastEditedByName")
  private String lastEditedByName = null;

  public DataPointMetaDTO createdByName(String createdByName) {
    this.createdByName = createdByName;
    return this;
  }

   /**
   * Get createdByName
   * @return createdByName
  **/
  @ApiModelProperty(value = "")
  public String getCreatedByName() {
    return createdByName;
  }

  public void setCreatedByName(String createdByName) {
    this.createdByName = createdByName;
  }

  public DataPointMetaDTO lastEditedByName(String lastEditedByName) {
    this.lastEditedByName = lastEditedByName;
    return this;
  }

   /**
   * Get lastEditedByName
   * @return lastEditedByName
  **/
  @ApiModelProperty(value = "")
  public String getLastEditedByName() {
    return lastEditedByName;
  }

  public void setLastEditedByName(String lastEditedByName) {
    this.lastEditedByName = lastEditedByName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataPointMetaDTO dataPointMetaDTO = (DataPointMetaDTO) o;
    return Objects.equals(this.createdByName, dataPointMetaDTO.createdByName) &&
        Objects.equals(this.lastEditedByName, dataPointMetaDTO.lastEditedByName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdByName, lastEditedByName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataPointMetaDTO {\n");
    
    sb.append("    createdByName: ").append(toIndentedString(createdByName)).append("\n");
    sb.append("    lastEditedByName: ").append(toIndentedString(lastEditedByName)).append("\n");
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

