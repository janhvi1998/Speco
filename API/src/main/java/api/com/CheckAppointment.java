package api.com;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CheckAppointment 
{
	@JsonProperty("Message")
	private String message;
	@JsonProperty("Status")
	private String status;
	@JsonProperty("Data")
	private List<Appointment> data;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Appointment> getData() {
		return data;
	}
	public void setData(List<Appointment> data) {
		this.data = data;
	}

}
