package com.example.psp.model;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;



@Entity
public class Student
{
	@Id
	@NotNull
	private String email;
	@NotNull
	private String firstName;
	@NotNull
	private String lastName;
	@NotNull
	private String mobile;
	@NotNull
	private String password;
	@NotNull
	private String gender;
	@NotNull
	@JsonProperty("SSC_Percentage")
	private int SSC_Percentage;
	@NotNull
	@JsonProperty("SSC_Maths")
	private int SSC_Maths;
	@NotNull
	@JsonProperty("HSC_Percentage")
	private int HSC_Percentage;
	@NotNull
	@JsonProperty("HSC_Maths")
	private int HSC_Maths;
	
	
	private int aptitude_marks;
	
	private int communication_marks;
	
	private int presentation_marks;
	
	private int technical_marks;
	
	private int writing_marks;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
	public int getSSC_Percentage() {
		return SSC_Percentage;
	}

	public void setSSC_Percentage(int sSC_Percentage) {
		SSC_Percentage = sSC_Percentage;
	}

	public int getSSC_Maths() {
		return SSC_Maths;
	}

	public void setSSC_Maths(int sSC_Maths) {
		SSC_Maths = sSC_Maths;
	}

	public int getHSC_Percentage() {
		return HSC_Percentage;
	}

	public void setHSC_Percentage(int hSC_Percentage) {
		HSC_Percentage = hSC_Percentage;
	}

	public int getHSC_Maths() {
		return HSC_Maths;
	}

	public void setHSC_Maths(int hSC_Maths) {
		HSC_Maths = hSC_Maths;
	}

	public int getAptitude_marks() {
		return aptitude_marks;
	}

	public void setAptitude_marks(int aptitude_marks) {
		this.aptitude_marks = aptitude_marks;
	}

	public int getCommunication_marks() {
		return communication_marks;
	}

	public void setCommunication_marks(int communication_marks) {
		this.communication_marks = communication_marks;
	}

	public int getPresentation_marks() {
		return presentation_marks;
	}

	public void setPresentation_marks(int presentation_marks) {
		this.presentation_marks = presentation_marks;
	}

	public int getTechnical_marks() {
		return technical_marks;
	}

	public void setTechnical_marks(int technical_marks) {
		this.technical_marks = technical_marks;
	}

	public int getWriting_marks() {
		return writing_marks;
	}

	public void setWriting_marks(int writing_marks) {
		this.writing_marks = writing_marks;
	}

	@Override
	public String toString() {
		return "Student [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", mobile=" + mobile
				+ ", password=" + password + ", gender=" + gender + ", SSC_Percentage=" + SSC_Percentage
				+ ", SSC_Maths=" + SSC_Maths + ", HSC_Percentage=" + HSC_Percentage + ", HSC_Maths=" + HSC_Maths
				+ ", aptitude_marks=" + aptitude_marks + ", communication_marks=" + communication_marks
				+ ", presentation_marks=" + presentation_marks + ", technical_marks=" + technical_marks
				+ ", writing_marks=" + writing_marks + "]";
	}
	

}
