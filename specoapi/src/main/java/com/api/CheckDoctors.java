package com.api;

import java.util.List;

public class CheckDoctors 
{
	private String message;
	private String status;
	private List<Doctors> data;
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
	public List<Doctors> getData() {
		return data;
	}
	public void setData(List<Doctors> data) {
		this.data = data;
	}
}

