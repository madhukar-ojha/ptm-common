package ptm.common.service;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceResponse {
	private SuccessResponse successResponse;
	private ErrorResponse errorResponse;
	private HttpStatus httpStatus;

	@JsonCreator
	public ServiceResponse(@JsonProperty("successResponse") SuccessResponse successResponse,
			@JsonProperty("errorResponse") ErrorResponse errorResponse,
			@JsonProperty("httpStatus") HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
		this.successResponse = successResponse;
		this.errorResponse = errorResponse;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public SuccessResponse getSuccessResponse() {
		return successResponse;
	}

	public ErrorResponse getErrorResponse() {
		return errorResponse;
	}

}
