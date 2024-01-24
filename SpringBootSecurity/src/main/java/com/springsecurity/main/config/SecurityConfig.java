package com.springsecurity.main.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class SecurityConfig {


    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    	http.csrf(csrf->csrf.disable())
    	.authorizeHttpRequests()
    	.requestMatchers("/users/").hasRole("ADMIN")
    	.requestMatchers("/users/{uname}").permitAll()
    	.anyRequest().authenticated()
    	.and()
    	.httpBasic();
        return http.build();// Returns Security filter chain
    }

}
