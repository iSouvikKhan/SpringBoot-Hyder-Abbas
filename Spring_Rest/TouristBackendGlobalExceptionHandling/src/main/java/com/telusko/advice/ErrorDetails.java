package com.telusko.advice;

import java.time.LocalDateTime;

public class ErrorDetails 
{

	private String msg;
	private LocalDateTime dateTime;
	@Override
	public String toString() {
		return "ErrorDetails [msg=" + msg + ", dateTime=" + dateTime + "]";
	}
	public ErrorDetails(String msg, LocalDateTime dateTime) {
		super();
		this.msg = msg;
		this.dateTime = dateTime;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public ErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
