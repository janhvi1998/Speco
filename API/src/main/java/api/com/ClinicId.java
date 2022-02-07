package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClinicId 
{
	@JsonProperty("ClinicId")
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
