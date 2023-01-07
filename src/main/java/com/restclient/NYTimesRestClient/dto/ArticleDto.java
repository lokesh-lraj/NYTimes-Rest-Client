package com.restclient.NYTimesRestClient.dto;

import java.util.List;

public class ArticleDto {
	private String webUrl;
	private String snippet;
	private Integer printPage;
	private String printSection;
	private String source;
	private List<MultimediaDto> multimedia;
	private Headline headline;
	private List<KeywordDto> keywords;
	private String publicationDate;
	private String documentType;
	private String newsDesk;
	private String sectionName;
	private BylineDto byline;
	private String typeOfMaterial;
	private String id;
	private Integer wordCount;
	private String uri;
	
	public ArticleDto(String webUrl, String snippet, Integer printPage, String printSection, String source,
			List<MultimediaDto> multimedia, Headline headline, List<KeywordDto> keywords, String publicationDate,
			String documentType, String newsDesk, String sectionName, BylineDto byline, String typeOfMaterial,
			String id, Integer wordCount, String uri) {
		super();
		this.webUrl = webUrl;
		this.snippet = snippet;
		this.printPage = printPage;
		this.printSection = printSection;
		this.source = source;
		this.multimedia = multimedia;
		this.headline = headline;
		this.keywords = keywords;
		this.publicationDate = publicationDate;
		this.documentType = documentType;
		this.newsDesk = newsDesk;
		this.sectionName = sectionName;
		this.byline = byline;
		this.typeOfMaterial = typeOfMaterial;
		this.id = id;
		this.wordCount = wordCount;
		this.uri = uri;
	}
	public ArticleDto() {
		super();
	}
	public String getWebUrl() {
		return webUrl;
	}
	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}
	public String getSnippet() {
		return snippet;
	}
	public void setSnippet(String snippet) {
		this.snippet = snippet;
	}
	public Integer getPrintPage() {
		return printPage;
	}
	public void setPrintPage(Integer printPage) {
		this.printPage = printPage;
	}
	public String getPrintSection() {
		return printSection;
	}
	public void setPrintSection(String printSection) {
		this.printSection = printSection;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public List<MultimediaDto> getMultimedia() {
		return multimedia;
	}
	public void setMultimedia(List<MultimediaDto> multimedia) {
		this.multimedia = multimedia;
	}
	public Headline getHeadline() {
		return headline;
	}
	public void setHeadline(Headline headline) {
		this.headline = headline;
	}
	public List<KeywordDto> getKeywords() {
		return keywords;
	}
	public void setKeywords(List<KeywordDto> keywords) {
		this.keywords = keywords;
	}
	public String getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public String getNewsDesk() {
		return newsDesk;
	}
	public void setNewsDesk(String newsDesk) {
		this.newsDesk = newsDesk;
	}
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	public BylineDto getByline() {
		return byline;
	}
	public void setByline(BylineDto byline) {
		this.byline = byline;
	}
	public String getTypeOfMaterial() {
		return typeOfMaterial;
	}
	public void setTypeOfMaterial(String typeOfMaterial) {
		this.typeOfMaterial = typeOfMaterial;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getWordCount() {
		return wordCount;
	}
	public void setWordCount(Integer wordCount) {
		this.wordCount = wordCount;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
}
