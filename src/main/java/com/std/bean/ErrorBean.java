package com.std.bean;

public class ErrorBean {

	private String url;
	private String message;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ErrorBean(String url, String message) {
		super();
		this.url = url;
		this.message = message;
	}

}
