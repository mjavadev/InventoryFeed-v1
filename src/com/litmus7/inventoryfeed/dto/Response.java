package com.litmus7.inventoryfeed.dto;

public class Response<T, U, V> {
	
	private T data;
	private U applicationStatus;
	private V message;
	
	public Response(T data, U applicationStatus, V message) {
		this.data = data;
		this.applicationStatus = applicationStatus;
		this.message = message;
	}
	
	public Response(U applicationStatus, V message) {
		this.applicationStatus = applicationStatus;
		this.message = message;
	}

	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	public U getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(U applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	
	public V getMessage() {
		return message;
	}
	public void setMessage(V message) {
		this.message = message;
	}
	
}
