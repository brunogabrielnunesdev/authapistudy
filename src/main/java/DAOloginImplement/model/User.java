package DAOloginImplement.model;

import jakarta.persistence.*;
import lombok.Data;
import org.jspecify.annotations.Nullable;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Table
@Entity
@Data
public class User implements UserDetails {

    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    UUID id;
    @Column(name = "name")
    String name;

    @Column(name = "email")
    String email;

    @Column(name = "password")
    String password;

    @Enumerated(EnumType.STRING)
    Roles roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_"+roles.name()));
    }

    @Override
    public String getUsername() {
        return email;
    }
}

