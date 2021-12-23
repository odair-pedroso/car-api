package unifacef.carsapi.gateways.inputs.http.handlers;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import unifacef.carsapi.gateways.inputs.http.responses.ErrorResponse;


@RestControllerAdvice
public class CustomExceptionHandler {
	
	private static final String CONTENT_TYPE = "Content-Type";
	private static final String APPLICATION_JSON_CHARSET_UTF_8 = "application/json; charset=utf-8";
	
	
	
	public HttpEntity<ErrorResponse> handleNotFoundException (){
		return null;
		
		
		
		
		
		
	}
	
	
	
	

}
