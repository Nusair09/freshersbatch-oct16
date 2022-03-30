package io.javabrains.springsecurityjdbc;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfiguration{
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication();

    }
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		        .antMatchers("/admin").hasRole("ADMIN")
		        .antMatchers("/user").hasAnyRole("ADMIN","USER")
		        .antMatchers("/").permitAll()
		        .and().formLogin();
		        
	}
	
}
