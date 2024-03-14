package io.lithosurfer.client.scripts.dtos;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * A DTO for the {@link com.lithodat.app.domain.Sample} entity.
 */
public class SampleDTO implements Serializable {

	private static final long serialVersionUID = -974251828229860241L;


	private Long id;

    
    private String name;

    private String description;

    private String sampleID;

    
    private String doi;

    private Instant doiMintingTimestamp;

    
    private String igsn;

    private String igsnHandleURL;

    private Instant igsnMintingTimestamp;

    /**
     * YYYY-MM-DD
     */
    private String collectDateMin;

    /**
     * YYYY-MM-DD
     */
    private String collectDateMax;

    /**
     * The id of the data in the external system the data comes from (= source system).
     */
    
    @ApiModelProperty(value = "The id of the data in the external system the data comes from (= source system).")
    private String sourceId;

    /**
     * The elevation of the Location relative to the reference elevation in meters. Positive if above negative if below.
     */
    @ApiModelProperty(value = "The elevation of the Location relative to the reference elevation in meters. Positive if above negative if below.")
    private Float relativeElevationMin;

    private Float relativeElevationMax;

    /**
     * The accuracy in of relativeElevation in meters. E.g. relativeElevation=300 and relativeElevation=50 means Location can anywhere between 250 and 350.
     */
    @ApiModelProperty(value = "The accuracy in of relativeElevation in meters. E.g. relativeElevation=300 and relativeElevation=50 means Location can anywhere between 250 and 350.")
    private Float relativeElevationAccuracy;

    /**
     * Notes can be taken for the reference level. In particular useful if reference elevation kind is \"OTHER\".
     */
    @ApiModelProperty(value = "Notes can be taken for the reference level. In particular useful if reference elevation kind is \"OTHER\".")
    private String referenceElevationKindNote;

    /**
     * The elevation of a reference level (e.g. ground level). Elevation is relative to sea level in meters.
     */
    @ApiModelProperty(value = "The elevation of a reference level (e.g. ground level). Elevation is relative to sea level in meters.")
    private Float referenceElevation;

    /**
     * [SOURCE, API_LOOKUP] API_LOOKUP most likely only used, when reference elevation kind is \"GROUND_LEVEL\".
     */
    private String archiveNote;

    private Float rockUnitAgeMin;

    private Float rockUnitAgeMax;

    private String rockUnitAgeDescription;

    private Instant createdTimestamp;

    private Instant lastEditedTimestamp;

    private Instant deletedTimestamp;


    private Long materialId;

    private String materialName;

    private Long doiMintedById;

    private Long createdById;

    private Long lastEditedById;

    private Long deletedById;

    private Long locationKindId;

    private String locationKindName;

    private Long sampleKindId;

    private String sampleKindName;

    private Long elevationGeodicDatumId;

    private String elevationGeodicDatumName;

    private Long depthKindId;

    private String depthKindName;

    private Long sampleMethodId;

    private String sampleMethodName;

    private Long referenceElevationKindId;

    private String referenceElevationKindName;

    private Long archiveId;

    private String archiveName;

    private Long stratographicUnitId;

    private String stratographicUnitName;

    private Long locationId;

    private String locationName;

    private Long dataPackageId;

    private String dataPackageName;

    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSampleID() {
        return sampleID;
    }

