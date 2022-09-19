package com.one.many;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class UserM {
	
	@Id
	@Column(name="us_id")
	private int usId;
	private String usName;
	
	@ManyToOne
	private AccountM question;

	public UserM(int usId, String usName, AccountM question) {
		super();
		this.usId = usId;
		this.usName = usName;
		this.question = question;
	}

	public UserM() {
		super();
	}

	public int getUsId() {
		return usId;
	}

	public void setUsId(int usId) {
		this.usId = usId;
	}

	public String getUsName() {
		return usName;
	}

	public void setUsName(String usName) {
		this.usName = usName;
	}

	public AccountM getQuestion() {
		return question;
	}

	public void setQuestion(AccountM question) {
		this.question = question;
	}
	
}
