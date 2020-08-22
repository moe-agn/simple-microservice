package com.webpage.microservices.profileupdate.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.webpage.microservices.profileupdate.domain.Profile;
import com.webpage.microservices.profileupdate.service.ProfileService;

@RestController
public class ProfileController {

	private static final Logger logger = LoggerFactory.getLogger(ProfileController.class);

	@Autowired
	private ProfileService profileService;

	@RequestMapping("/profileinfo/id/{id}")
	public Profile getinfo(@PathVariable Long id) {
		return profileService.getdatabyId(id);
	}

	@RequestMapping(value = "/addlogininfo", method = RequestMethod.POST)
	public void addLoginInfo(@RequestBody Profile profile) {

		profileService.save(profile);

		MultipartFile profileimage = profile.getProfileimage();

		try {
			profileService.saveImage(profileimage, profile);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error saving photo", e);
		}

	}

}
