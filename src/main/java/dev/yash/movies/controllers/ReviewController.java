package dev.yash.movies.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.yash.movies.entities.Review;
import dev.yash.movies.services.impl.ReviewServiceImpl;

@RestController
@RequestMapping("/api/v1/reviews")
@CrossOrigin
public class ReviewController {
				
			@Autowired
			private ReviewServiceImpl reviewServiceImpl;
			
			@PostMapping()
			public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload){
				return new ResponseEntity<Review>(reviewServiceImpl.createReview(payload.get("reviewBody"), payload.get("imdbId")),HttpStatus.CREATED);
			}
}
