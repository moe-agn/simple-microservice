package com.webpage.microservices.ratingandreview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webpage.microservices.ratingandreview.domain.RatingandReview;
import com.webpage.microservices.ratingandreview.service.RatingService;

@RestController
public class RatingController {
	
	@Autowired
	private RatingService ratingService;
	
	@RequestMapping("/ratingandreviewinfo/id/{id}")
	public RatingandReview getinfo(@PathVariable Long id) {
		return ratingService.getdatabyId(id);
	}
	
	@RequestMapping(value="/addratingandreview", method = RequestMethod.POST)
	public void addLoginInfo(@RequestBody RatingandReview ratingandReview) {
		ratingService.save(ratingandReview);
	}
	
	@RequestMapping(value= "/updateratingandreview", method = RequestMethod.PUT)
	public RatingandReview updateRatingandReview(@RequestBody RatingandReview ratingandReview) {
		return ratingService.updateRatingandReview(ratingandReview);
	}

}
