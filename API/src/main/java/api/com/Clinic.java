package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Clinic 
{
	@JsonProperty("ClinicId")
	private int clinicid;
	@JsonProperty("DoctorId")
	private int doctorid;
	@JsonProperty("ClinicName")
    private String clinicname;
	@JsonProperty("RegistrationNo")
    private String registrationno;
	@JsonProperty("EmailId")
    private String emailid;
	@JsonProperty("PhoneNumber")
    private String phoneNumber;
	@JsonProperty("ClinicType")
    private String clinictype;
	@JsonProperty("YearOfPractice")
    private String yearsofpractice;
	@JsonProperty("AssociatedFacilites")
    private String associatedfacilites;
	@JsonProperty("CurrentAddress")
	private String currentaddress;
	@JsonProperty("CurrentCityId")
	private int currentcityid;
	@JsonProperty("CurrentStateId")
	private int currentstateid;
	@JsonProperty("CurrentCountryId")	
	private int currentcountryid;
	@JsonProperty("PermAddress")
	private String permaddress;
	@JsonProperty("PermCityId")
	private int permcityid;
	@JsonProperty("PermStateId")
	private int permstateid;
	@JsonProperty("PermCountryId")
	private int permcountryid;
	@JsonProperty("CurrentZip")
	private String currentzip;
	@JsonProperty("PermZip")
	private String permzip;
	
    public Clinic() {
    }

   
   

   
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


	public String getClinicname() {
		return clinicname;
	}

	public void setClinicname(String clinicname) {
		this.clinicname = clinicname;
	}

	public String getRegistrationno() {
		return registrationno;
	}

	public void setRegistrationno(String registrationno) {
		this.registrationno = registrationno;
	}
	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}


	public String getClinictype() {
		return clinictype;
	}

	public void setClinictype(String clinictype) {
		this.clinictype = clinictype;
	}


	public String getYearsofpractice() {
		return yearsofpractice;
	}

	public void setYearsofpractice(String yearsofpractice) {
		this.yearsofpractice = yearsofpractice;
	}

	public String getAssociatedfacilites() {
		return associatedfacilites;
	}

	public void setAssociatedfacilites(String associatedfacilites) {
		this.associatedfacilites = associatedfacilites;
	}

	public int getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}
	public String getCurrentaddress() {
		return currentaddress;
	}

	public void setCurrentaddress(String currentaddress) {
		this.currentaddress = currentaddress;
	}

	public int getCurrentcityid() {
		return currentcityid;
	}

	public void setCurrentcityid(int currentcityid) {
		this.currentcityid = currentcityid;
	}

	public String getPermaddress() {
		return permaddress;
	}

	public void setPermaddress(String permaddress) {
		this.permaddress = permaddress;
	}

	public int getPermcityid() {
		return permcityid;
	}

	public void setPermcityid(int permcityid) {
		this.permcityid = permcityid;
	}

	public int getPermstateid() {
		return permstateid;
	}

	public void setPermstateid(int permstateid) {
		this.permstateid = permstateid;
	}

	public int getPermcountryid() {
		return permcountryid;
	}

	public void setPermcountryid(int permcountryid) {
		this.permcountryid = permcountryid;
	}

	public String getCurrentzip() {
		return currentzip;
	}

	public void setCurrentzip(String currentzip) {
		this.currentzip = currentzip;
	}

	public String getPermzip() {
		return permzip;
	}

	public void setPermzip(String permzip) {
		this.permzip = permzip;
	}


	public int getCurrentstateid() {
		return currentstateid;
	}


	public void setCurrentstateid(int currentstateid) {
		this.currentstateid = currentstateid;
	}


	public int getCurrentcountryid() {
		return currentcountryid;
	}


	public void setCurrentcountryid(int currentcountryid) {
		this.currentcountryid = currentcountryid;
	}





	public int getClinicid() {
		return clinicid;
	}





	public void setClinicid(int clinicid) {
		this.clinicid = clinicid;
	}

}