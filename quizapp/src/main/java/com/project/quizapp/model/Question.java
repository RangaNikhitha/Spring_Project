package com.project.quizapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Questions_db") 
public class Question {
	

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
	@Override
	public String toString() {
		return "Quote [id=" + id + ", quote=" + quote + "]";
	}

}
