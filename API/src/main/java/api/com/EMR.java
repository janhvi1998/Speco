package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EMR 
{
	@JsonProperty("PatientName")
	private String patientname;
	@JsonProperty("ConsultedTo")
	private String consultedto;
	@JsonProperty("Gender")
	private String gender;
	@JsonProperty("Age")
	private String age;
	@JsonProperty("Symptoms")
	private String symptoms;
	@JsonProperty("Findings")
	private String finding;
	@JsonProperty("Diagnosis")
	private String diagnosis;
	@JsonProperty("Instruction")
	private String instruction;
	@JsonProperty("FollowUp")
	private String followup;
	@JsonProperty("Prescription")
	private String prescription;
	@JsonProperty("EMRGenerated")
	private String emrgenerated;
	@JsonProperty("Concern")
	private String concern;
	@JsonProperty("InvoiceGenerated")
	private String invoicegenerated;
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public String getConsultedto() {
		return consultedto;
	}
	public void setConsultedto(String consultedto) {
		this.consultedto = consultedto;
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
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getFinding() {
		return finding;
	}
	public void setFinding(String finding) {
		this.finding = finding;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getInstruction() {
		return instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	public String getFollowup() {
		return followup;
	}
	public void setFollowup(String followup) {
		this.followup = followup;
	}
	public String getEmrgenerated() {
		return emrgenerated;
	}
	public void setEmrgenerated(String emrgenerated) {
		this.emrgenerated = emrgenerated;
	}
	public String getInvoicegenerated() {
		return invoicegenerated;
	}
	public void setInvoicegenerated(String invoicegenerated) {
		this.invoicegenerated = invoicegenerated;
	}
	public String getConcern() {
		return concern;
	}
	public void setConcern(String concern) {
		this.concern = concern;
	}
}
