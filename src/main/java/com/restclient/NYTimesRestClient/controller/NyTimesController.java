package com.restclient.NYTimesRestClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restclient.NYTimesRestClient.dto.BookListDTO;
import com.restclient.NYTimesRestClient.service.ArticleSearchService;
import com.restclient.NYTimesRestClient.service.BookService;

@RestController
@RequestMapping("/nytimes")
public class NyTimesController {

	@Autowired
	private ArticleSearchService articleSearch;

	@Autowired
	private BookService bookService;

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello!";
	}

	@GetMapping("/searchArticle")
	public void getArticleByKeyWord(@RequestParam(name="beginDate", required = true) final String beginDate,
			@RequestParam(name = "endDate", required = true) final String endDate,
			@RequestParam(name = "facet", required = true) final Boolean facet,
			@RequestParam(name = "facet_fields", required = true) final String facet_fields,
			@RequestParam(name = "facet_filter", required = true) final Boolean facet_filter,
			@RequestParam(name = "fl", required = true) final String fl,
			@RequestParam(name = "fq", required = true) final String fq,
			@RequestParam(name = "page", required = true) final Integer page,
			@RequestParam(name="query", required=true) final String q,
			@RequestParam(name = "sort", required = true) final String sort) {
		this.articleSearch.searchArticleByKeyWord(beginDate, endDate, facet, facet_fields, facet_filter, fl, fq, page, q, sort);
	}

	@GetMapping("/bookList")
	public BookListDTO getBookList(@RequestParam(name = "list", required = true)final String list,  
			@RequestParam(name="bestsellers-date", required=true)final String bestsellers_date, 
			@RequestParam(name="published-date", required=true)final String published_date, 
			@RequestParam(name="offset", required=true)final Integer offset) {
		return this.bookService.getBookList(list, bestsellers_date, published_date, offset);
	}
}
