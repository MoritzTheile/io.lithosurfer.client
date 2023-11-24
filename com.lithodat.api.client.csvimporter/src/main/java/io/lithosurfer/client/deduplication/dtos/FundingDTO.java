package io.lithosurfer.client.deduplication.dtos;
import java.time.Instant;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.lithodat.app.domain.Funding} entity.
 */
public class FundingDTO implements Serializable, Identifyable{

	private static final long serialVersionUID = 5918792123895238939L;

	private Long id;

    private String name;

    private String description;

    private String grandNumber;

    private Integer year;

    private Instant createdTimestamp;

    private Instant lastEditedTimestamp;

    private Instant deletedTimestamp;


    private Long createdById;

    private Long lastEditedById;

    private Long deletedById;

    private Long fundingBodyId;

    private String fundingBodyName;

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

    public String getGrandNumber() {
        return grandNumber;
    }

    public void setGrandNumber(String grandNumber) {
        this.grandNumber = grandNumber;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
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

    public Long getFundingBodyId() {
        return fundingBodyId;
    }

    public void setFundingBodyId(Long fundingBodyId) {
        this.fundingBodyId = fundingBodyId;
    }

    public String getFundingBodyName() {
        return fundingBodyName;
    }

    public void setFundingBodyName(String fundingBodyName) {
        this.fundingBodyName = fundingBodyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        FundingDTO fundingDTO = (FundingDTO) o;
        if (fundingDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), fundingDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "FundingDTO{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", grandNumber='" + getGrandNumber() + "'" +
            ", year=" + getYear() +
            ", createdTimestamp='" + getCreatedTimestamp() + "'" +
            ", lastEditedTimestamp='" + getLastEditedTimestamp() + "'" +
            ", deletedTimestamp='" + getDeletedTimestamp() + "'" +
            ", createdBy=" + getCreatedById() +
            ", lastEditedBy=" + getLastEditedById() +
            ", deletedBy=" + getDeletedById() +
            ", fundingBody=" + getFundingBodyId() +
            ", fundingBody='" + getFundingBodyName() + "'" +
            "}";
    }
}
