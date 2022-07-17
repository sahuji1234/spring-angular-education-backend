package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="contact_us")
public class ContactEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="question")
	private String question;
	
	@Column(name="answer")
	private String answer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public ContactEntity(Long id, String email, String question, String answer) {
		super();
		this.id = id;
		this.email = email;
		this.question = question;
		this.answer = answer;
	}

	public ContactEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ContactEntity [id=" + id + ", email=" + email + ", question=" + question + ", answer=" + answer + "]";
	}
	
	
	
}
