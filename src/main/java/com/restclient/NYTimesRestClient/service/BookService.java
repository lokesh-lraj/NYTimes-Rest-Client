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

import com.restclient.NYTimesRestClient.dto.BookListDTO;

@Service
public class BookService {
	
	private static final String baseUrl = "https://api.nytimes.com/svc/books/v3/lists.json";
	private static final String apiKey = "ohUkSWMUfRJ82btS9gmG4hKrPwSsMZpS";
	
	@Autowired
	@Qualifier("getRestTemplate")
	private RestTemplate restTemplate;

	public BookListDTO getBookList(final String list, final String bestsellers_date, final String published_date, final Integer offset) {

		final URI uri = URI.create(baseUrl+"?list="+list+"&bestsellers-date="+bestsellers_date
				+"&published-date="+published_date+"&offset="+offset+"&api-key="+apiKey);
		final HttpHeaders headers = new HttpHeaders();
		final RequestEntity<?> reuqest = new RequestEntity<>(null, headers, HttpMethod.GET, uri);
		
		final ParameterizedTypeReference<BookListDTO> responseBean = new ParameterizedTypeReference<BookListDTO>() {};
		
		final ResponseEntity<BookListDTO> result = this.restTemplate.exchange(reuqest, responseBean);
	
		return result.getBody();
	}

}
