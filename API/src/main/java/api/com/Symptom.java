package api.com;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Symptom
{
	@JsonProperty("Symptom")
	private String symptomname;
	@JsonProperty("SymptomId")
	private int symptomid;
	

	public String getSymptomname() {
		return symptomname;
	}

	public void setSymptomname(String symptomname) {
		this.symptomname = symptomname;
	}

	public int getSymptomid() {
		return symptomid;
	}

	public void setSymptomid(int symptomid) {
		this.symptomid = symptomid;
	}
	
	
}
