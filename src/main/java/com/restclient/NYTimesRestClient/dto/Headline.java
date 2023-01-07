package com.restclient.NYTimesRestClient.dto;

public class Headline {
	private String main;
	private String kicker;
	private String contentKicker;
	private String printHeadline;
	private String name;
	private String seo;
	private String sub;
	
	public Headline() {
		super();
	}
	public Headline(String main, String kicker, String contentKicker, String printHeadline, String name, String seo,
			String sub) {
		super();
		this.main = main;
		this.kicker = kicker;
		this.contentKicker = contentKicker;
		this.printHeadline = printHeadline;
		this.name = name;
		this.seo = seo;
		this.sub = sub;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public String getKicker() {
		return kicker;
	}
	public void setKicker(String kicker) {
		this.kicker = kicker;
	}
	public String getContentKicker() {
		return contentKicker;
	}
	public void setContentKicker(String contentKicker) {
		this.contentKicker = contentKicker;
	}
	public String getPrintHeadline() {
		return printHeadline;
	}
	public void setPrintHeadline(String printHeadline) {
		this.printHeadline = printHeadline;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeo() {
		return seo;
	}
	public void setSeo(String seo) {
		this.seo = seo;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	
}
