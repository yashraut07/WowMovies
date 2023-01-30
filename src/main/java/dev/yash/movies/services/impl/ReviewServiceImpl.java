package dev.yash.movies.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import dev.yash.movies.entities.Movie;
import dev.yash.movies.entities.Review;
import dev.yash.movies.repo.ReviewRepository;
import dev.yash.movies.services.ReviewService;

@Service
public class ReviewServiceImpl implements ReviewService{
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public Review createReview(String reviewBody, String imdbId) {
		
		Review review = reviewRepository.insert(new Review(reviewBody));
		
		mongoTemplate.update(Movie.class)
							.matching(Criteria.where("imdbId").is(imdbId))
							.apply(new Update().push("reviews").value(review))
							.first();
		
		return review;
	}

}
