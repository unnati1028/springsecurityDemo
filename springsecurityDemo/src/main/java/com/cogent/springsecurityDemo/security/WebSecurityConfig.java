package com.cogent.springsecurityDemo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.cogent.springsecurityDemo.security.jwt.AuthTokenFilter;
import com.cogent.springsecurityDemo.security.service.UserDetailsServiceImpl;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableGlobalMethodSecurity;
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
@Autowired
UserDetailsServiceImpl userDetailsService;
@Autowired
private
@Bean
public AuthTokenFilter authenticationJwtTokenFilter() {
	return new AuthTokenFilter();
}
}
