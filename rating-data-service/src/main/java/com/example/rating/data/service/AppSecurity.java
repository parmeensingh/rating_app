package com.example.rating.data.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class AppSecurity {
	
//	@Bean
//	UserDetailsService userDetailsService() {
//		InMemoryUserDetailsManager userDetailService = new InMemoryUserDetailsManager();
//		UserDetails user=User.withUsername("Tom")
//				.password(PasswordEncoder().encode("Cruise")).authorities("read").build();
//		userDetailService.createUser(user);
//		return userDetailService;
//	}
	@Bean
	public PasswordEncoder PasswordEncoder() {
		// TODO Auto-generated method stub
		return new BCryptPasswordEncoder();
	}
	@SuppressWarnings("removal")
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.formLogin().and() 
		.authorizeRequests().anyRequest().authenticated();
		
		return http.build();
	}
}
