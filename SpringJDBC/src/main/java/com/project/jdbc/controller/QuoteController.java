package com.project.jdbc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.jdbc.model.Quote;
import com.project.jdbc.repository.QuoteRepository;
import com.project.jdbc.service.QuoteService;

@RestController
public class QuoteController {
	
	
	@Autowired
	private QuoteService quoteService;
	
	@PostMapping("/addQuote")
	public Quote postDetails(@RequestBody Quote quote) {
		return quoteService.saveDetails(quote);
	}
	
	@GetMapping("/getQuote")
	public List<Quote> getDetails()
	{
		
		return quoteService.getAllDeatils();
	}

}
