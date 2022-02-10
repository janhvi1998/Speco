package api.com;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Appointment 
{
	@JsonProperty("ClinicId")
	private String clinicid;
	@JsonProperty("DoctorId")
    private String doctorid;
	@JsonProperty("PatientId")
    private String patientid;
	@JsonProperty("ConsultationId")
    private String consultationid;
	@JsonProperty("Date")
	private String date;
	@JsonProperty("TimeSlot")
	private String timeslot;
	@JsonProperty("AppointmentStatus")
	private String appointmentstatus;
	@JsonProperty("ConsultationStatus")
	private String consultationstatus;
	@JsonProperty("ConsultationNumber")
	private String consultationnumber;
	@JsonProperty("Symptoms")
	private List<SubSymptom> symptoms;
	@JsonProperty("Intensity")
	private String intensity;
	@JsonProperty("Report")
	private String reportimg;
	@JsonProperty("ConsultationMode")
	private String consultationmode;
	@JsonProperty("DaysOfSymptoms")
	private String daysofsymptoms;
    
	public String getClinicid() {
		return clinicid;
	}

	public void setClinicid(String clinicid) {
		this.clinicid = clinicid;
	}

	public String getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(String doctorid) {
		this.doctorid = doctorid;
	}

	public String getPatientid() {
		return patientid;
	}

	public void setPatientid(String patientid) {
		this.patientid = patientid;
	}

	public String getConsultationid() {
		return consultationid;
	}

	public void setConsultationid(String consultationid) {
		this.consultationid = consultationid;
	}

	public String getTimeslot() {
		return timeslot;
	}

	public void setTimeslot(String timeslot) {
		this.timeslot = timeslot;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAppointmentstatus() {
		return appointmentstatus;
	}

	public void setAppointmentstatus(String appointmentstatus) {
		this.appointmentstatus = appointmentstatus;
	}

	public String getConsultationstatus() {
		return consultationstatus;
	}

	public void setConsultationstatus(String consultationstatus) {
		this.consultationstatus = consultationstatus;
	}

	public String getConsultationnumber() {
		return consultationnumber;
	}

	public void setConsultationnumber(String consultationnumber) {
		this.consultationnumber = consultationnumber;
	}

	public List<SubSymptom> getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(List<SubSymptom> symptoms) {
		this.symptoms = symptoms;
	}

	public String getIntensity() {
		return intensity;
	}

	public void setIntensity(String intensity) {
		this.intensity = intensity;
	}

	public String getReportimg() {
		return reportimg;
	}

	public void setReportimg(String reportimg) {
		this.reportimg = reportimg;
	}

	public String getConsultationmode() {
		return consultationmode;
	}

	public void setConsultationmode(String consultationmode) {
		this.consultationmode = consultationmode;
	}

	public String getDaysofsymptoms() {
		return daysofsymptoms;
	}

	public void setDaysofsymptoms(String daysofsymptoms) {
		this.daysofsymptoms = daysofsymptoms;
	}

}
