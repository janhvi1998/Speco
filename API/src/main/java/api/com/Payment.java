package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Payment 
{
	@JsonProperty("PatientId")
	private String patientid;
	@JsonProperty("PatientName")
	private String patientname;
	@JsonProperty("Date")
	private String date;
	@JsonProperty("Time")
	private String time;
	@JsonProperty("Charges")
	private String charges;
	@JsonProperty("Detail")
	private String detail;
	@JsonProperty("Quantity")
	private String quantity;
	@JsonProperty("UnitCost")
	private String unitcost;
	@JsonProperty("Discount")
	private String discount;
	@JsonProperty("Total")
	private String total;
	public String getPatientid() {
		return patientid;
	}
	public void setPatientid(String patientid) {
		this.patientid = patientid;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getCharges() {
		return charges;
	}
	public void setCharges(String charges) {
		this.charges = charges;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getUnitcost() {
		return unitcost;
	}
	public void setUnitcost(String unitcost) {
		this.unitcost = unitcost;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	
	
}
