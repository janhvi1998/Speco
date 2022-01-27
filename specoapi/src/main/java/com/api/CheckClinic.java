package com.api;

import java.util.List;

public class CheckClinic 
{
	private String message;
	private String status;
	private List<Clinic> data;
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
	public List<Clinic> getData() {
		return data;
	}
	public void setData(List<Clinic> data) {
		this.data = data;
	}
}

