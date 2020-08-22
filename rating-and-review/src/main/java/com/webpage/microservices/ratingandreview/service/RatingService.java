package com.webpage.microservices.ratingandreview.service;


import org.springframework.stereotype.Service;

import com.webpage.microservices.ratingandreview.domain.RatingandReview;

@Service
public interface RatingService {

	public RatingandReview save(RatingandReview ratingandReview);
	
	public RatingandReview getdatabyId(Long id);
	
	public RatingandReview updateRatingandReview(RatingandReview ratingandReview);

}
