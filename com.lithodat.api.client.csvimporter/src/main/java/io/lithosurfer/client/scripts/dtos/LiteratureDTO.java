package io.lithosurfer.client.scripts.dtos;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class LiteratureDTO implements Serializable, Identifyable {

	private static final long serialVersionUID = 7352821874367506382L;

	private Long id;

    private String calcName;
    
    private String sourceId;

    private String author;

    private String title;

    private String pubYear;

    private String litNumber;

    private String journal;

    private String volume;

    private String pages;

    private String publisher;

    private String doi;

    private String pubMonth;

    private String institution;

    private String litType;

    private String note;

    private String school;

    private String booktitle;

    private String editor;

    private String keywords;

    private String abstr;

    private String language;

    private String series;

    private String chapter;

    private String howpublished;

    private String litOrganization;

    private String otherId;

    private String issn;

    private String url;

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

    public String getCalcName() {
        return calcName;
    }

    public void setCalcName(String calcName) {
        this.calcName = calcName;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPubYear() {
        return pubYear;
    }

    public void setPubYear(String pubYear) {
        this.pubYear = pubYear;
    }

    public String getLitNumber() {
        return litNumber;
    }

    public void setLitNumber(String litNumber) {
        this.litNumber = litNumber;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDoi() {
        // Replace http and https with empty string
        if (doi != null) {
            doi = doi.replaceAll("https://", "");
            doi = doi.replaceAll("http://", "");
        }
        return doi;
    }

    public void setDoi(String doi) {
        // Replace http and https with empty string
        if (doi != null) {
            doi = doi.replaceAll("https://", "");
            doi = doi.replaceAll("http://", "");
        }
        this.doi = doi;
    }

    public String getPubMonth() {
        return pubMonth;
    }

    public void setPubMonth(String pubMonth) {
        this.pubMonth = pubMonth;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getLitType() {
        return litType;
    }

    public void setLitType(String litType) {
        this.litType = litType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getAbstr() {
        return abstr;
    }

    public void setAbstr(String abstr) {
        this.abstr = abstr;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getHowpublished() {
        return howpublished;
    }

    public void setHowpublished(String howpublished) {
        this.howpublished = howpublished;
    }

    public String getLitOrganization() {
        return litOrganization;
    }

    public void setLitOrganization(String litOrganization) {
        this.litOrganization = litOrganization;
    }

    public String getOtherId() {
        return otherId;
    }

    public void setOtherId(String otherId) {
        this.otherId = otherId;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

        LiteratureDTO literatureDTO = (LiteratureDTO) o;
        if (literatureDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), literatureDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "LiteratureDTO{" +
            "id=" + getId() +
            ", calcName='" + getCalcName() + "'" +
            ", sourceId='" + getSourceId() + "'" +
            ", author='" + getAuthor() + "'" +
            ", title='" + getTitle() + "'" +
            ", pubYear='" + getPubYear() + "'" +
            ", litNumber='" + getLitNumber() + "'" +
            ", journal='" + getJournal() + "'" +
            ", volume='" + getVolume() + "'" +
            ", pages='" + getPages() + "'" +
            ", publisher='" + getPublisher() + "'" +
            ", doi='" + getDoi() + "'" +
            ", pubMonth='" + getPubMonth() + "'" +
            ", institution='" + getInstitution() + "'" +
            ", litType='" + getLitType() + "'" +
            ", note='" + getNote() + "'" +
            ", school='" + getSchool() + "'" +
            ", booktitle='" + getBooktitle() + "'" +
            ", editor='" + getEditor() + "'" +
            ", keywords='" + getKeywords() + "'" +
            ", abstr='" + getAbstr() + "'" +
            ", language='" + getLanguage() + "'" +
            ", series='" + getSeries() + "'" +
            ", chapter='" + getChapter() + "'" +
            ", howpublished='" + getHowpublished() + "'" +
            ", litOrganization='" + getLitOrganization() + "'" +
            ", otherId='" + getOtherId() + "'" +
            ", issn='" + getIssn() + "'" +
            ", url='" + getUrl() + "'" +
            ", createdTimestamp='" + getCreatedTimestamp() + "'" +
            ", lastEditedTimestamp='" + getLastEditedTimestamp() + "'" +
            ", deletedTimestamp='" + getDeletedTimestamp() + "'" +
            ", createdBy=" + getCreatedById() +
            ", lastEditedBy=" + getLastEditedById() +
            ", deletedBy=" + getDeletedById() +
            "}";
    }
}
