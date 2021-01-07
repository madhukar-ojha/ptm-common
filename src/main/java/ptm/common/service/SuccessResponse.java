package ptm.common.service;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SuccessResponse {
	private Object response;
	
	@JsonCreator
	public <T> SuccessResponse(@JsonProperty("response") T response) {
		this.response = response;
	}
	
	@SuppressWarnings("unchecked")
	public <T> T getResponse() {
		return (T)response;
	}

}
