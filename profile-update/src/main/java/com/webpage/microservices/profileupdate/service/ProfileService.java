package com.webpage.microservices.profileupdate.service;


import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.webpage.microservices.profileupdate.domain.Profile;

@Service
public interface ProfileService {

	public Profile save(Profile profile);
	
	public Profile getdatabyId(Long id);

	public void saveImage(MultipartFile profileimage, Profile profile) throws Exception;

}
