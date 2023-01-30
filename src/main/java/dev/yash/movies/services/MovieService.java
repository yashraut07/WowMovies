package dev.yash.movies.services;

import java.util.List;
import java.util.Optional;

import dev.yash.movies.entities.Movie;

public interface MovieService {
	public List<Movie> allMovies();
	public Optional<Movie> getMovieByImdbId(String imdbId);
}
