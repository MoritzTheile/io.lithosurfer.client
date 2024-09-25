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
import java.time.Instant;

/**
 * The smallest correlated piece of scientific data(e.g. an analytic result of a sample).
 */
@ApiModel(description = "The smallest correlated piece of scientific data(e.g. an analytic result of a sample).")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-07T06:47:05.458Z")
public class DataPointDTO {
  @SerializedName("ageDataPointId")
  private Long ageDataPointId = null;

  @SerializedName("analyticalMethodId")
  private Long analyticalMethodId = null;

  @SerializedName("analyticalMethodName")
  private String analyticalMethodName = null;

  @SerializedName("createdById")
  private Long createdById = null;

  @SerializedName("createdTimestamp")
  private Instant createdTimestamp = null;

  @SerializedName("dataEntityId")
  private Long dataEntityId = null;

  @SerializedName("dataPackageId")
  private Long dataPackageId = null;

  @SerializedName("dataPackageName")
  private String dataPackageName = null;

  /**
   * Gets or Sets dataStructure
   */
  @JsonAdapter(DataStructureEnum.Adapter.class)
  public enum DataStructureEnum {
    SIMPLE("SIMPLE"),
    
    UPB_SHRIMP("UPB_SHRIMP"),
    
    VITRINITE("VITRINITE"),
    
    AGE("AGE"),
    
    FT_RAW("FT_RAW"),
    
    FT("FT"),
    
    HE("HE"),
    
    GC("GC"),
    
    UPB("UPB"),
    
    TH("TH");

    private String value;

    DataStructureEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DataStructureEnum fromValue(String text) {
      for (DataStructureEnum b : DataStructureEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DataStructureEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DataStructureEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DataStructureEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DataStructureEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("dataStructure")
  private DataStructureEnum dataStructure = null;

  @SerializedName("datasetID")
  private String datasetID = null;

  @SerializedName("deletedById")
  private Long deletedById = null;

  @SerializedName("deletedTimestamp")
  private Instant deletedTimestamp = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("externalDataHref")
  private String externalDataHref = null;

  @SerializedName("ftdataPointId")
  private Long ftdataPointId = null;

  @SerializedName("gcdataPointId")
  private Long gcdataPointId = null;

  @SerializedName("heDataPointId")
  private Long heDataPointId = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("lastEditedById")
  private Long lastEditedById = null;

  @SerializedName("lastEditedTimestamp")
  private Instant lastEditedTimestamp = null;

  @SerializedName("locationId")
  private Long locationId = null;

  @SerializedName("locationName")
  private String locationName = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("sampleId")
  private Long sampleId = null;

  @SerializedName("sampleName")
  private String sampleName = null;

  @SerializedName("shrimpdataPointId")
  private Long shrimpdataPointId = null;

  @SerializedName("sourceId")
  private String sourceId = null;

  @SerializedName("thdataPointId")
  private Long thdataPointId = null;

  @SerializedName("upbDataPointId")
  private Long upbDataPointId = null;

  @SerializedName("vitriniteDataPointId")
  private Long vitriniteDataPointId = null;

  public DataPointDTO ageDataPointId(Long ageDataPointId) {
    this.ageDataPointId = ageDataPointId;
    return this;
  }

   /**
   * Get ageDataPointId
   * @return ageDataPointId
  **/
  @ApiModelProperty(value = "")
  public Long getAgeDataPointId() {
    return ageDataPointId;
  }

  public void setAgeDataPointId(Long ageDataPointId) {
    this.ageDataPointId = ageDataPointId;
  }

  public DataPointDTO analyticalMethodId(Long analyticalMethodId) {
    this.analyticalMethodId = analyticalMethodId;
    return this;
  }

   /**
   * Get analyticalMethodId
   * @return analyticalMethodId
  **/
  @ApiModelProperty(value = "")
  public Long getAnalyticalMethodId() {
    return analyticalMethodId;
  }

  public void setAnalyticalMethodId(Long analyticalMethodId) {
    this.analyticalMethodId = analyticalMethodId;
  }

  public DataPointDTO analyticalMethodName(String analyticalMethodName) {
    this.analyticalMethodName = analyticalMethodName;
    return this;
  }

   /**
   * Get analyticalMethodName
   * @return analyticalMethodName
  **/
  @ApiModelProperty(value = "")
  public String getAnalyticalMethodName() {
    return analyticalMethodName;
  }

  public void setAnalyticalMethodName(String analyticalMethodName) {
    this.analyticalMethodName = analyticalMethodName;
  }

  public DataPointDTO createdById(Long createdById) {
    this.createdById = createdById;
    return this;
  }

   /**
   * Get createdById
   * @return createdById
  **/
  @ApiModelProperty(value = "")
  public Long getCreatedById() {
    return createdById;
  }

  public void setCreatedById(Long createdById) {
    this.createdById = createdById;
  }

  public DataPointDTO createdTimestamp(Instant createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

   /**
   * Get createdTimestamp
   * @return createdTimestamp
  **/
  @ApiModelProperty(value = "")
  public Instant getCreatedTimestamp() {
    return createdTimestamp;
  }

  public void setCreatedTimestamp(Instant createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }

  public DataPointDTO dataEntityId(Long dataEntityId) {
    this.dataEntityId = dataEntityId;
    return this;
  }

   /**
   * Get dataEntityId
   * @return dataEntityId
  **/
  @ApiModelProperty(value = "")
  public Long getDataEntityId() {
    return dataEntityId;
  }

  public void setDataEntityId(Long dataEntityId) {
    this.dataEntityId = dataEntityId;
  }

  public DataPointDTO dataPackageId(Long dataPackageId) {
    this.dataPackageId = dataPackageId;
    return this;
  }

   /**
   * Get dataPackageId
   * @return dataPackageId
  **/
  @ApiModelProperty(value = "")
  public Long getDataPackageId() {
    return dataPackageId;
  }

  public void setDataPackageId(Long dataPackageId) {
    this.dataPackageId = dataPackageId;
  }

  public DataPointDTO dataPackageName(String dataPackageName) {
    this.dataPackageName = dataPackageName;
    return this;
  }

   /**
   * Get dataPackageName
   * @return dataPackageName
  **/
  @ApiModelProperty(value = "")
  public String getDataPackageName() {
    return dataPackageName;
  }

  public void setDataPackageName(String dataPackageName) {
    this.dataPackageName = dataPackageName;
  }

  public DataPointDTO dataStructure(DataStructureEnum dataStructure) {
    this.dataStructure = dataStructure;
    return this;
  }

   /**
   * Get dataStructure
   * @return dataStructure
  **/
  @ApiModelProperty(value = "")
  public DataStructureEnum getDataStructure() {
    return dataStructure;
  }

  public void setDataStructure(DataStructureEnum dataStructure) {
    this.dataStructure = dataStructure;
  }

  public DataPointDTO datasetID(String datasetID) {
    this.datasetID = datasetID;
    return this;
  }

   /**
   * Get datasetID
   * @return datasetID
  **/
  @ApiModelProperty(value = "")
  public String getDatasetID() {
    return datasetID;
  }

  public void setDatasetID(String datasetID) {
    this.datasetID = datasetID;
  }

  public DataPointDTO deletedById(Long deletedById) {
    this.deletedById = deletedById;
    return this;
  }

   /**
   * Get deletedById
   * @return deletedById
  **/
  @ApiModelProperty(value = "")
  public Long getDeletedById() {
    return deletedById;
  }

  public void setDeletedById(Long deletedById) {
    this.deletedById = deletedById;
  }

  public DataPointDTO deletedTimestamp(Instant deletedTimestamp) {
    this.deletedTimestamp = deletedTimestamp;
    return this;
  }

   /**
   * Get deletedTimestamp
   * @return deletedTimestamp
  **/
  @ApiModelProperty(value = "")
  public Instant getDeletedTimestamp() {
    return deletedTimestamp;
  }

  public void setDeletedTimestamp(Instant deletedTimestamp) {
    this.deletedTimestamp = deletedTimestamp;
  }

  public DataPointDTO description(String description) {
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

  public DataPointDTO externalDataHref(String externalDataHref) {
    this.externalDataHref = externalDataHref;
    return this;
  }

   /**
   * Get externalDataHref
   * @return externalDataHref
  **/
  @ApiModelProperty(value = "")
  public String getExternalDataHref() {
    return externalDataHref;
  }

  public void setExternalDataHref(String externalDataHref) {
    this.externalDataHref = externalDataHref;
  }

  public DataPointDTO ftdataPointId(Long ftdataPointId) {
    this.ftdataPointId = ftdataPointId;
    return this;
  }

   /**
   * Get ftdataPointId
   * @return ftdataPointId
  **/
  @ApiModelProperty(value = "")
  public Long getFtdataPointId() {
    return ftdataPointId;
  }

  public void setFtdataPointId(Long ftdataPointId) {
    this.ftdataPointId = ftdataPointId;
  }

  public DataPointDTO gcdataPointId(Long gcdataPointId) {
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

  public DataPointDTO heDataPointId(Long heDataPointId) {
    this.heDataPointId = heDataPointId;
    return this;
  }

   /**
   * Get heDataPointId
   * @return heDataPointId
  **/
  @ApiModelProperty(value = "")
  public Long getHeDataPointId() {
    return heDataPointId;
  }

  public void setHeDataPointId(Long heDataPointId) {
    this.heDataPointId = heDataPointId;
  }

  public DataPointDTO id(Long id) {
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

  public DataPointDTO lastEditedById(Long lastEditedById) {
    this.lastEditedById = lastEditedById;
    return this;
  }

   /**
   * Get lastEditedById
   * @return lastEditedById
  **/
  @ApiModelProperty(value = "")
  public Long getLastEditedById() {
    return lastEditedById;
  }

  public void setLastEditedById(Long lastEditedById) {
    this.lastEditedById = lastEditedById;
  }

  public DataPointDTO lastEditedTimestamp(Instant lastEditedTimestamp) {
    this.lastEditedTimestamp = lastEditedTimestamp;
    return this;
  }

   /**
   * Get lastEditedTimestamp
   * @return lastEditedTimestamp
  **/
  @ApiModelProperty(value = "")
  public Instant getLastEditedTimestamp() {
    return lastEditedTimestamp;
  }

  public void setLastEditedTimestamp(Instant lastEditedTimestamp) {
    this.lastEditedTimestamp = lastEditedTimestamp;
  }

  public DataPointDTO locationId(Long locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * Get locationId
   * @return locationId
  **/
  @ApiModelProperty(value = "")
  public Long getLocationId() {
    return locationId;
  }

  public void setLocationId(Long locationId) {
    this.locationId = locationId;
  }

  public DataPointDTO locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

   /**
   * Get locationName
   * @return locationName
  **/
  @ApiModelProperty(value = "")
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  public DataPointDTO name(String name) {
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

  public DataPointDTO sampleId(Long sampleId) {
    this.sampleId = sampleId;
    return this;
  }

   /**
   * Get sampleId
   * @return sampleId
  **/
  @ApiModelProperty(value = "")
  public Long getSampleId() {
    return sampleId;
  }

  public void setSampleId(Long sampleId) {
    this.sampleId = sampleId;
  }

  public DataPointDTO sampleName(String sampleName) {
    this.sampleName = sampleName;
    return this;
  }

   /**
   * Get sampleName
   * @return sampleName
  **/
  @ApiModelProperty(value = "")
  public String getSampleName() {
    return sampleName;
  }

  public void setSampleName(String sampleName) {
    this.sampleName = sampleName;
  }

  public DataPointDTO shrimpdataPointId(Long shrimpdataPointId) {
    this.shrimpdataPointId = shrimpdataPointId;
    return this;
  }

   /**
   * Get shrimpdataPointId
   * @return shrimpdataPointId
  **/
  @ApiModelProperty(value = "")
  public Long getShrimpdataPointId() {
    return shrimpdataPointId;
  }

  public void setShrimpdataPointId(Long shrimpdataPointId) {
    this.shrimpdataPointId = shrimpdataPointId;
  }

  public DataPointDTO sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * The id of the data in the external system the data comes from (&#x3D; source system).
   * @return sourceId
  **/
  @ApiModelProperty(value = "The id of the data in the external system the data comes from (= source system).")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public DataPointDTO thdataPointId(Long thdataPointId) {
    this.thdataPointId = thdataPointId;
    return this;
  }

   /**
   * Get thdataPointId
   * @return thdataPointId
  **/
  @ApiModelProperty(value = "")
  public Long getThdataPointId() {
    return thdataPointId;
  }

  public void setThdataPointId(Long thdataPointId) {
    this.thdataPointId = thdataPointId;
  }

  public DataPointDTO upbDataPointId(Long upbDataPointId) {
    this.upbDataPointId = upbDataPointId;
    return this;
  }

   /**
   * Get upbDataPointId
   * @return upbDataPointId
  **/
  @ApiModelProperty(value = "")
  public Long getUpbDataPointId() {
    return upbDataPointId;
  }

  public void setUpbDataPointId(Long upbDataPointId) {
    this.upbDataPointId = upbDataPointId;
  }

  public DataPointDTO vitriniteDataPointId(Long vitriniteDataPointId) {
    this.vitriniteDataPointId = vitriniteDataPointId;
    return this;
  }

   /**
   * Get vitriniteDataPointId
   * @return vitriniteDataPointId
  **/
  @ApiModelProperty(value = "")
  public Long getVitriniteDataPointId() {
    return vitriniteDataPointId;
  }

  public void setVitriniteDataPointId(Long vitriniteDataPointId) {
    this.vitriniteDataPointId = vitriniteDataPointId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataPointDTO dataPointDTO = (DataPointDTO) o;
    return Objects.equals(this.ageDataPointId, dataPointDTO.ageDataPointId) &&
        Objects.equals(this.analyticalMethodId, dataPointDTO.analyticalMethodId) &&
        Objects.equals(this.analyticalMethodName, dataPointDTO.analyticalMethodName) &&
        Objects.equals(this.createdById, dataPointDTO.createdById) &&
        Objects.equals(this.createdTimestamp, dataPointDTO.createdTimestamp) &&
        Objects.equals(this.dataEntityId, dataPointDTO.dataEntityId) &&
        Objects.equals(this.dataPackageId, dataPointDTO.dataPackageId) &&
        Objects.equals(this.dataPackageName, dataPointDTO.dataPackageName) &&
        Objects.equals(this.dataStructure, dataPointDTO.dataStructure) &&
        Objects.equals(this.datasetID, dataPointDTO.datasetID) &&
        Objects.equals(this.deletedById, dataPointDTO.deletedById) &&
        Objects.equals(this.deletedTimestamp, dataPointDTO.deletedTimestamp) &&
        Objects.equals(this.description, dataPointDTO.description) &&
        Objects.equals(this.externalDataHref, dataPointDTO.externalDataHref) &&
        Objects.equals(this.ftdataPointId, dataPointDTO.ftdataPointId) &&
        Objects.equals(this.gcdataPointId, dataPointDTO.gcdataPointId) &&
        Objects.equals(this.heDataPointId, dataPointDTO.heDataPointId) &&
        Objects.equals(this.id, dataPointDTO.id) &&
        Objects.equals(this.lastEditedById, dataPointDTO.lastEditedById) &&
        Objects.equals(this.lastEditedTimestamp, dataPointDTO.lastEditedTimestamp) &&
        Objects.equals(this.locationId, dataPointDTO.locationId) &&
        Objects.equals(this.locationName, dataPointDTO.locationName) &&
        Objects.equals(this.name, dataPointDTO.name) &&
        Objects.equals(this.sampleId, dataPointDTO.sampleId) &&
        Objects.equals(this.sampleName, dataPointDTO.sampleName) &&
        Objects.equals(this.shrimpdataPointId, dataPointDTO.shrimpdataPointId) &&
        Objects.equals(this.sourceId, dataPointDTO.sourceId) &&
        Objects.equals(this.thdataPointId, dataPointDTO.thdataPointId) &&
        Objects.equals(this.upbDataPointId, dataPointDTO.upbDataPointId) &&
        Objects.equals(this.vitriniteDataPointId, dataPointDTO.vitriniteDataPointId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageDataPointId, analyticalMethodId, analyticalMethodName, createdById, createdTimestamp, dataEntityId, dataPackageId, dataPackageName, dataStructure, datasetID, deletedById, deletedTimestamp, description, externalDataHref, ftdataPointId, gcdataPointId, heDataPointId, id, lastEditedById, lastEditedTimestamp, locationId, locationName, name, sampleId, sampleName, shrimpdataPointId, sourceId, thdataPointId, upbDataPointId, vitriniteDataPointId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataPointDTO {\n");
    
    sb.append("    ageDataPointId: ").append(toIndentedString(ageDataPointId)).append("\n");
    sb.append("    analyticalMethodId: ").append(toIndentedString(analyticalMethodId)).append("\n");
    sb.append("    analyticalMethodName: ").append(toIndentedString(analyticalMethodName)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    dataEntityId: ").append(toIndentedString(dataEntityId)).append("\n");
    sb.append("    dataPackageId: ").append(toIndentedString(dataPackageId)).append("\n");
    sb.append("    dataPackageName: ").append(toIndentedString(dataPackageName)).append("\n");
    sb.append("    dataStructure: ").append(toIndentedString(dataStructure)).append("\n");
    sb.append("    datasetID: ").append(toIndentedString(datasetID)).append("\n");
    sb.append("    deletedById: ").append(toIndentedString(deletedById)).append("\n");
    sb.append("    deletedTimestamp: ").append(toIndentedString(deletedTimestamp)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalDataHref: ").append(toIndentedString(externalDataHref)).append("\n");
    sb.append("    ftdataPointId: ").append(toIndentedString(ftdataPointId)).append("\n");
    sb.append("    gcdataPointId: ").append(toIndentedString(gcdataPointId)).append("\n");
    sb.append("    heDataPointId: ").append(toIndentedString(heDataPointId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastEditedById: ").append(toIndentedString(lastEditedById)).append("\n");
    sb.append("    lastEditedTimestamp: ").append(toIndentedString(lastEditedTimestamp)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sampleId: ").append(toIndentedString(sampleId)).append("\n");
    sb.append("    sampleName: ").append(toIndentedString(sampleName)).append("\n");
    sb.append("    shrimpdataPointId: ").append(toIndentedString(shrimpdataPointId)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    thdataPointId: ").append(toIndentedString(thdataPointId)).append("\n");
    sb.append("    upbDataPointId: ").append(toIndentedString(upbDataPointId)).append("\n");
    sb.append("    vitriniteDataPointId: ").append(toIndentedString(vitriniteDataPointId)).append("\n");
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
