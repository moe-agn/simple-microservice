package com.webpage.microservices.loginservice.service;


import org.springframework.stereotype.Service;

import com.webpage.microservices.loginservice.domain.Login;

@Service
public interface LoginService {

	public Login save(Login login);
	
	public Login getdatabyEmail(String email);

}
