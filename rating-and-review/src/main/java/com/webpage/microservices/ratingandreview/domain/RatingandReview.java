package com.webpage.microservices.ratingandreview.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RatingandReview {

	@Id
	private Long ratingId;
	private int rating;
	private String review;
	
	public RatingandReview() {}

	public RatingandReview(Long ratingId, int rating, String review) {
		super();
		this.ratingId = ratingId;
		this.rating = rating;
		this.review = review;
	}

	public Long getRatingId() {
		return ratingId;
	}

	public void setRatingId(Long ratingId) {
		this.ratingId = ratingId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

}