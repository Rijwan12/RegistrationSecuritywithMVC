package com.security.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.security.model.User;
import com.security.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
	
	User save(UserRegistrationDto registrationdto);

}
