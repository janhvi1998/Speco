package api.com;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Symptoms
{
	@JsonProperty("Symptoms")
	private String symptoms;

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
}
