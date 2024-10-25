package group35.sas.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ItemNotFoundExceptionHandler {
 
    @ExceptionHandler(value = {ItemNotFoundException.class})
    public ResponseEntity<Object> handleItemNotFoundException(
        ItemNotFoundException itemNotFoundException
    ){
        ItemException itemException = new ItemException(
            itemNotFoundException.getMessage()
            ,itemNotFoundException.getCause(),
             HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(itemException,HttpStatus.NOT_FOUND);
    }
}
