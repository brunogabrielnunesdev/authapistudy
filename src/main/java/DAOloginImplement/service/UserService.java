package DAOloginImplement.service;

import DAOloginImplement.dtos.LoginRequest;
import DAOloginImplement.dtos.LoginResponse;
import DAOloginImplement.exception.UserAlreadyExistsException;
import DAOloginImplement.exception.UserNotFoundException;
import DAOloginImplement.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public LoginResponse createUser(LoginRequest user){
        if (repository.existsByEmail(user.email())){
            throw new UserAlreadyExistsException("This User already exists");
        }

        repository.save(user);
        return null;
    }

}
