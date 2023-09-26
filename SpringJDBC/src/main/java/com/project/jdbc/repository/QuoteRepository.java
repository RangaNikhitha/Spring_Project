package com.project.jdbc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.project.jdbc.model.Quote;

public interface QuoteRepository extends JpaRepository<Quote, Long>{
	// public List<Quote> findAll();

	// public List<Quote> findByID();
	

}
