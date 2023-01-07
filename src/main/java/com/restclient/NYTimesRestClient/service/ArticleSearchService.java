package com.restclient.NYTimesRestClient.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.restclient.NYTimesRestClient.dto.ArticleDto;

@Service
public class ArticleSearchService {
	
	@Autowired
	@Qualifier("getRestTemplate")
	private RestTemplate restTemplate;
	
	private static final String baseUrl = "https://api.nytimes.com/svc/search/v2/articlesearch.json";
	private static final String apiKey = "ohUkSWMUfRJ82btS9gmG4hKrPwSsMZpS";

	public ArticleDto searchArticleByKeyWord(String beginDate, String endDate, Boolean facet, String facet_fields,
			Boolean facet_filter, String fl, String fq, Integer page, String q, String sort) {
		
		final URI uri = URI.create(baseUrl + "?begin_date="+beginDate +"&end_date="+endDate +"&facet="+facet +"&facet_fields="+facet_fields
				+"&facet_filter="+facet_filter +"&fl="+fl +"&fq="+fq +"&page="+page +"&q="+q +"&sort="+sort +"&api-key="+apiKey);
		final HttpHeaders headers = new HttpHeaders();
		
		ParameterizedTypeReference<ArticleDto> response = new ParameterizedTypeReference<ArticleDto>() {};
		RequestEntity<?> request = new RequestEntity<>(headers, HttpMethod.GET, uri);
		
		ResponseEntity<ArticleDto> result = this.restTemplate.exchange(request, response);
		return result.getBody();
	}

}
