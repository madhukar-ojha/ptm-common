package com.ptm.common.service;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorResponse {
	private ServiceException serviceException;
	
	@JsonCreator
	public ErrorResponse(@JsonProperty("serviceException") ServiceException serviceException) {
		this.serviceException = serviceException;
	}

	public ServiceException getServiceException() {
		return serviceException;
	}
}
