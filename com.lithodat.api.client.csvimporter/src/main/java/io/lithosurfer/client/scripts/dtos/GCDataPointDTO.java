package io.lithosurfer.client.scripts.dtos;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.lithodat.app.domain.GCDataPoint} entity.
 */
public class GCDataPointDTO  implements Serializable, Identifyable {

    private Long id;

    private String analyticalSessionID;

    private String mountID;

    private String sampleType;

    private String batchID;


    private Long lAICPMSId;

    private Long geochemAnalyticalTypeId;

    private String geochemAnalyticalTypeName;

    private Long analysisScaleId;

    private String analysisScaleName;

    private Long mineralId;

    private String mineralName;

    private Long referenceMaterialId;

    private String referenceMaterialName;

    private Long oxideErrorTypeId;

    private String oxideErrorTypeName;

    private Long elementErrorTypeId;

    private String elementErrorTypeName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnalyticalSessionID() {
        return analyticalSessionID;
    }

    public void setAnalyticalSessionID(String analyticalSessionID) {
        this.analyticalSessionID = analyticalSessionID;
    }

    public String getMountID() {
        return mountID;
    }

    public void setMountID(String mountID) {
        this.mountID = mountID;
    }

    public String getSampleType() {
        return sampleType;
    }

    public void setSampleType(String sampleType) {
        this.sampleType = sampleType;
    }

    public String getBatchID() {
        return batchID;
    }

    public void setBatchID(String batchID) {
        this.batchID = batchID;
    }

    public Long getLAICPMSId() {
        return lAICPMSId;
    }

    public void setLAICPMSId(Long lAICPMSId) {
        this.lAICPMSId = lAICPMSId;
    }

    public Long getGeochemAnalyticalTypeId() {
        return geochemAnalyticalTypeId;
    }

    public void setGeochemAnalyticalTypeId(Long lGCAnalyticalTechniqueId) {
        this.geochemAnalyticalTypeId = lGCAnalyticalTechniqueId;
    }

    public String getGeochemAnalyticalTypeName() {
        return geochemAnalyticalTypeName;
    }

    public void setGeochemAnalyticalTypeName(String lGCAnalyticalTechniqueName) {
        this.geochemAnalyticalTypeName = lGCAnalyticalTechniqueName;
    }

    public Long getAnalysisScaleId() {
        return analysisScaleId;
    }

    public void setAnalysisScaleId(Long lGCAnalysisScaleId) {
        this.analysisScaleId = lGCAnalysisScaleId;
    }

    public String getAnalysisScaleName() {
        return analysisScaleName;
    }

    public void setAnalysisScaleName(String lGCAnalysisScaleName) {
        this.analysisScaleName = lGCAnalysisScaleName;
    }

    public Long getMineralId() {
        return mineralId;
    }

    public void setMineralId(Long materialId) {
        this.mineralId = materialId;
    }

    public String getMineralName() {
        return mineralName;
    }

    public void setMineralName(String materialName) {
        this.mineralName = materialName;
    }

    public Long getReferenceMaterialId() {
        return referenceMaterialId;
    }

    public void setReferenceMaterialId(Long referenceMaterialId) {
        this.referenceMaterialId = referenceMaterialId;
    }

    public String getReferenceMaterialName() {
        return referenceMaterialName;
    }

    public void setReferenceMaterialName(String referenceMaterialName) {
        this.referenceMaterialName = referenceMaterialName;
    }

    public Long getOxideErrorTypeId() {
        return oxideErrorTypeId;
    }

    public void setOxideErrorTypeId(Long lErrorTypeId) {
        this.oxideErrorTypeId = lErrorTypeId;
    }

    public String getOxideErrorTypeName() {
        return oxideErrorTypeName;
    }

    public void setOxideErrorTypeName(String lErrorTypeName) {
        this.oxideErrorTypeName = lErrorTypeName;
    }

    public Long getElementErrorTypeId() {
        return elementErrorTypeId;
    }

    public void setElementErrorTypeId(Long lErrorTypeId) {
        this.elementErrorTypeId = lErrorTypeId;
    }

    public String getElementErrorTypeName() {
        return elementErrorTypeName;
    }

    public void setElementErrorTypeName(String lErrorTypeName) {
        this.elementErrorTypeName = lErrorTypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        GCDataPointDTO gCDataPointDTO = (GCDataPointDTO) o;
        if (gCDataPointDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), gCDataPointDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "GCDataPointDTO{" +
            "id=" + getId() +
            ", analyticalSessionID='" + getAnalyticalSessionID() + "'" +
            ", mountID='" + getMountID() + "'" +
            ", sampleType='" + getSampleType() + "'" +
            ", batchID='" + getBatchID() + "'" +
            ", lAICPMS=" + getLAICPMSId() +
            ", geochemAnalyticalType=" + getGeochemAnalyticalTypeId() +
            ", geochemAnalyticalType='" + getGeochemAnalyticalTypeName() + "'" +
            ", analysisScale=" + getAnalysisScaleId() +
            ", analysisScale='" + getAnalysisScaleName() + "'" +
            ", mineral=" + getMineralId() +
            ", mineral='" + getMineralName() + "'" +
            ", referenceMaterial=" + getReferenceMaterialId() +
            ", referenceMaterial='" + getReferenceMaterialName() + "'" +
            ", oxideErrorType=" + getOxideErrorTypeId() +
            ", oxideErrorType='" + getOxideErrorTypeName() + "'" +
            ", elementErrorType=" + getElementErrorTypeId() +
            ", elementErrorType='" + getElementErrorTypeName() + "'" +
            "}";
    }
}
