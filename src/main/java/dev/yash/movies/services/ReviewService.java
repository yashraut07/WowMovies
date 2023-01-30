package dev.yash.movies.services;

import dev.yash.movies.entities.Review;

public interface ReviewService {
		
	public Review createReview(String reviewBody, String imdbId);
}
