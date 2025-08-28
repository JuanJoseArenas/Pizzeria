package com.platzi.market.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain (HttpSecurity http) throws Exception{
        http
                .csrf(csrf -> csrf.disable()) // <--- aquí va el disable en estilo nuevo
                .authorizeHttpRequests(auth -> auth
                        //.requestMatchers("/saludar/**").permitAll()  // endpoints públicos
                        .anyRequest().authenticated()                 // todo lo demás protegido
                )
                .httpBasic(Customizer.withDefaults());            // autenticación básica

        return http.build();

    }

}
