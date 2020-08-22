package com.webpage.microservices.profileupdate.repository;


import org.springframework.data.repository.CrudRepository;

import com.webpage.microservices.profileupdate.domain.Profile;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
	

}
