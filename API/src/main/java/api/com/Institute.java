package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Institute
{
	@JsonProperty("Institute")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
