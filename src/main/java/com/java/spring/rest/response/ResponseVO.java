package com.java.spring.rest.response;

public class ResponseVO {

	
	 private String status;
	 private Integer code;
	 private String greeting;
	
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	
	
}
