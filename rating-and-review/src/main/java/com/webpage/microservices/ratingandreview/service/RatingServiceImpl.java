package com.webpage.microservices.ratingandreview.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webpage.microservices.ratingandreview.domain.RatingandReview;
import com.webpage.microservices.ratingandreview.repository.RatingRepository;


@Service
public class RatingServiceImpl implements RatingService{

	@Autowired
	RatingRepository ratingRepository;
	
	
	
	@Override
	public RatingandReview save(RatingandReview ratingandReview) {
		return ratingRepository.save(ratingandReview);
	}

	@Override
	public RatingandReview getdatabyId(Long id) {
		return ratingRepository.findById(id).orElse(null);
	}

	@Override
	public RatingandReview updateRatingandReview(RatingandReview ratingandReview) {
		RatingandReview existingRatingandReview = ratingRepository.findById(ratingandReview.getRatingId()).orElse(null);
		
		existingRatingandReview.setRating(ratingandReview.getRating());
		existingRatingandReview.setReview(ratingandReview.getReview());
		
		return ratingRepository.save(existingRatingandReview);
	}
	
	
	


}
