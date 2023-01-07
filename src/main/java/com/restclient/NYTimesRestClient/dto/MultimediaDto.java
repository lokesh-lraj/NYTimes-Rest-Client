package com.restclient.NYTimesRestClient.dto;

public class MultimediaDto {
	
	private Integer rank;
	private String subtype;
	private String caption;
	private String credit;
	private String type;
	private String url;
	private Integer height;
	private Integer width;
	private Legacy legacy;
	private String cropName;
	
	public MultimediaDto(Integer rank, String subtype, String caption, String credit, String type, String url,
			Integer height, Integer width, Legacy legacy, String cropName) {
		super();
		this.rank = rank;
		this.subtype = subtype;
		this.caption = caption;
		this.credit = credit;
		this.type = type;
		this.url = url;
		this.height = height;
		this.width = width;
		this.legacy = legacy;
		this.cropName = cropName;
	}
	public MultimediaDto() {
		super();
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public String getSubtype() {
		return subtype;
	}
	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Legacy getLegacy() {
		return legacy;
	}
	public void setLegacy(Legacy legacy) {
		this.legacy = legacy;
	}
	public String getCropName() {
		return cropName;
	}
	public void setCropName(String cropName) {
		this.cropName = cropName;
	}
	
}
