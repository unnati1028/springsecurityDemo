package com.cogent.springsecurityDemo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.cogent.springsecurityDemo.security.jwt.AuthTokenFilter;
import com.cogent.springsecurityDemo.security.service.UserDetailsServiceImpl;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

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
protected void configure(AuthenticationManagerBuilder auth)throws Exception{
	auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
}
@Bean
@Override
public AuthenticationManager authenticationManagerBean() throws Exception {
  return super.authenticationManagerBean();
}

@Bean
public PasswordEncoder passwordEncoder() {
  return new BCryptPasswordEncoder();
}

}
