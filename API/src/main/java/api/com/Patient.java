package api.com;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Patient 
{
	@JsonProperty("PatientId")
	private String patientid;
	@JsonProperty("PatientName")
	private String patientname;
	@JsonProperty("Sex")
	private String sex;
	@JsonProperty("Contact")
	private String contact;
	@JsonProperty("PatientUploadedData")
	private List<PatientUploadData> patientuploadeddata;
	@JsonProperty("FollowUp")
	private List<FollowUps> followup;
	@JsonProperty("EMRGenerated")
	private List<EMRGenerated> emrgenerated;
	@JsonProperty("Allergies")
	private String allergies;
	@JsonProperty("CurrentMedications")
	private String currentmedications;
	@JsonProperty("Diseases")
	private String diseases;
	@JsonProperty("Surgeries")
	private String surgeries;
	@JsonProperty("WearableData")
	private String wearabledata;
	@JsonProperty("PersonalHistory")
	private String personalhistory;
	@JsonProperty("FamilyHistory")
	private String familyhistory;
	@JsonProperty("SocioEconomicStatus")
	private String socioeconomicstatus;
	@JsonProperty("Age")
	private String age;
	
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public List<PatientUploadData> getPatientuploadeddata() {
		return patientuploadeddata;
	}
	public void setPatientuploadeddata(List<PatientUploadData> patientuploadeddata) {
		this.patientuploadeddata = patientuploadeddata;
	}
	public String getAllergies() {
		return allergies;
	}
	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}
	public String getCurrentmedications() {
		return currentmedications;
	}
	public void setCurrentmedications(String currentmedications) {
		this.currentmedications = currentmedications;
	}
	public String getDiseases() {
		return diseases;
	}
	public void setDiseases(String diseases) {
		this.diseases = diseases;
	}
	public String getSurgeries() {
		return surgeries;
	}
	public void setSurgeries(String surgeries) {
		this.surgeries = surgeries;
	}
	public String getWearabledata() {
		return wearabledata;
	}
	public void setWearabledata(String wearabledata) {
		this.wearabledata = wearabledata;
	}
	public String getPersonalhistory() {
		return personalhistory;
	}
	public void setPersonalhistory(String personalhistory) {
		this.personalhistory = personalhistory;
	}
	public String getFamilyhistory() {
		return familyhistory;
	}
	public void setFamilyhistory(String familyhistory) {
		this.familyhistory = familyhistory;
	}
	public String getSocioeconomicstatus() {
		return socioeconomicstatus;
	}
	public void setSocioeconomicstatus(String socioeconomicstatus) {
		this.socioeconomicstatus = socioeconomicstatus;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public List<FollowUps> getFollowup() {
		return followup;
	}
	public void setFollowup(List<FollowUps> followup) {
		this.followup = followup;
	}
	public List<EMRGenerated> getEmrgenerated() {
		return emrgenerated;
	}
	public void setEmrgenerated(List<EMRGenerated> emrgenerated) {
		this.emrgenerated = emrgenerated;
	}

}
