package org.nbk.movies.controller;

import org.nbk.movies.domain.Movie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviesController {
    
    public static final Logger LOGGER = LoggerFactory.getLogger(MoviesController.class);

	@GetMapping(value="api/v1/movies", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Movie> getMovies(){
	    
	    LOGGER.info("get Movie");
	    
		Movie movie = new Movie();
		movie.setMovieName("3Idiots :P");
		
		return ResponseEntity.ok(movie);
		
	}
	
	
	
}
