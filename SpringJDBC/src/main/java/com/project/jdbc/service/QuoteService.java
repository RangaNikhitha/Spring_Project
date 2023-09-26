package com.project.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.jdbc.model.Quote;
import com.project.jdbc.repository.QuoteRepository;

@Service
public class QuoteService {
	@Autowired
	private QuoteRepository quoteRepo;
	
	public Quote saveDetails(Quote quote) {
		return quoteRepo.save(quote);
	}

	public List<Quote> getAllDeatils(){
		return quoteRepo.findAll();
	}
}
