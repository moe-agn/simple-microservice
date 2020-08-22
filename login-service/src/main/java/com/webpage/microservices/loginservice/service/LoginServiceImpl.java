package com.webpage.microservices.loginservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webpage.microservices.loginservice.domain.Login;
import com.webpage.microservices.loginservice.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginRepository loginRepository;
	
	@Override
	public Login save(Login login) {
		
		return loginRepository.save(login);
	} 

	@Override
	public Login getdatabyEmail(String email) {
		return  loginRepository.findByEmail(email);
	}


}
