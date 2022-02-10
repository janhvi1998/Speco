package api.com;



import com.fasterxml.jackson.annotation.JsonProperty;

public class Patient 
{
	@JsonProperty("PatientId")
	private int patientid;
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
    @JsonProperty("CityId")
    private int cityid;
    @JsonProperty("CountryId")
    private int countryid;
    
    
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
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public int getStateid() {
		return stateid;
	}
	public void setStateid(int stateid) {
		this.stateid = stateid;
	}
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public int getCountryid() {
		return countryid;
	}
	public void setCountryid(int countryid) {
		this.countryid = countryid;
	}

}
