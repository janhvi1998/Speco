package com.api;

import java.util.List;

public class CheckOnboarding 
{
	private String message;
	private String status;
	private List<Onboarding> data;
	public List<Onboarding> getData() {
		return data;
	}
	public void setData(List<Onboarding> data) {
		this.data = data;
	}
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
	
}
