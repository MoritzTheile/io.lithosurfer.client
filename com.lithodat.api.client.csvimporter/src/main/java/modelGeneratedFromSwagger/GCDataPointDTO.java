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
 * GCDataPointDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-07T06:47:05.458Z")
public class GCDataPointDTO {
  @SerializedName("analysisScaleId")
  private Long analysisScaleId = null;

  @SerializedName("analysisScaleName")
  private String analysisScaleName = null;

  @SerializedName("analyticalSessionID")
  private String analyticalSessionID = null;

  @SerializedName("batchID")
  private String batchID = null;

  @SerializedName("elementErrorTypeId")
  private Long elementErrorTypeId = null;

  @SerializedName("elementErrorTypeName")
  private String elementErrorTypeName = null;

  @SerializedName("geochemAnalyticalTypeId")
  private Long geochemAnalyticalTypeId = null;

  @SerializedName("geochemAnalyticalTypeName")
  private String geochemAnalyticalTypeName = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("laicpmsid")
  private Long laicpmsid = null;

  @SerializedName("mineralId")
  private Long mineralId = null;

  @SerializedName("mineralName")
  private String mineralName = null;

  @SerializedName("mountID")
  private String mountID = null;

  @SerializedName("oxideErrorTypeId")
  private Long oxideErrorTypeId = null;

  @SerializedName("oxideErrorTypeName")
  private String oxideErrorTypeName = null;

  @SerializedName("referenceMaterialId")
  private Long referenceMaterialId = null;

  @SerializedName("referenceMaterialName")
  private String referenceMaterialName = null;

  @SerializedName("sampleType")
  private String sampleType = null;

  public GCDataPointDTO analysisScaleId(Long analysisScaleId) {
    this.analysisScaleId = analysisScaleId;
    return this;
  }

   /**
   * Get analysisScaleId
   * @return analysisScaleId
  **/
  @ApiModelProperty(value = "")
  public Long getAnalysisScaleId() {
    return analysisScaleId;
  }

  public void setAnalysisScaleId(Long analysisScaleId) {
    this.analysisScaleId = analysisScaleId;
  }

  public GCDataPointDTO analysisScaleName(String analysisScaleName) {
    this.analysisScaleName = analysisScaleName;
    return this;
  }

   /**
   * Get analysisScaleName
   * @return analysisScaleName
  **/
  @ApiModelProperty(value = "")
  public String getAnalysisScaleName() {
    return analysisScaleName;
  }

  public void setAnalysisScaleName(String analysisScaleName) {
    this.analysisScaleName = analysisScaleName;
  }

  public GCDataPointDTO analyticalSessionID(String analyticalSessionID) {
    this.analyticalSessionID = analyticalSessionID;
    return this;
  }

   /**
   * Get analyticalSessionID
   * @return analyticalSessionID
  **/
  @ApiModelProperty(value = "")
  public String getAnalyticalSessionID() {
    return analyticalSessionID;
  }

  public void setAnalyticalSessionID(String analyticalSessionID) {
    this.analyticalSessionID = analyticalSessionID;
  }

  public GCDataPointDTO batchID(String batchID) {
    this.batchID = batchID;
    return this;
  }

   /**
   * Get batchID
   * @return batchID
  **/
  @ApiModelProperty(value = "")
  public String getBatchID() {
    return batchID;
  }

  public void setBatchID(String batchID) {
    this.batchID = batchID;
  }

  public GCDataPointDTO elementErrorTypeId(Long elementErrorTypeId) {
    this.elementErrorTypeId = elementErrorTypeId;
    return this;
  }

   /**
   * Get elementErrorTypeId
   * @return elementErrorTypeId
  **/
  @ApiModelProperty(value = "")
  public Long getElementErrorTypeId() {
    return elementErrorTypeId;
  }

  public void setElementErrorTypeId(Long elementErrorTypeId) {
    this.elementErrorTypeId = elementErrorTypeId;
  }

  public GCDataPointDTO elementErrorTypeName(String elementErrorTypeName) {
    this.elementErrorTypeName = elementErrorTypeName;
    return this;
  }

   /**
   * Get elementErrorTypeName
   * @return elementErrorTypeName
  **/
  @ApiModelProperty(value = "")
  public String getElementErrorTypeName() {
    return elementErrorTypeName;
  }

  public void setElementErrorTypeName(String elementErrorTypeName) {
    this.elementErrorTypeName = elementErrorTypeName;
  }

  public GCDataPointDTO geochemAnalyticalTypeId(Long geochemAnalyticalTypeId) {
    this.geochemAnalyticalTypeId = geochemAnalyticalTypeId;
    return this;
  }

