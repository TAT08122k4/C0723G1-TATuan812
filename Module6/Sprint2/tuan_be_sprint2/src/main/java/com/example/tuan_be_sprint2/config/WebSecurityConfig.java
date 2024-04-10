package com.example.tuan_be_sprint2.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class WebSecurityConfig {
    @Autowired
    private JwtTokenFilter jwtTokenFilter;

    @Bean
    CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        List<String> allowOrigins = new ArrayList<>();
        allowOrigins.add("http://localhost:3000");
        configuration.setAllowedOriginPatterns(allowOrigins);
        configuration.setAllowedMethods(Collections.singletonList("*"));
        configuration.setAllowedHeaders(Collections.singletonList("*"));
        configuration.setAllowCredentials(true);
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.cors().configurationSource(corsConfigurationSource()).and().csrf()
                .disable().addFilterBefore(jwtTokenFilter, UsernamePasswordAuthenticationFilter.class)
                .authorizeHttpRequests(requests -> {
                    requests
                            .requestMatchers(("/account/register"),
                                    ("/account/login"))
                            .permitAll()
                            .requestMatchers(HttpMethod.GET, ("/book/**")).permitAll()
                            .requestMatchers(HttpMethod.GET, ("/cart/list/**")).hasAnyRole("USER", "ADMIN")
                            .requestMatchers(HttpMethod.PATCH, ("/cart/updateQuanlity/**")).hasAnyRole("USER", "ADMIN")
                            .requestMatchers(HttpMethod.DELETE, ("/cart/deleteItemInCart/**")).hasAnyRole("USER", "ADMIN")
                            .requestMatchers(HttpMethod.GET , ("/account/find/**")).hasAnyRole("USER" , "ADMIN")
                            .requestMatchers(HttpMethod.PATCH , ("/account/edit")).hasAnyRole("USER","ADMIN")
                            .requestMatchers(HttpMethod.POST , ("/admin/**")).hasRole("ADMIN")
                            .requestMatchers(HttpMethod.GET,("/cart/historyBooking/**")).hasAnyRole("USER","ADMIN")
                            .requestMatchers(HttpMethod.GET , ("/payment/**")).hasAnyRole("USER","ADMIN")
                            .anyRequest().permitAll()


//                            .requestMatchers(HttpMethod.GET, ("/account/findById")).hasAnyRole("USER", "ADMIN")
//                            .requestMatchers(HttpMethod.GET, ("/booking/quantityCart/")).hasAnyRole("USER", "ADMIN")
//                            .requestMatchers(HttpMethod.GET, ("/booking")).hasAnyRole("USER", "ADMIN")
//                            .requestMatchers(HttpMethod.POST, ("/booking/**")).hasAnyRole("USER", "ADMIN")
//                            .requestMatchers(HttpMethod.GET, ("/booking/price")).hasAnyRole("USER", "ADMIN")
//                            .requestMatchers(HttpMethod.POST, ("/booking/setQuantity")).hasAnyRole("USER", "ADMIN")
//                            .requestMatchers(HttpMethod.GET, ("/booking/**")).hasAnyRole("USER", "ADMIN")
//                            .requestMatchers(HttpMethod.GET, ("/payment/**")).hasAnyRole("USER", "ADMIN")
//                            .requestMatchers(HttpMethod.GET, ("/admin/**")).hasAnyRole("ADMIN")
//                            .anyRequest().permitAll()

                    ;
                })
        ;
        return http.build();
    }
}
