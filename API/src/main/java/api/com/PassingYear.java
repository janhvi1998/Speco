package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PassingYear 
{
	@JsonProperty("PassingYear")
	private int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
