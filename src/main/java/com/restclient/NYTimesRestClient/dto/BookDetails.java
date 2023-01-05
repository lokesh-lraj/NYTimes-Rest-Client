package com.restclient.NYTimesRestClient.dto;

public class BookDetails {
	private String title;
	private String discription;
	private String contributor;
	private String author;
	private String contributor_note;
	private Integer price;
	private String age_group;
	private String publisher;
	private String primary_isbn13;
	private String primary_isbn10;
	
	public BookDetails() {
		super();
	}

	public BookDetails(String title, String discription, String contributor, String author, String contributor_note,
			Integer price, String age_group, String publisher, String primary_isbn13, String primary_isbn10) {
		super();
		this.title = title;
		this.discription = discription;
		this.contributor = contributor;
		this.author = author;
		this.contributor_note = contributor_note;
		this.price = price;
		this.age_group = age_group;
		this.publisher = publisher;
		this.primary_isbn13 = primary_isbn13;
		this.primary_isbn10 = primary_isbn10;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getContributor() {
		return contributor;
	}

	public void setContributor(String contributor) {
		this.contributor = contributor;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContributor_note() {
		return contributor_note;
	}

	public void setContributor_note(String contributor_note) {
		this.contributor_note = contributor_note;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getAge_group() {
		return age_group;
	}

	public void setAge_group(String age_group) {
		this.age_group = age_group;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPrimary_isbn13() {
		return primary_isbn13;
	}

	public void setPrimary_isbn13(String primary_isbn13) {
		this.primary_isbn13 = primary_isbn13;
	}

	public String getPrimary_isbn10() {
		return primary_isbn10;
	}

	public void setPrimary_isbn10(String primary_isbn10) {
		this.primary_isbn10 = primary_isbn10;
	}
}
