package com.gapsi.examen.vo;

import java.io.Serializable;

public class ResultadoGenerico implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	private Boolean success;
	private Object reslt;
	private String message;
	
	
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Object getReslt() {
		return reslt;
	}
	public void setReslt(Object reslt, Class<Info> infoClass) {
		this.reslt = reslt;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}


	public void setReslt(Info staff) {
	}
}