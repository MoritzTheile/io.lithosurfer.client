package io.lithosurfer.client.scripts.dtos;
import java.time.Instant;
import java.io.Serializable;
import java.util.Objects;

public class PersonDTO implements Serializable, Identifyable{

	private static final long serialVersionUID = -2655500648958649153L;

	private Long id;

    private String name;

    private String firstName;

    private String calcName;

    private String title;

    private String note;

    private String orcId;

    private Instant createdTimestamp;

    private Instant lastEditedTimestamp;

    private Instant deletedTimestamp;


    private Long createdById;

    private Long lastEditedById;

    private Long deletedById;

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCalcName() {
        return calcName;
    }

    public void setCalcName(String calcName) {
        this.calcName = calcName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getOrcId() {
        return orcId;
    }

    public void setOrcId(String orcId) {
        this.orcId = orcId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PersonDTO personDTO = (PersonDTO) o;
        if (personDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), personDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", calcName='" + getCalcName() + "'" +
            ", title='" + getTitle() + "'" +
            ", note='" + getNote() + "'" +
            ", orcId='" + getOrcId() + "'" +
            ", createdTimestamp='" + getCreatedTimestamp() + "'" +
            ", lastEditedTimestamp='" + getLastEditedTimestamp() + "'" +
            ", deletedTimestamp='" + getDeletedTimestamp() + "'" +
            ", createdBy=" + getCreatedById() +
            ", lastEditedBy=" + getLastEditedById() +
            ", deletedBy=" + getDeletedById() +
            "}";
    }
}
