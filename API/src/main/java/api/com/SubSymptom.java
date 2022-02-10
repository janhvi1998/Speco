package api.com;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SubSymptom 
{	
	@JsonProperty("SymptomId")
	private int symptomid;
	@JsonProperty("SubSymptoms")
	private List<SubSymptoms> subsymptoms;
	
	public int getSymptomid() {
		return symptomid;
	}

	public void setSymptomid(int symptomid) {
		this.symptomid = symptomid;
	}

	public List<SubSymptoms> getSubsymptoms() {
		return subsymptoms;
	}

	public void setSubsymptoms(List<SubSymptoms> subsymptoms) {
		this.subsymptoms = subsymptoms;
	}
}
