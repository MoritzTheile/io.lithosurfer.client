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
 * LGrainDomainDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-07T06:47:05.458Z")
public class LGrainDomainDTO {
  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("sortorder")
  private Float sortorder = null;

  public LGrainDomainDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LGrainDomainDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LGrainDomainDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LGrainDomainDTO sortorder(Float sortorder) {
    this.sortorder = sortorder;
    return this;
  }

   /**
   * Get sortorder
   * @return sortorder
  **/
  @ApiModelProperty(value = "")
  public Float getSortorder() {
    return sortorder;
  }

  public void setSortorder(Float sortorder) {
    this.sortorder = sortorder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LGrainDomainDTO lgrainDomainDTO = (LGrainDomainDTO) o;
    return Objects.equals(this.description, lgrainDomainDTO.description) &&
        Objects.equals(this.id, lgrainDomainDTO.id) &&
        Objects.equals(this.name, lgrainDomainDTO.name) &&
        Objects.equals(this.sortorder, lgrainDomainDTO.sortorder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, sortorder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LGrainDomainDTO {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sortorder: ").append(toIndentedString(sortorder)).append("\n");
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

