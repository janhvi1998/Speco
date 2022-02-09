package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EducationDetail
{
	
	@JsonProperty("Degree")
	private String degree;
	@JsonProperty("PassingYear")
	private String passingyear;
	@JsonProperty("Institute")
	private String institute;
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getPassingyear() {
		return passingyear;
	}
	public void setPassingyear(String passingyear) {
		this.passingyear = passingyear;
	}
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	
}
