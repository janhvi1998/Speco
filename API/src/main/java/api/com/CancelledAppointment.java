package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CancelledAppointment 
{
	@JsonProperty("PatientId")
	private String patientid;
	@JsonProperty("Patient Name")
	private String patientname;
	@JsonProperty("Reason")
	private String reason;
	public String getPatientid() {
		return patientid;
	}
	public void setPatientid(String patientid) {
		this.patientid = patientid;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
}
