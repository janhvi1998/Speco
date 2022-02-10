package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SubSymptoms 
{
	@JsonProperty("SubSymptomName")
	private String subsymptomname;

	public String getSubsymptomname() {
		return subsymptomname;
	}

	public void setSubsymptomname(String subsymptomname) {
		this.subsymptomname = subsymptomname;
	}
}