   /**
   * Get geochemAnalyticalTypeId
   * @return geochemAnalyticalTypeId
  **/
  @ApiModelProperty(value = "")
  public Long getGeochemAnalyticalTypeId() {
    return geochemAnalyticalTypeId;
  }

  public void setGeochemAnalyticalTypeId(Long geochemAnalyticalTypeId) {
    this.geochemAnalyticalTypeId = geochemAnalyticalTypeId;
  }

  public GCDataPointDTO geochemAnalyticalTypeName(String geochemAnalyticalTypeName) {
    this.geochemAnalyticalTypeName = geochemAnalyticalTypeName;
    return this;
  }

   /**
   * Get geochemAnalyticalTypeName
   * @return geochemAnalyticalTypeName
  **/
  @ApiModelProperty(value = "")
  public String getGeochemAnalyticalTypeName() {
    return geochemAnalyticalTypeName;
  }

  public void setGeochemAnalyticalTypeName(String geochemAnalyticalTypeName) {
    this.geochemAnalyticalTypeName = geochemAnalyticalTypeName;
  }

  public GCDataPointDTO id(Long id) {
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

  public GCDataPointDTO laicpmsid(Long laicpmsid) {
    this.laicpmsid = laicpmsid;
    return this;
  }

   /**
   * Get laicpmsid
   * @return laicpmsid
  **/
  @ApiModelProperty(value = "")
  public Long getLaicpmsid() {
    return laicpmsid;
  }

  public void setLaicpmsid(Long laicpmsid) {
    this.laicpmsid = laicpmsid;
  }

  public GCDataPointDTO mineralId(Long mineralId) {
    this.mineralId = mineralId;
    return this;
  }

   /**
   * Get mineralId
   * @return mineralId
  **/
  @ApiModelProperty(value = "")
  public Long getMineralId() {
    return mineralId;
  }

  public void setMineralId(Long mineralId) {
    this.mineralId = mineralId;
  }

  public GCDataPointDTO mineralName(String mineralName) {
    this.mineralName = mineralName;
    return this;
  }

   /**
   * Get mineralName
   * @return mineralName
  **/
  @ApiModelProperty(value = "")
  public String getMineralName() {
    return mineralName;
  }

  public void setMineralName(String mineralName) {
    this.mineralName = mineralName;
  }

  public GCDataPointDTO mountID(String mountID) {
    this.mountID = mountID;
    return this;
  }

   /**
   * Get mountID
   * @return mountID
  **/
  @ApiModelProperty(value = "")
  public String getMountID() {
    return mountID;
  }

  public void setMountID(String mountID) {
    this.mountID = mountID;
  }

  public GCDataPointDTO oxideErrorTypeId(Long oxideErrorTypeId) {
    this.oxideErrorTypeId = oxideErrorTypeId;
    return this;
  }

   /**
   * Get oxideErrorTypeId
   * @return oxideErrorTypeId
  **/
  @ApiModelProperty(value = "")
  public Long getOxideErrorTypeId() {
    return oxideErrorTypeId;
  }

  public void setOxideErrorTypeId(Long oxideErrorTypeId) {
    this.oxideErrorTypeId = oxideErrorTypeId;
  }

  public GCDataPointDTO oxideErrorTypeName(String oxideErrorTypeName) {
    this.oxideErrorTypeName = oxideErrorTypeName;
    return this;
  }

   /**
   * Get oxideErrorTypeName
   * @return oxideErrorTypeName
  **/
  @ApiModelProperty(value = "")
  public String getOxideErrorTypeName() {
    return oxideErrorTypeName;
  }

  public void setOxideErrorTypeName(String oxideErrorTypeName) {
    this.oxideErrorTypeName = oxideErrorTypeName;
  }

  public GCDataPointDTO referenceMaterialId(Long referenceMaterialId) {
    this.referenceMaterialId = referenceMaterialId;
    return this;
  }

   /**
   * Get referenceMaterialId
   * @return referenceMaterialId
  **/
  @ApiModelProperty(value = "")
  public Long getReferenceMaterialId() {
    return referenceMaterialId;
  }

  public void setReferenceMaterialId(Long referenceMaterialId) {
    this.referenceMaterialId = referenceMaterialId;
  }

  public GCDataPointDTO referenceMaterialName(String referenceMaterialName) {
    this.referenceMaterialName = referenceMaterialName;
    return this;
  }

   /**
   * Get referenceMaterialName
   * @return referenceMaterialName
  **/
  @ApiModelProperty(value = "")
  public String getReferenceMaterialName() {
    return referenceMaterialName;
  }

  public void setReferenceMaterialName(String referenceMaterialName) {
    this.referenceMaterialName = referenceMaterialName;
  }

  public GCDataPointDTO sampleType(String sampleType) {
    this.sampleType = sampleType;
    return this;
  }

   /**
   * Get sampleType
   * @return sampleType
  **/
  @ApiModelProperty(value = "")
  public String getSampleType() {
    return sampleType;
  }

  public void setSampleType(String sampleType) {
    this.sampleType = sampleType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCDataPointDTO gcDataPointDTO = (GCDataPointDTO) o;
    return Objects.equals(this.analysisScaleId, gcDataPointDTO.analysisScaleId) &&
        Objects.equals(this.analysisScaleName, gcDataPointDTO.analysisScaleName) &&
        Objects.equals(this.analyticalSessionID, gcDataPointDTO.analyticalSessionID) &&
        Objects.equals(this.batchID, gcDataPointDTO.batchID) &&
        Objects.equals(this.elementErrorTypeId, gcDataPointDTO.elementErrorTypeId) &&
        Objects.equals(this.elementErrorTypeName, gcDataPointDTO.elementErrorTypeName) &&
        Objects.equals(this.geochemAnalyticalTypeId, gcDataPointDTO.geochemAnalyticalTypeId) &&
        Objects.equals(this.geochemAnalyticalTypeName, gcDataPointDTO.geochemAnalyticalTypeName) &&
        Objects.equals(this.id, gcDataPointDTO.id) &&
        Objects.equals(this.laicpmsid, gcDataPointDTO.laicpmsid) &&
        Objects.equals(this.mineralId, gcDataPointDTO.mineralId) &&
        Objects.equals(this.mineralName, gcDataPointDTO.mineralName) &&
        Objects.equals(this.mountID, gcDataPointDTO.mountID) &&
        Objects.equals(this.oxideErrorTypeId, gcDataPointDTO.oxideErrorTypeId) &&
        Objects.equals(this.oxideErrorTypeName, gcDataPointDTO.oxideErrorTypeName) &&
        Objects.equals(this.referenceMaterialId, gcDataPointDTO.referenceMaterialId) &&
        Objects.equals(this.referenceMaterialName, gcDataPointDTO.referenceMaterialName) &&
        Objects.equals(this.sampleType, gcDataPointDTO.sampleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisScaleId, analysisScaleName, analyticalSessionID, batchID, elementErrorTypeId, elementErrorTypeName, geochemAnalyticalTypeId, geochemAnalyticalTypeName, id, laicpmsid, mineralId, mineralName, mountID, oxideErrorTypeId, oxideErrorTypeName, referenceMaterialId, referenceMaterialName, sampleType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCDataPointDTO {\n");
    
    sb.append("    analysisScaleId: ").append(toIndentedString(analysisScaleId)).append("\n");
    sb.append("    analysisScaleName: ").append(toIndentedString(analysisScaleName)).append("\n");
    sb.append("    analyticalSessionID: ").append(toIndentedString(analyticalSessionID)).append("\n");
    sb.append("    batchID: ").append(toIndentedString(batchID)).append("\n");
    sb.append("    elementErrorTypeId: ").append(toIndentedString(elementErrorTypeId)).append("\n");
    sb.append("    elementErrorTypeName: ").append(toIndentedString(elementErrorTypeName)).append("\n");
    sb.append("    geochemAnalyticalTypeId: ").append(toIndentedString(geochemAnalyticalTypeId)).append("\n");
    sb.append("    geochemAnalyticalTypeName: ").append(toIndentedString(geochemAnalyticalTypeName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    laicpmsid: ").append(toIndentedString(laicpmsid)).append("\n");
    sb.append("    mineralId: ").append(toIndentedString(mineralId)).append("\n");
    sb.append("    mineralName: ").append(toIndentedString(mineralName)).append("\n");
    sb.append("    mountID: ").append(toIndentedString(mountID)).append("\n");
    sb.append("    oxideErrorTypeId: ").append(toIndentedString(oxideErrorTypeId)).append("\n");
    sb.append("    oxideErrorTypeName: ").append(toIndentedString(oxideErrorTypeName)).append("\n");
    sb.append("    referenceMaterialId: ").append(toIndentedString(referenceMaterialId)).append("\n");
    sb.append("    referenceMaterialName: ").append(toIndentedString(referenceMaterialName)).append("\n");
    sb.append("    sampleType: ").append(toIndentedString(sampleType)).append("\n");
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

