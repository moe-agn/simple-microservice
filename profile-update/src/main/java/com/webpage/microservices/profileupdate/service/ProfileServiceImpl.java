package com.webpage.microservices.profileupdate.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.webpage.microservices.profileupdate.domain.Profile;
import com.webpage.microservices.profileupdate.repository.ProfileRepository;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	ProfileRepository profileRepository;

	@Override
	public Profile save(Profile profile) {

		return profileRepository.save(profile);
	}

	@Override
	public Profile getdatabyId(Long id) {

		return profileRepository.findById(id).orElse(null);
	}

	@Override
	public void saveImage(MultipartFile profileimage, Profile profile) throws Exception {

		String name = profile.getProfileId() + ".png";
		byte[] bytes = profileimage.getBytes();

		BufferedOutputStream stream = new BufferedOutputStream(
				new FileOutputStream(new File("src/main/resources/static/image/profilePic/" + name)));

		stream.write(bytes);
		stream.close();

	}

}
