package com.project.jdbc.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="details_db") 
public class Quote {
	
	public Quote() {
		super();
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="detailId")
	private Long id;
	public Long getId() {
		return id;
	}
	@Column(name="detail_string")
	private String quote;
	public String getQuote() {
		return quote;
	}
	public void setQuote(String Quote) {
		this.quote=quote;
	}
	
}
