package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Package
{
	@JsonProperty("Name")
	private String name;
	@JsonProperty("Id")
	private int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
