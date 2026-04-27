package DAOloginImplement.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@RequiredArgsConstructor
@Configuration
public class SecurityConfig {

    @Order(1)
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

        http.csrf(csrf -> csrf.disable())
                .httpBasic(basic -> basic.disable())
                .formLogin(login -> login.disable())
                .authorizeHttpRequests(
                        authorize -> authorize
                                .requestMatchers(HttpMethod.POST, "/auth/login").permitAll()
                                .requestMatchers(HttpMethod.POST,"/auth/register").permitAll()
                                .requestMatchers(HttpMethod.POST,"").permitAll()
                                .requestMatchers(HttpMethod.POST, "").permitAll()
                                .anyRequest().authenticated()
                );
        return http.build();
    }

    @Order(2)
    @Bean
    public SecurityFilterChain filterChainWithJWt(HttpSecurity http) throws Exception{

        http.csrf(csrf -> csrf.disable())
                .httpBasic(basic -> basic.disable())
                .formLogin(login -> login.disable())
                .authorizeHttpRequests(
                        authorize -> authorize
                                .requestMatchers(HttpMethod.POST, "/auth/login").permitAll()
                                .requestMatchers(HttpMethod.POST,"/auth/register").permitAll()
                                .requestMatchers(HttpMethod.POST,"").permitAll()
                                .requestMatchers(HttpMethod.POST, "").permitAll()
                                .anyRequest().authenticated()
                );
        return http.build();
    }

    @Bean
    public PasswordEncoder encoder (){

        return new BCryptPasswordEncoder(10);
    }

    @Bean
    public AuthenticationManager authManager(AuthenticationConfiguration configuration){
        return configuration.getAuthenticationManager();
    }

}
