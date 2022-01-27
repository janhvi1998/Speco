package com.api;

import java.util.List;

public class CheckPaymentplans 
{
	private String message;
	private String status;
	private List<Paymentplans> data;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Paymentplans> getData() {
		return data;
	}
	public void setData(List<Paymentplans> data) {
		this.data = data;
	}
	
}
