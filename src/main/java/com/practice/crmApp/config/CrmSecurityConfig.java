package com.practice.crmApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.servlet.util.matcher.MvcRequestMatcher;
import org.springframework.web.servlet.handler.HandlerMappingIntrospector;

@Configuration
public class CrmSecurityConfig {

    @Bean
    MvcRequestMatcher.Builder mvc(HandlerMappingIntrospector introspector) {
        return new MvcRequestMatcher.Builder(introspector);
    }

    @Bean
    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http, MvcRequestMatcher.Builder mvc) throws Exception{
        http.authorizeHttpRequests(request->{
            try {
                request.requestMatchers(mvc.pattern("/AddCustomer")).authenticated()
                        .anyRequest().permitAll()
                        .and().formLogin()
                        .and().httpBasic();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        return (SecurityFilterChain) http.build();
    }
}
