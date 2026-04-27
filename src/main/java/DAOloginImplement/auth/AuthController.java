package DAOloginImplement.auth;

import DAOloginImplement.dtos.LoginRequest;
import DAOloginImplement.dtos.LoginResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
public class AuthController {



    @PostMapping("/register")
    ResponseEntity<LoginResponse> register(@Valid @RequestBody LoginRequest request){

        return ResponseEntity.created(null).body(null);
    }




}
