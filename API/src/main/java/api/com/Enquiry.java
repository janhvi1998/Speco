package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Enquiry 
{
	@JsonProperty("EmailId")
	private String emailid;
	@JsonProperty("Name")
	private String name;
	@JsonProperty("Enquiry For")
	private String enquiry;
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEnquiry() {
		return enquiry;
	}
	public void setEnquiry(String enquiry) {
		this.enquiry = enquiry;
	}
	
}
