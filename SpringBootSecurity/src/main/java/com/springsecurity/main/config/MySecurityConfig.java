package com.springsecurity.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class MySecurityConfig {

    @Bean
    UserDetailsService userDetailsService() {
		UserDetails user=User.builder().username("Subhajit").password(passwordEncoder().encode("Subhajit@123")).roles("ADMIN").build();
		UserDetails user1=User.builder().username("Sayan").password(passwordEncoder().encode("Sayan@123")).roles("NORMAL").build();
		return new InMemoryUserDetailsManager(user,user1);
	}
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	

}
