package DAOloginImplement.auth;

import DAOloginImplement.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

@RequiredArgsConstructor
public class AuthService {


    private final PasswordEncoder encoder;
    private final UserRepository repository;
    private final AuthenticationManager manager;


}

