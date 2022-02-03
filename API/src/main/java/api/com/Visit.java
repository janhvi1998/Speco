package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Visit {
	
	@JsonProperty("PatientName")
	private String patientname;
	@JsonProperty("Gender")
	private String gender;
	@JsonProperty("Age")
	private String age;
	@JsonProperty("CaseId")
	private String caseid;
	@JsonProperty("Date")
	private String date;
	@JsonProperty("Time")
	private String time;
	@JsonProperty("ModeOfConsultation")
	private String modeofconsultation;
	@JsonProperty("Visits")
	private String visits;
	@JsonProperty("ChiefComplaint")
	private String chiefcomplaint;
	@JsonProperty("HistoryOfPresentIllness")
	private String historyofpresentillness;
	@JsonProperty("HistoryOfPastIllness")
	private String historyofpastillness;
	@JsonProperty("GeneralPhysicalExamination")
	private String generalphysicalexamination;
	@JsonProperty("SystematicExamination")
	private String systematicexamination;
	@JsonProperty("LocalExamination")
	private String localexamination;
	@JsonProperty("ProvisionalDiagnosis")
	private String provisionaldiagnosis;
	@JsonProperty("Investigation")
	private String investigation;
	@JsonProperty("FinalDiagnosis")
	private String finaldiagnosis;
	@JsonProperty("LabReports")
	private String labreports;
	@JsonProperty("Medications")
	private String medications;
	@JsonProperty("Invoices")
	private String invoices;
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
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
	public String getCaseid() {
		return caseid;
	}
	public void setCaseid(String caseid) {
		this.caseid = caseid;
	}
	public String getModeofconsultation() {
		return modeofconsultation;
	}
	public void setModeofconsultation(String modeofconsultation) {
		this.modeofconsultation = modeofconsultation;
	}
	public String getVisits() {
		return visits;
	}
	public void setVisits(String visits) {
		this.visits = visits;
	}
	public String getChiefcomplaint() {
		return chiefcomplaint;
	}
	public void setChiefcomplaint(String chiefcomplaint) {
		this.chiefcomplaint = chiefcomplaint;
	}
	public String getHistoryofpresentillness() {
		return historyofpresentillness;
	}
	public void setHistoryofpresentillness(String historyofpresentillness) {
		this.historyofpresentillness = historyofpresentillness;
	}
	public String getGeneralphysicalexamination() {
		return generalphysicalexamination;
	}
	public void setGeneralphysicalexamination(String generalphysicalexamination) {
		this.generalphysicalexamination = generalphysicalexamination;
	}
	public String getHistoryofpastillness() {
		return historyofpastillness;
	}
	public void setHistoryofpastillness(String historyofpastillness) {
		this.historyofpastillness = historyofpastillness;
	}
	public String getSystematicexamination() {
		return systematicexamination;
	}
	public void setSystematicexamination(String systematicexamination) {
		this.systematicexamination = systematicexamination;
	}
	public String getLocalexamination() {
		return localexamination;
	}
	public void setLocalexamination(String localexamination) {
		this.localexamination = localexamination;
	}
	public String getProvisionaldiagnosis() {
		return provisionaldiagnosis;
	}
	public void setProvisionaldiagnosis(String provisionaldiagnosis) {
		this.provisionaldiagnosis = provisionaldiagnosis;
	}
	public String getInvestigation() {
		return investigation;
	}
	public void setInvestigation(String investigation) {
		this.investigation = investigation;
	}
	public String getFinaldiagnosis() {
		return finaldiagnosis;
	}
	public void setFinaldiagnosis(String finaldiagnosis) {
		this.finaldiagnosis = finaldiagnosis;
	}
	public String getLabreports() {
		return labreports;
	}
	public void setLabreports(String labreports) {
		this.labreports = labreports;
	}
	public String getMedications() {
		return medications;
	}
	public void setMedications(String medications) {
		this.medications = medications;
	}
	public String getInvoices() {
		return invoices;
	}
	public void setInvoices(String invoices) {
		this.invoices = invoices;
	}

}
