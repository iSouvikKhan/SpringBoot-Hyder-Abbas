package com.telusko.model.pd;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product
{
	@Id
	private Integer pid;
	
	private String pcode;
	
	private String pname;

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pcode=" + pcode + ", pname=" + pname + "]";
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}
	
	

}
