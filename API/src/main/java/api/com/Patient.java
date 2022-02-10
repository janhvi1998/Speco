package api.com;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Patient 
{
	@JsonProperty("PatientId")
	private String patientid;
    @JsonProperty("Name")
	private String name;
    @JsonProperty("EmailId")
    private String emailid;
    @JsonProperty("Gender")
    private String gender;
    @JsonProperty("Address")
    private String address;
    @JsonProperty("Phone")
    private String phone;
    @JsonProperty("BloodGroup")
    private String bloodgroup;
    @JsonProperty("StateId")
    private int stateid;
    
    
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getPatientid() {
		return patientid;
	}
	public void setPatientid(String patientid) {
		this.patientid = patientid;
	}
	public int getStateid() {
		return stateid;
	}
	public void setStateid(int stateid) {
		this.stateid = stateid;
	}

}
