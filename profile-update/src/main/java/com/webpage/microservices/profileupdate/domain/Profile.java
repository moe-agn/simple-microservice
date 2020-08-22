package com.webpage.microservices.profileupdate.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Profile {

	@Id
	private Long profileId;
	private String name;
	private String mobileNo;
	private String address;
	private MultipartFile profileimage;

	public Profile() {
	}

	public Profile(Long profileId, String name, String mobileNo, String address, MultipartFile profileimage) {
		super();
		this.profileId = profileId;
		this.name = name;
		this.mobileNo = mobileNo;
		this.address = address;
		this.profileimage = profileimage;
	}

	public Long getProfileId() {
		return profileId;
	}

	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public MultipartFile getProfileimage() {
		return profileimage;
	}

	public void setProfileimage(MultipartFile profileimage) {
		this.profileimage = profileimage;
	}
	
}