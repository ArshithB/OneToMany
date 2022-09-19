package com.one.many;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class AccountM {
	
	@Id
	@Column(name="ac_id")
	private int acId;
	private String acName;
	
	@OneToMany
	private List<UserM> answer;

	public AccountM(int acId, String acName, List<UserM> answer) {
		super();
		this.acId = acId;
		this.acName = acName;
		this.answer = answer;
	}

	public AccountM() {
		super();
	}

	public int getAcId() {
		return acId;
	}

	public void setAcId(int acId) {
		this.acId = acId;
	}

	public String getAcName() {
		return acName;
	}

	public void setAcName(String acName) {
		this.acName = acName;
	}

	public List<UserM> getAnswer() {
		return answer;
	}

	public void setAnswer(List<UserM> answer) {
		this.answer = answer;
	}
	
}
