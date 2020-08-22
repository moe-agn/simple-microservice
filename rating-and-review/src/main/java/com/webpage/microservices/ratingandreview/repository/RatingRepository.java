package com.webpage.microservices.ratingandreview.repository;


import org.springframework.data.repository.CrudRepository;

import com.webpage.microservices.ratingandreview.domain.RatingandReview;

public interface RatingRepository extends CrudRepository<RatingandReview, Long> {
	

}
