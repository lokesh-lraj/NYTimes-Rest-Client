package com.restclient.NYTimesRestClient.dto;

import java.util.List;

public class Result {
	private String list_name;
	private String display_name;
	private String bestsellers_date;
	private String published_date;
	private Integer rank;
	private Integer rank_last_week;
	private Integer weeks_on_list;
	private Integer asterisk;
	private Integer dagger;
	private String amazon_product_url;
	private IsBan isbans;
	private List<BookDetails> book_details;
	private List<Review> reviews;
	public Result() {
		super();
	}
	public Result(String list_name, String display_name, String bestsellers_date, String published_date, Integer rank,
			Integer rank_last_week, Integer weeks_on_list, Integer asterisk, Integer dagger, String amazon_product_url,
			IsBan isbans, List<BookDetails> book_details, List<Review> reviews) {
		super();
		this.list_name = list_name;
		this.display_name = display_name;
		this.bestsellers_date = bestsellers_date;
		this.published_date = published_date;
		this.rank = rank;
		this.rank_last_week = rank_last_week;
		this.weeks_on_list = weeks_on_list;
		this.asterisk = asterisk;
		this.dagger = dagger;
		this.amazon_product_url = amazon_product_url;
		this.isbans = isbans;
		this.book_details = book_details;
		this.reviews = reviews;
	}
	public String getList_name() {
		return list_name;
	}
	public void setList_name(String list_name) {
		this.list_name = list_name;
	}
	public String getDisplay_name() {
		return display_name;
	}
	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}
	public String getBestsellers_date() {
		return bestsellers_date;
	}
	public void setBestsellers_date(String bestsellers_date) {
		this.bestsellers_date = bestsellers_date;
	}
	public String getPublished_date() {
		return published_date;
	}
	public void setPublished_date(String published_date) {
		this.published_date = published_date;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public Integer getRank_last_week() {
		return rank_last_week;
	}
	public void setRank_last_week(Integer rank_last_week) {
		this.rank_last_week = rank_last_week;
	}
	public Integer getWeeks_on_list() {
		return weeks_on_list;
	}
	public void setWeeks_on_list(Integer weeks_on_list) {
		this.weeks_on_list = weeks_on_list;
	}
	public Integer getAsterisk() {
		return asterisk;
	}
	public void setAsterisk(Integer asterisk) {
		this.asterisk = asterisk;
	}
	public Integer getDagger() {
		return dagger;
	}
	public void setDagger(Integer dagger) {
		this.dagger = dagger;
	}
	public String getAmazon_product_url() {
		return amazon_product_url;
	}
	public void setAmazon_product_url(String amazon_product_url) {
		this.amazon_product_url = amazon_product_url;
	}
	public IsBan getIsbans() {
		return isbans;
	}
	public void setIsbans(IsBan isbans) {
		this.isbans = isbans;
	}
	public List<BookDetails> getBook_details() {
		return book_details;
	}
	public void setBook_details(List<BookDetails> book_details) {
		this.book_details = book_details;
	}
	public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	} 
}
