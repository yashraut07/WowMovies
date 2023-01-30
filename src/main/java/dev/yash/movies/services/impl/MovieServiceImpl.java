package dev.yash.movies.services.impl;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.yash.movies.entities.Movie;
import dev.yash.movies.repo.MovieRepository;
import dev.yash.movies.services.MovieService;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	private MovieRepository movieRepository;
		
	@Override
	public List<Movie> allMovies() {
		
		return movieRepository.findAll();
	}
	
	
	@Override
	public Optional<Movie> getMovieByImdbId(String imdbId) {
		// TODO Auto-generated method stub
		return movieRepository.findByImdbId( imdbId);
	}



	



	
}
