package DAOloginImplement.shared;

import DAOloginImplement.exception.UserAlreadyExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserAlreadyExistsException.class)
    public ResponseEntity<ErrorDefault> handleUserAlreadyExistsException (UserAlreadyExistsException e){
        URI uriError = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
       ErrorDefault error = new ErrorDefault(HttpStatus.CONFLICT.value(),
               uriError.toString(),
               LocalDateTime.now(),
               e.getMessage());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(error);
    }
}
