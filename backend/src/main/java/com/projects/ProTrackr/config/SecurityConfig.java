package com.projects.ProTrackr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    // Define your own users
//    @Bean
////    public UserDetailsService userDetailsService(PasswordEncoder encoder) {
////        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
////        manager.createUser(
////                User.withUsername("admin")
////                        .password(encoder.encode("admin123"))
////                        .roles("ADMIN")
////                        .build()
////        );
////        manager.createUser(
////                User.withUsername("user")
////                        .password(encoder.encode("user123"))
////                        .roles("USER")
////                        .build()
////        );
////        return manager;
////    }
////
////    // Password encoding
////    @Bean
////    public PasswordEncoder passwordEncoder() {
////        return new BCryptPasswordEncoder();
////    }
////
////    // Security rules
////    @Bean
////    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
////        http
////            .csrf(csrf -> csrf.disable()) // disable CSRF for simplicity (enable in prod!)
////            .authorizeHttpRequests(auth -> auth
////                .requestMatchers("/public/**").permitAll() // no auth for /public/**
////                .anyRequest().authenticated()              // all other endpoints need login
////            )
////            .formLogin(form -> form.permitAll())  // enable form login
////            .httpBasic(httpBasic -> {});          // enable basic auth (useful for API testing)
////        return http.build();
////    }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // disable CSRF for dev / API usage
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll() // allow all requests
                );

        return http.build();
    }
}
