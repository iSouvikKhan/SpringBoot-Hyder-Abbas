package com.telusko.model.cx;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer
{

	@Id
	private Integer cid;
	
	
	
	private String cname;
	
	private String email;

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + "]";
	}
	
	
}
