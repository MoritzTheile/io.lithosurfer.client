package io.lithosurfer.client.scripts.dtos;
import java.io.Serializable;
import java.time.Instant;
import java.util.Arrays;
import java.util.Objects;


public class LabDTO implements Serializable, Identifyable {

	private static final long serialVersionUID = 7352821874367506382L;

	   private Long id;

	    private String name;

	    private String description;

	    private String organisation;

	    private String city;

	    private Long countryId;

	    private String countryName;
	    
	    private Integer inLithodat;

		@Override
	    public int hashCode() {
	        return Objects.hashCode(getId());
	    }

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

		public String getOrganisation() {
			return organisation;
		}

		public void setOrganisation(String organisation) {
			this.organisation = organisation;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public Long getCountryId() {
			return countryId;
		}

		public void setCountryId(Long countryId) {
			this.countryId = countryId;
		}

		public String getCountryName() {
			return countryName;
		}

		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}

	    public Integer getInLithodat() {
			return inLithodat;
		}

		public void setInLithodat(Integer inLithodat) {
			this.inLithodat = inLithodat;
		}
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) {
	            return true;
	        }
	        if (o == null || getClass() != o.getClass()) {
	            return false;
	        }

	        LabDTO labDTO = (LabDTO) o;
	        if (labDTO.getId() == null || getId() == null) {
	            return false;
	        }
	        return Objects.equals(getId(), labDTO.getId());
	    }

		@Override
		public String toString() {
			return "LabDTO [id=" + id + ", name=" + name + ", description=" + description + ", organisation="
					+ organisation + ", city=" + city + ", countryId=" + countryId + ", countryName=" + countryName
					+ ", inLithodat=" + inLithodat + "]";
		}


}
