package web.handler;

import core.dto.UserCreated;
import core.dto.UserRegistration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionGlobalHandler {
    @ExceptionHandler
    public ResponseEntity<UserRegistration> handlerNPE(NullPointerException e){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new UserRegistration());
    }


}
