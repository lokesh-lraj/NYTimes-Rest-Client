package com.restclient.NYTimesRestClient.dto;

import java.util.List;

public class BookListDTO {

	private String status;
	private String copyright;
	private Integer num_results;
	private String last_modified;
	private List<Result> results;
	
	public BookListDTO() {
	}

	public BookListDTO(String status, String copyright, Integer num_results, String last_modified,
			List<Result> results) {
		super();
		this.status = status;
		this.copyright = copyright;
		this.num_results = num_results;
		this.last_modified = last_modified;
		this.results = results;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public Integer getNum_results() {
		return num_results;
	}

	public void setNum_results(Integer num_results) {
		this.num_results = num_results;
	}

	public String getLast_modified() {
		return last_modified;
	}

	public void setLast_modified(String last_modified) {
		this.last_modified = last_modified;
	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}	
}
