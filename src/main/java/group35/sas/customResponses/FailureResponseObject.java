package group35.sas.customResponses;

import org.springframework.http.HttpStatus;

public class FailureResponseObject {
    String message;
    HttpStatus httpStatus;
    public FailureResponseObject(String message,HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }
    public String getMessage() {
        return message;
    }
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
    
    
}