    public void setSampleID(String sampleID) {
        this.sampleID = sampleID;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public Instant getDoiMintingTimestamp() {
        return doiMintingTimestamp;
    }

    public void setDoiMintingTimestamp(Instant doiMintingTimestamp) {
        this.doiMintingTimestamp = doiMintingTimestamp;
    }

    public String getIgsn() {
        return igsn;
    }

    public void setIgsn(String igsn) {
        this.igsn = igsn;
    }

    public String getIgsnHandleURL() {
        return igsnHandleURL;
    }

    public void setIgsnHandleURL(String igsnHandleURL) {
        this.igsnHandleURL = igsnHandleURL;
    }

    public Instant getIgsnMintingTimestamp() {
        return igsnMintingTimestamp;
    }

    public void setIgsnMintingTimestamp(Instant igsnMintingTimestamp) {
        this.igsnMintingTimestamp = igsnMintingTimestamp;
    }

    public String getCollectDateMin() {
        return collectDateMin;
    }

    public void setCollectDateMin(String collectDateMin) {
        this.collectDateMin = collectDateMin;
    }

    public String getCollectDateMax() {
        return collectDateMax;
    }

    public void setCollectDateMax(String collectDateMax) {
        this.collectDateMax = collectDateMax;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public Float getRelativeElevationMin() {
        return relativeElevationMin;
    }

    public void setRelativeElevationMin(Float relativeElevationMin) {
        this.relativeElevationMin = relativeElevationMin;
    }

    public Float getRelativeElevationMax() {
        return relativeElevationMax;
    }

    public void setRelativeElevationMax(Float relativeElevationMax) {
        this.relativeElevationMax = relativeElevationMax;
    }

    public Float getRelativeElevationAccuracy() {
        return relativeElevationAccuracy;
    }

    public void setRelativeElevationAccuracy(Float relativeElevationAccuracy) {
        this.relativeElevationAccuracy = relativeElevationAccuracy;
    }

    public String getReferenceElevationKindNote() {
        return referenceElevationKindNote;
    }

    public void setReferenceElevationKindNote(String referenceElevationKindNote) {
        this.referenceElevationKindNote = referenceElevationKindNote;
    }

    public Float getReferenceElevation() {
        return referenceElevation;
    }

    public void setReferenceElevation(Float referenceElevation) {
        this.referenceElevation = referenceElevation;
    }

        public String getArchiveNote() {
        return archiveNote;
    }

    public void setArchiveNote(String archiveNote) {
        this.archiveNote = archiveNote;
    }

    public Float getRockUnitAgeMin() {
        return rockUnitAgeMin;
    }

    public void setRockUnitAgeMin(Float rockUnitAgeMin) {
        this.rockUnitAgeMin = rockUnitAgeMin;
    }

    public Float getRockUnitAgeMax() {
        return rockUnitAgeMax;
    }

    public void setRockUnitAgeMax(Float rockUnitAgeMax) {
        this.rockUnitAgeMax = rockUnitAgeMax;
    }

    public String getRockUnitAgeDescription() {
        return rockUnitAgeDescription;
    }

    public void setRockUnitAgeDescription(String rockUnitAgeDescription) {
        this.rockUnitAgeDescription = rockUnitAgeDescription;
    }

    public Instant getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(Instant createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    public Instant getLastEditedTimestamp() {
        return lastEditedTimestamp;
    }

    public void setLastEditedTimestamp(Instant lastEditedTimestamp) {
        this.lastEditedTimestamp = lastEditedTimestamp;
    }

    public Instant getDeletedTimestamp() {
        return deletedTimestamp;
    }

    public void setDeletedTimestamp(Instant deletedTimestamp) {
        this.deletedTimestamp = deletedTimestamp;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public Long getDoiMintedById() {
        return doiMintedById;
    }

    public void setDoiMintedById(Long lithoUserId) {
        this.doiMintedById = lithoUserId;
    }

    public Long getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Long lithoUserId) {
        this.createdById = lithoUserId;
    }

    public Long getLastEditedById() {
        return lastEditedById;
    }

    public void setLastEditedById(Long lithoUserId) {
        this.lastEditedById = lithoUserId;
    }

    public Long getDeletedById() {
        return deletedById;
    }

    public void setDeletedById(Long lithoUserId) {
        this.deletedById = lithoUserId;
    }

    public Long getLocationKindId() {
        return locationKindId;
    }

    public void setLocationKindId(Long lLocationKindId) {
        this.locationKindId = lLocationKindId;
    }

    public String getLocationKindName() {
        return locationKindName;
    }

    public void setLocationKindName(String lLocationKindName) {
        this.locationKindName = lLocationKindName;
    }

    public Long getSampleKindId() {
        return sampleKindId;
    }

    public void setSampleKindId(Long lSampleKindId) {
        this.sampleKindId = lSampleKindId;
    }

    public String getSampleKindName() {
        return sampleKindName;
    }

    public void setSampleKindName(String lSampleKindName) {
        this.sampleKindName = lSampleKindName;
    }

    public Long getElevationGeodicDatumId() {
        return elevationGeodicDatumId;
    }

    public void setElevationGeodicDatumId(Long lGeodicDatumId) {
        this.elevationGeodicDatumId = lGeodicDatumId;
    }

    public String getElevationGeodicDatumName() {
        return elevationGeodicDatumName;
    }

    public void setElevationGeodicDatumName(String lGeodicDatumName) {
        this.elevationGeodicDatumName = lGeodicDatumName;
    }

    public Long getDepthKindId() {
        return depthKindId;
    }

    public void setDepthKindId(Long lDepthKindId) {
        this.depthKindId = lDepthKindId;
    }

    public String getDepthKindName() {
        return depthKindName;
    }

    public void setDepthKindName(String lDepthKindName) {
        this.depthKindName = lDepthKindName;
    }

    public Long getSampleMethodId() {
        return sampleMethodId;
    }

    public void setSampleMethodId(Long lSampleMethodId) {
        this.sampleMethodId = lSampleMethodId;
    }

    public String getSampleMethodName() {
        return sampleMethodName;
    }

    public void setSampleMethodName(String lSampleMethodName) {
        this.sampleMethodName = lSampleMethodName;
    }

    public Long getReferenceElevationKindId() {
        return referenceElevationKindId;
    }

    public void setReferenceElevationKindId(Long lElevationKindId) {
        this.referenceElevationKindId = lElevationKindId;
    }

    public String getReferenceElevationKindName() {
        return referenceElevationKindName;
    }

    public void setReferenceElevationKindName(String lElevationKindName) {
        this.referenceElevationKindName = lElevationKindName;
    }

    public Long getArchiveId() {
        return archiveId;
    }

    public void setArchiveId(Long archiveId) {
        this.archiveId = archiveId;
    }

    public String getArchiveName() {
        return archiveName;
    }

    public void setArchiveName(String archiveName) {
        this.archiveName = archiveName;
    }

    public Long getStratographicUnitId() {
        return stratographicUnitId;
    }

    public void setStratographicUnitId(Long stratigraphicUnitId) {
        this.stratographicUnitId = stratigraphicUnitId;
    }

    public String getStratographicUnitName() {
        return stratographicUnitName;
    }

    public void setStratographicUnitName(String stratigraphicUnitName) {
        this.stratographicUnitName = stratigraphicUnitName;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public Long getDataPackageId() {
        return dataPackageId;
    }

    public void setDataPackageId(Long dataPackageId) {
        this.dataPackageId = dataPackageId;
    }

    public String getDataPackageName() {
        return dataPackageName;
    }

    public void setDataPackageName(String dataPackageName) {
        this.dataPackageName = dataPackageName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SampleDTO sampleDTO = (SampleDTO) o;
        if (sampleDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), sampleDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "SampleDTO{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", sampleID='" + getSampleID() + "'" +
            ", doi='" + getDoi() + "'" +
            ", doiMintingTimestamp='" + getDoiMintingTimestamp() + "'" +
            ", igsn='" + getIgsn() + "'" +
            ", igsnHandleURL='" + getIgsnHandleURL() + "'" +
            ", igsnMintingTimestamp='" + getIgsnMintingTimestamp() + "'" +
            ", collectDateMin='" + getCollectDateMin() + "'" +
            ", collectDateMax='" + getCollectDateMax() + "'" +
            ", sourceId='" + getSourceId() + "'" +
            ", relativeElevationMin=" + getRelativeElevationMin() +
            ", relativeElevationMax=" + getRelativeElevationMax() +
            ", relativeElevationAccuracy=" + getRelativeElevationAccuracy() +
            ", referenceElevationKindNote='" + getReferenceElevationKindNote() + "'" +
            ", referenceElevation=" + getReferenceElevation() +
            ", archiveNote='" + getArchiveNote() + "'" +
            ", rockUnitAgeMin=" + getRockUnitAgeMin() +
            ", rockUnitAgeMax=" + getRockUnitAgeMax() +
            ", rockUnitAgeDescription='" + getRockUnitAgeDescription() + "'" +
            ", createdTimestamp='" + getCreatedTimestamp() + "'" +
            ", lastEditedTimestamp='" + getLastEditedTimestamp() + "'" +
            ", deletedTimestamp='" + getDeletedTimestamp() + "'" +
            ", material=" + getMaterialId() +
            ", material='" + getMaterialName() + "'" +
            ", doiMintedBy=" + getDoiMintedById() +
            ", createdBy=" + getCreatedById() +
            ", lastEditedBy=" + getLastEditedById() +
            ", deletedBy=" + getDeletedById() +
            ", locationKind=" + getLocationKindId() +
            ", locationKind='" + getLocationKindName() + "'" +
            ", sampleKind=" + getSampleKindId() +
            ", sampleKind='" + getSampleKindName() + "'" +
            ", elevationGeodicDatum=" + getElevationGeodicDatumId() +
            ", elevationGeodicDatum='" + getElevationGeodicDatumName() + "'" +
            ", depthKind=" + getDepthKindId() +
            ", depthKind='" + getDepthKindName() + "'" +
            ", sampleMethod=" + getSampleMethodId() +
            ", sampleMethod='" + getSampleMethodName() + "'" +
            ", referenceElevationKind=" + getReferenceElevationKindId() +
            ", referenceElevationKind='" + getReferenceElevationKindName() + "'" +
            ", archive=" + getArchiveId() +
            ", archive='" + getArchiveName() + "'" +
            ", stratographicUnit=" + getStratographicUnitId() +
            ", stratographicUnit='" + getStratographicUnitName() + "'" +
            ", location=" + getLocationId() +
            ", location='" + getLocationName() + "'" +
            ", dataPackage=" + getDataPackageId() +
            ", dataPackage='" + getDataPackageName() + "'" +
            "}";
    }
}
