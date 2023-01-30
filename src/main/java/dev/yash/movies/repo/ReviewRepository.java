package dev.yash.movies.repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.yash.movies.entities.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId>{
		
}
