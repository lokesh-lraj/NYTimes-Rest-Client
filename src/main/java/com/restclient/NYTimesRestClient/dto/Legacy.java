package com.restclient.NYTimesRestClient.dto;

public class Legacy {
	
	private String xLarge;
	private Integer xLargeWidth;
	private Integer xLargeHeight;
	
	public Legacy(String xLarge, Integer xLargeWidth, Integer xLargeHeight) {
		super();
		this.xLarge = xLarge;
		this.xLargeWidth = xLargeWidth;
		this.xLargeHeight = xLargeHeight;
	}
	public Legacy() {
		super();
	}
	public String getxLarge() {
		return xLarge;
	}
	public void setxLarge(String xLarge) {
		this.xLarge = xLarge;
	}
	public Integer getxLargeWidth() {
		return xLargeWidth;
	}
	public void setxLargeWidth(Integer xLargeWidth) {
		this.xLargeWidth = xLargeWidth;
	}
	public Integer getxLargeHeight() {
		return xLargeHeight;
	}
	public void setxLargeHeight(Integer xLargeHeight) {
		this.xLargeHeight = xLargeHeight;
	}
}
