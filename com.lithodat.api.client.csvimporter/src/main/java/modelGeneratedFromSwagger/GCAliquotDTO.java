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
 * GCAliquotDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-07T06:47:05.458Z")
public class GCAliquotDTO {
  @SerializedName("aliquotName")
  private String aliquotName = null;

  @SerializedName("domainId")
  private Long domainId = null;

  @SerializedName("domainName")
  private String domainName = null;

  @SerializedName("gcdataPointId")
  private Long gcdataPointId = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("oxideTotal")
  private Float oxideTotal = null;

  @SerializedName("spotID")
  private String spotID = null;

  public GCAliquotDTO aliquotName(String aliquotName) {
    this.aliquotName = aliquotName;
    return this;
  }

   /**
   * Get aliquotName
   * @return aliquotName
  **/
  @ApiModelProperty(value = "")
  public String getAliquotName() {
    return aliquotName;
  }

  public void setAliquotName(String aliquotName) {
    this.aliquotName = aliquotName;
  }

  public GCAliquotDTO domainId(Long domainId) {
    this.domainId = domainId;
    return this;
  }

   /**
   * Get domainId
   * @return domainId
  **/
  @ApiModelProperty(value = "")
  public Long getDomainId() {
    return domainId;
  }

  public void setDomainId(Long domainId) {
    this.domainId = domainId;
  }

  public GCAliquotDTO domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

   /**
   * Get domainName
   * @return domainName
  **/
  @ApiModelProperty(value = "")
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  public GCAliquotDTO gcdataPointId(Long gcdataPointId) {
    this.gcdataPointId = gcdataPointId;
    return this;
  }

   /**
   * Get gcdataPointId
   * @return gcdataPointId
  **/
  @ApiModelProperty(value = "")
  public Long getGcdataPointId() {
    return gcdataPointId;
  }

  public void setGcdataPointId(Long gcdataPointId) {
    this.gcdataPointId = gcdataPointId;
  }

  public GCAliquotDTO id(Long id) {
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

  public GCAliquotDTO oxideTotal(Float oxideTotal) {
    this.oxideTotal = oxideTotal;
    return this;
  }

   /**
   * Get oxideTotal
   * @return oxideTotal
  **/
  @ApiModelProperty(value = "")
  public Float getOxideTotal() {
    return oxideTotal;
  }

  public void setOxideTotal(Float oxideTotal) {
    this.oxideTotal = oxideTotal;
  }

  public GCAliquotDTO spotID(String spotID) {
    this.spotID = spotID;
    return this;
  }

   /**
   * Get spotID
   * @return spotID
  **/
  @ApiModelProperty(value = "")
  public String getSpotID() {
    return spotID;
  }

  public void setSpotID(String spotID) {
    this.spotID = spotID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCAliquotDTO gcAliquotDTO = (GCAliquotDTO) o;
    return Objects.equals(this.aliquotName, gcAliquotDTO.aliquotName) &&
        Objects.equals(this.domainId, gcAliquotDTO.domainId) &&
        Objects.equals(this.domainName, gcAliquotDTO.domainName) &&
        Objects.equals(this.gcdataPointId, gcAliquotDTO.gcdataPointId) &&
        Objects.equals(this.id, gcAliquotDTO.id) &&
        Objects.equals(this.oxideTotal, gcAliquotDTO.oxideTotal) &&
        Objects.equals(this.spotID, gcAliquotDTO.spotID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliquotName, domainId, domainName, gcdataPointId, id, oxideTotal, spotID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCAliquotDTO {\n");
    
    sb.append("    aliquotName: ").append(toIndentedString(aliquotName)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    gcdataPointId: ").append(toIndentedString(gcdataPointId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    oxideTotal: ").append(toIndentedString(oxideTotal)).append("\n");
    sb.append("    spotID: ").append(toIndentedString(spotID)).append("\n");
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

