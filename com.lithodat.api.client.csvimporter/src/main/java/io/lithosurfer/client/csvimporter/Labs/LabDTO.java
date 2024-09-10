package io.lithosurfer.client.csvimporter.Labs;

public class LabDTO {
	   private Long id;

	    private String name;

	    private String description;

	    private String organisation;

	    private String city;

	    private Long countryId;

	    private String countryName;
	    
	    private Integer inLithodat;

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
		
}
