package com.security.form.ecoder.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.security.form.ecoder.model.User;
import com.security.form.ecoder.web.dto.UserRegistrationDto;


public interface UserService  extends UserDetailsService{
	  User save(UserRegistrationDto registrationDto);

	}

