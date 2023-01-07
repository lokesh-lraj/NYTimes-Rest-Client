package com.restclient.NYTimesRestClient.dto;

public class KeywordDto {
	
	private String name;
	private String value;
	private Integer rank;
	private String major;
	
	public KeywordDto(String name, String value, Integer rank, String major) {
		super();
		this.name = name;
		this.value = value;
		this.rank = rank;
		this.major = major;
	}
	public KeywordDto() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}
