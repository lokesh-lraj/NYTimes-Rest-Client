package com.restclient.NYTimesRestClient.dto;

public class IsBan {

	private String isbn10;
	private String isbn13;
	
	public IsBan() {
	}

	public IsBan(String isbn10, String isbn13) {
		super();
		this.isbn10 = isbn10;
		this.isbn13 = isbn13;
	}

	public String getIsbn10() {
		return isbn10;
	}

	public void setIsbn10(String isbn10) {
		this.isbn10 = isbn10;
	}

	public String getIsbn13() {
		return isbn13;
	}

	public void setIsbn13(String isbn13) {
		this.isbn13 = isbn13;
	}
}
