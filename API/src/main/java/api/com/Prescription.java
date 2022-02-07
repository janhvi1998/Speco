package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Prescription 
{
	@JsonProperty("MedicineName")
	private String medicinename;
	@JsonProperty("Times")
	private String timesaday;

	public String getMedicinename() {
		return medicinename;
	}

	public void setMedicinename(String medicinename) {
		this.medicinename = medicinename;
	}

	public String getTimesaday() {
		return timesaday;
	}

	public void setTimesaday(String timesaday) {
		this.timesaday = timesaday;
	}
	
}
