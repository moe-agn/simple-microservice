package com.webpage.microservices.loginservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.webpage.microservices.loginservice.domain.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {
	
	Login findByEmail(String email);

}
