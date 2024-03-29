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
 * OxideConcentrationDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-07T06:47:05.458Z")
public class OxideConcentrationDTO {
  @SerializedName("aliquotName")
  private String aliquotName = null;

  @SerializedName("concentration")
  private Float concentration = null;

  @SerializedName("error")
  private Float error = null;

  @SerializedName("gcdataPointId")
  private Long gcdataPointId = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("oxideId")
  private Long oxideId = null;

  @SerializedName("oxideName")
  private String oxideName = null;

  @SerializedName("relativeOperatorId")
  private Long relativeOperatorId = null;

  @SerializedName("relativeOperatorName")
  private String relativeOperatorName = null;

  @SerializedName("spotID")
  private String spotID = null;

  public OxideConcentrationDTO aliquotName(String aliquotName) {
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

  public OxideConcentrationDTO concentration(Float concentration) {
    this.concentration = concentration;
    return this;
  }

   /**
   * Get concentration
   * @return concentration
  **/
  @ApiModelProperty(value = "")
  public Float getConcentration() {
    return concentration;
  }

  public void setConcentration(Float concentration) {
    this.concentration = concentration;
  }

  public OxideConcentrationDTO error(Float error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  public Float getError() {
    return error;
  }

  public void setError(Float error) {
    this.error = error;
  }

  public OxideConcentrationDTO gcdataPointId(Long gcdataPointId) {
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

  public OxideConcentrationDTO id(Long id) {
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

  public OxideConcentrationDTO oxideId(Long oxideId) {
    this.oxideId = oxideId;
    return this;
  }

   /**
   * Get oxideId
   * @return oxideId
  **/
  @ApiModelProperty(value = "")
  public Long getOxideId() {
    return oxideId;
  }

  public void setOxideId(Long oxideId) {
    this.oxideId = oxideId;
  }

  public OxideConcentrationDTO oxideName(String oxideName) {
    this.oxideName = oxideName;
    return this;
  }

   /**
   * Get oxideName
   * @return oxideName
  **/
  @ApiModelProperty(value = "")
  public String getOxideName() {
    return oxideName;
  }

  public void setOxideName(String oxideName) {
    this.oxideName = oxideName;
  }

  public OxideConcentrationDTO relativeOperatorId(Long relativeOperatorId) {
    this.relativeOperatorId = relativeOperatorId;
    return this;
  }

   /**
   * Get relativeOperatorId
   * @return relativeOperatorId
  **/
  @ApiModelProperty(value = "")
  public Long getRelativeOperatorId() {
    return relativeOperatorId;
  }

  public void setRelativeOperatorId(Long relativeOperatorId) {
    this.relativeOperatorId = relativeOperatorId;
  }

  public OxideConcentrationDTO relativeOperatorName(String relativeOperatorName) {
    this.relativeOperatorName = relativeOperatorName;
    return this;
  }

   /**
   * Get relativeOperatorName
   * @return relativeOperatorName
  **/
  @ApiModelProperty(value = "")
  public String getRelativeOperatorName() {
    return relativeOperatorName;
  }

  public void setRelativeOperatorName(String relativeOperatorName) {
    this.relativeOperatorName = relativeOperatorName;
  }

  public OxideConcentrationDTO spotID(String spotID) {
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
    OxideConcentrationDTO oxideConcentrationDTO = (OxideConcentrationDTO) o;
    return Objects.equals(this.aliquotName, oxideConcentrationDTO.aliquotName) &&
        Objects.equals(this.concentration, oxideConcentrationDTO.concentration) &&
        Objects.equals(this.error, oxideConcentrationDTO.error) &&
        Objects.equals(this.gcdataPointId, oxideConcentrationDTO.gcdataPointId) &&
        Objects.equals(this.id, oxideConcentrationDTO.id) &&
        Objects.equals(this.oxideId, oxideConcentrationDTO.oxideId) &&
        Objects.equals(this.oxideName, oxideConcentrationDTO.oxideName) &&
        Objects.equals(this.relativeOperatorId, oxideConcentrationDTO.relativeOperatorId) &&
        Objects.equals(this.relativeOperatorName, oxideConcentrationDTO.relativeOperatorName) &&
        Objects.equals(this.spotID, oxideConcentrationDTO.spotID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliquotName, concentration, error, gcdataPointId, id, oxideId, oxideName, relativeOperatorId, relativeOperatorName, spotID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OxideConcentrationDTO {\n");
    
    sb.append("    aliquotName: ").append(toIndentedString(aliquotName)).append("\n");
    sb.append("    concentration: ").append(toIndentedString(concentration)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    gcdataPointId: ").append(toIndentedString(gcdataPointId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    oxideId: ").append(toIndentedString(oxideId)).append("\n");
    sb.append("    oxideName: ").append(toIndentedString(oxideName)).append("\n");
    sb.append("    relativeOperatorId: ").append(toIndentedString(relativeOperatorId)).append("\n");
    sb.append("    relativeOperatorName: ").append(toIndentedString(relativeOperatorName)).append("\n");
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

