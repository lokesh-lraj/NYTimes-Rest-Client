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

	@GetMapping
	public void getArticleByKeyWord(final String keyword) {
		this.articleSearch.searchArticleByKeyWord(keyword);
	}

	@GetMapping("/bookList")
	public BookListDTO getBookList(@RequestParam(name = "list", required = true)final String list,  
			@RequestParam(name="bestsellers-date", required=true)final String bestsellers_date, 
			@RequestParam(name="published-date", required=true)final String published_date, 
			@RequestParam(name="offset", required=true)final Integer offset) {
		return this.bookService.getBookList(list, bestsellers_date, published_date, offset);
	}
}
