package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Findings 
{
	@JsonProperty("Findings")
	private String findings;

	public String getFindings() {
		return findings;
	}

	public void setFindings(String findings) {
		this.findings = findings;
	}
	
}
