package group35.sas.exceptions;

import org.springframework.http.HttpStatus;

public class ItemException {
    private final String message;
    private final Throwable cause;
    private final HttpStatus httpStatus;
    public ItemException(String message, Throwable cause, HttpStatus httpStatus) {
        this.message = message;
        this.cause = cause;
        this.httpStatus = httpStatus;
    }
    public String getMessage() {
        return message;
    }
    public Throwable getCause() {
        return cause;
    }
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
    

}
