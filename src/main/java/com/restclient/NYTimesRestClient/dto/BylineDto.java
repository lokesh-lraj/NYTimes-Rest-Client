package com.restclient.NYTimesRestClient.dto;

import java.util.List;

public class BylineDto {
	
	private String original;
	private List<PersonDto> person;
	private String organization;
	
	public String getOriginal() {
		return original;
	}
	public void setOriginal(String original) {
		this.original = original;
	}
	public List<PersonDto> getPerson() {
		return person;
	}
	public void setPerson(List<PersonDto> person) {
		this.person = person;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public BylineDto(String original, List<PersonDto> person, String organization) {
		super();
		this.original = original;
		this.person = person;
		this.organization = organization;
	}
	public BylineDto() {
		super();
	}
	
}
