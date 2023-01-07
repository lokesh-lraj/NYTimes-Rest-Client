package com.restclient.NYTimesRestClient.dto;

public class PersonDto {

	private String firstName;
	private String middleName;
	private String lastName;
	private String qualifier;
	private String title;
	private String role;
	private String organization;
	private Integer rank;

	public PersonDto(String firstName, String middleName, String lastName, String qualifier, String title, String role,
			String organization, Integer rank) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.qualifier = qualifier;
		this.title = title;
		this.role = role;
		this.organization = organization;
		this.rank = rank;
	}

	public PersonDto() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getQualifier() {
		return qualifier;
	}

	public void setQualifier(String qualifier) {
		this.qualifier = qualifier;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

}
