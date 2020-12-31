package com.ptm.common.service;

import java.util.Collections;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceException {
	private String errorCode;
	private String shortMessage;
	private String longMessage;
	private Map<String, Object> errorMap;
	
	@JsonCreator
	public ServiceException(@JsonProperty("errorCode") String errorCode, @JsonProperty("shortMessage") String shortMessage, @JsonProperty("longMessage") String longMessage, @JsonProperty("errorMap") Map<String, Object> errorMap) {
		this.errorCode = errorCode;
		this.shortMessage = shortMessage;
		this.longMessage = longMessage;
		this.errorMap = errorMap;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getShortMessage() {
		return shortMessage;
	}

	public String getLongMessage() {
		return longMessage;
	}

	public Map<String, Object> getErrorMap() {
		return Collections.unmodifiableMap(errorMap);
	}

}
