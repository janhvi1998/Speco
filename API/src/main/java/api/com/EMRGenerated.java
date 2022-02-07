package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EMRGenerated 
{
	@JsonProperty("ConsultedTo")
	private String consultedto;
	@JsonProperty("Concern")
	private String concern;
	@JsonProperty("AppointmentDate")
	private String appointmentdate;
	@JsonProperty("EMR")
	private String emr;
	public String getConsultedto() {
		return consultedto;
	}
	public void setConsultedto(String consultedto) {
		this.consultedto = consultedto;
	}
	public String getConcern() {
		return concern;
	}
	public void setConcern(String concern) {
		this.concern = concern;
	}
	public String getAppointmentdate() {
		return appointmentdate;
	}
	public void setAppointmentdate(String appointmentdate) {
		this.appointmentdate = appointmentdate;
	}
	public String getEmr() {
		return emr;
	}
	public void setEmr(String emr) {
		this.emr = emr;
	}
}
