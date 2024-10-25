package group35.sas.customResponses;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class FailureResponse {
    
    public ResponseEntity<Object> getResponse(String message){
        FailureResponseObject res = new FailureResponseObject(message, HttpStatus.CONFLICT);
        return new ResponseEntity<>(res,HttpStatus.CONFLICT);
    }
}
