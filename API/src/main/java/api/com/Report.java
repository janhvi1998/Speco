package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Report 
{
	@JsonProperty("ReportsImgUrl")
	private String reportimgurl;

	public String getReportimgurl() {
		return reportimgurl;
	}

	public void setReportimgurl(String reportimgurl) {
		this.reportimgurl = reportimgurl;
	}
	
}
