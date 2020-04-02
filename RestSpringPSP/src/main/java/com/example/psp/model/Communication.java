package com.example.psp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Communication
{
	@Id
	int srNo;
	
	@Size(max = 512)
	
	String question;
	@Size (max = 512)
	
	String optionA;
	@Size(max = 512)
	
	String optionB;
	@Size(max = 512)
	
	String optionC;
	@Size(max = 512)
	
	String optionD;
	
	char correctOption;
	public int getSrNo() {
		return srNo;
	}
	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOptionA() {
		return optionA;
	}
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	public String getOptionB() {
		return optionB;
	}
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	public String getOptionC() {
		return optionC;
	}
	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}
	public String getOptionD() {
		return optionD;
	}
	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}
	public char getCorrectOption() {
		return correctOption;
	}
	public void setCorrectOption(char correctOption) {
		this.correctOption = correctOption;
	}
	
	@Override
	public String toString() {
		return "Communication [srNo=" + srNo + ", question=" + question + ", optionA=" + optionA + ", optionB="
				+ optionB + ", optionC=" + optionC + ", optionD=" + optionD + ", correctOption=" + correctOption + "]";
	}
	
	
	
}
