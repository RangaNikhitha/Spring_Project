package com.project.task.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="task_db") 
public class Task {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="task_Id")
	private Long id;
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="task_string")
	private String quote;
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote=quote;
	}
	@Override
	public String toString() {
		return "Quote [id=" + id + ", quote=" + quote + "]";
	}

	public Task(Long id, String quote) {
		this.id = id;
		this.quote = quote;
	}

	public Task() {
		super();
	}

}
