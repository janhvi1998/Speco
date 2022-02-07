package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Degree 
{
	@JsonProperty("Degree")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
