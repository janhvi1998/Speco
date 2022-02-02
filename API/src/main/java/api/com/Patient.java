package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Patient 
{
	@JsonProperty("PatientId")
	private String patientid;
	@JsonProperty("PatientName")
	private String patientname;
	@JsonProperty("Sex")
	private String sex;
	@JsonProperty("LastVisit")
	private String lastvisit;
	@JsonProperty("Contact")
	private String contact;
	@JsonProperty("ConsultationFees")
	private String consultationfees;
	@JsonProperty("ConsultedTo")
	private String consultedto;
	@JsonProperty("Date")
	private String date;
	@JsonProperty("Time")
	private String time;
	@JsonProperty("ConsultationMode")
	private String consultationmode;
	@JsonProperty("EMR")
	private String emrimages;
	@JsonProperty("PatientUploadedData")
	private String patientuploadeddata;
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
	@JsonProperty("SociEconomicStatus")
	private String socioeconomicstatus;
	@JsonProperty("Concern")
	private String concern;
	
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
	public String getLastvisit() {
		return lastvisit;
	}
	public void setLastvisit(String lastvisit) {
		this.lastvisit = lastvisit;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getConsultationfees() {
		return consultationfees;
	}
	public void setConsultationfees(String consultationfees) {
		this.consultationfees = consultationfees;
	}
	public String getConsultedto() {
		return consultedto;
	}
	public void setConsultedto(String consultedto) {
		this.consultedto = consultedto;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getConsultationmode() {
		return consultationmode;
	}
	public void setConsultationmode(String consultationmode) {
		this.consultationmode = consultationmode;
	}
	public String getEmrimages() {
		return emrimages;
	}
	public void setEmrimages(String emrimages) {
		this.emrimages = emrimages;
	}
	public String getPatientuploadeddata() {
		return patientuploadeddata;
	}
	public void setPatientuploadeddata(String patientuploadeddata) {
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
	public String getConcern() {
		return concern;
	}
	public void setConcern(String concern) {
		this.concern = concern;
	}

}
