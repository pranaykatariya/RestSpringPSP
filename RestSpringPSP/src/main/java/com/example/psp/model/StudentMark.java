package com.example.psp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentMark {
	
	
	private String email;
	
	@JsonProperty("SSCPercentage")  
	private String SSCPercentage;
	
	@JsonProperty("SSCMaths")
	private String SSCMaths;
	
	@JsonProperty("HSCPercentage")
	private String HSCPercentage;
	
	@JsonProperty("HSCMaths")
	private String HSCMaths;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSSCPercentage() {
		return SSCPercentage;
	}

	public void setSSCPercentage(String sSCPercentage) {
		SSCPercentage = sSCPercentage;
	}

	public String getSSCMaths() {
		return SSCMaths;
	}

	public void setSSCMaths(String sSCMaths) {
		SSCMaths = sSCMaths;
	}

	public String getHSCPercentage() {
		return HSCPercentage;
	}

	public void setHSCPercentage(String hSCPercentage) {
		HSCPercentage = hSCPercentage;
	}

	public String getHSCMaths() {
		return HSCMaths;
	}

	public void setHSCMaths(String hSCMaths) {
		HSCMaths = hSCMaths;
	}

	
	
	
}
