package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Diagnosis 
{
	@JsonProperty("Diagnosis")
	private String diagnosis;

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	
}
