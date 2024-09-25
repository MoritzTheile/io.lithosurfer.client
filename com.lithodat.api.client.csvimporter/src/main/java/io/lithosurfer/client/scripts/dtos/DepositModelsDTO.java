package io.lithosurfer.client.scripts.dtos;

import java.io.Serializable;
import java.util.Objects;

public class DepositModelsDTO implements Serializable, Identifyable {

	private static final long serialVersionUID = 8273648236432345234L;

    private Long id;

    private String name;

    private String path;

    private String description;

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

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DepositModelsDTO depositModelsDTO = (DepositModelsDTO) o;
        if (depositModelsDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), depositModelsDTO.getId());
    }
	 
    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

	@Override
	public String toString() {
		return "DepositModelsDTO [id=" + id + ", name=" + name + ", path=" + path + ", description=" + description
				+ "]";
	}
    
}
