package dev.yash.movies.repo;


import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.yash.movies.entities.Movie;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId>{
			 Optional<Movie> findByImdbId(String imdbId);
}
