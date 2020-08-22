package com.webpage.microservices.loginservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webpage.microservices.loginservice.domain.Login;
import com.webpage.microservices.loginservice.service.LoginService;

@RestController
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/logininfo/email/{email}")
	public Login getLogininfo(@PathVariable String email) {
		Login login = null;
		try {
		      login = loginService.getdatabyEmail(email);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error finding user",e);
		}
		return login;
	}
	
	@RequestMapping(value="/addlogininfo", method = RequestMethod.POST)
	public void addLoginInfo(@RequestBody Login login) {
		loginService.save(login);
	}

}
